package com.hl.trans.impl;

import com.hl.rpc.Peer;
import com.hl.trans.TransportClient;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class TransportClientImpl implements TransportClient {
    private String url;
    /**
     * 连接端口
     *
     * @param peer
     */
    @Override
    public void connect(Peer peer) {
        //短链接
        this.url = "http://" + peer.getHost() + ":" + peer.getPort();
    }

    @Override
    public InputStream write(InputStream inputStream) {
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setUseCaches(true);
            connection.setRequestMethod("POST");

            connection.connect();
            //连接完成后要把数据发送给server
            IOUtils.copy(inputStream, connection.getOutputStream());
            int code = connection.getResponseCode();
            if (code == HttpURLConnection.HTTP_OK) {
                return connection.getInputStream();
            } else {
                return connection.getErrorStream();
            }

        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override
    public void close() {

    }
}
