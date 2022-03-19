package com.hl.coderz.impl;

import com.alibaba.fastjson.JSON;
import com.hl.coderz.Encoder;

/**
 * 基于fastjson
 */
public class EncoderImpl implements Encoder {
    @Override
    public byte[] encode(Object object) {
        return JSON.toJSONBytes(object);
    }
}
