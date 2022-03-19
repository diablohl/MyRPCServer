package com.hl.rpc;

import lombok.Data;

/**
 * RPC返回信息
 */

@Data
public class Response {
    private int code=0; //0-成功 非0失败
    private String message="ok";
    private Object data;
}
