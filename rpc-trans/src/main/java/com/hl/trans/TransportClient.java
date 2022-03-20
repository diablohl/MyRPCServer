package com.hl.trans;


import com.hl.rpc.Peer;

import java.io.InputStream;

/**
 * 1、创建链接
 * 2、发送数据 等待响应
 * 3、关闭连接
 */
public interface TransportClient {
    /**
     * 连接端口
     * @param peer
     */
    void connect(Peer peer);

    InputStream write(InputStream inputStream);

    void close();
}
