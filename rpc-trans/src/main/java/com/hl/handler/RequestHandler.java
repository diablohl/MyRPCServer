package com.hl.handler;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * 处理网络请求的handler
 */
public interface RequestHandler {
    void handleRequest(InputStream inputStream, OutputStream outputStream);
}
