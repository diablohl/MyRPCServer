package com.hl.coderz;

/**
 * 序列化
 * 对象转为二进制数组
 */
public interface Encoder {
    byte[] encode(Object object);
}
