package com.jrx.demo.base;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * Base64编码和解码
 *
 * @Author: sunchuanyin
 * @Date: 2019/3/19 0:02
 * @Version 1.0
 */
public class Base64Demo {

    public static void main(String[] args) throws UnsupportedEncodingException {

        // 编码
        Base64.Encoder encoder = Base64.getEncoder();
        String stringCode = encoder.encodeToString("hello world".getBytes("utf-8"));
        System.out.println(stringCode);

        // 解码
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] decodeByte = decoder.decode(stringCode);
        System.out.println(new String(decodeByte, "utf-8"));
    }
}
