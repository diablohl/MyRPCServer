package com.hl.coderz;

/**
 * 反序列化
 * 二进制数组转为对象
 */
public interface Decoder {

    /**
     * 返回泛型，省去定义强转Object
     * @param bytes
     * @param tClasszz
     * @param <T>
     * @return
     */
    <T> T decode(byte[] bytes,Class<T> tClasszz);
}
