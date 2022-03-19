package com.hl.rpc;

/*
表示网络通信端点的类
 */

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Peer {
    private String host;
    private  int port;
}
