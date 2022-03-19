package com.hl.rpc;

import lombok.Data;

/**
 * 表示RPC的一个请求
 */

@Data
public class Request {
    private ServiceDescriptor serviceDescriptor;  //请求服务对应的类
    private Object[] parameters;
}
