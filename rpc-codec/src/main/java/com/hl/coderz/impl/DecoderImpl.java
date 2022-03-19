package com.hl.coderz.impl;

import com.alibaba.fastjson.JSON;
import com.hl.coderz.Decoder;

public class DecoderImpl implements Decoder {
    /**
     * 返回泛型，省去定义强转Object
     *
     * @param bytes
     * @param tClasszz
     * @return
     */
    @Override
    public <T> T decode(byte[] bytes, Class<T> tClasszz) {
        return JSON.parseObject(bytes,tClasszz);
    }
}
