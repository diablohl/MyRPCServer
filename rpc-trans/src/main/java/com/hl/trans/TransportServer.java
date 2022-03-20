package com.hl.trans;

import com.hl.handler.RequestHandler;

/**
 * 1、启动并监听端口
 * 2、接受请求
 * 3、关闭监听
 */
public interface TransportServer {
    /**
     * 接受的只是一个数据流，需要抽象成handler
     */
    void init(int port, RequestHandler handler);

    void start();




    void close();
}
