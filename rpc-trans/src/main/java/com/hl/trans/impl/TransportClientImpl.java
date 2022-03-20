package com.hl.trans.impl;

import com.hl.rpc.Peer;
import com.hl.trans.TransportClient;

import java.io.InputStream;

public class TransportClientImpl implements TransportClient {
    /**
     * 连接端口
     *
     * @param peer
     */
    @Override
    public void connect(Peer peer) {

    }

    @Override
    public InputStream write(InputStream inputStream) {
        return null;
    }

    @Override
    public void close() {

    }
}
