package com.jrx.demo.date;

import java.time.LocalTime;

/**
 * LocalTime使用
 *
 * @Author: sunchuanyin
 * @Date: 2019/3/18 23:50
 * @Version 1.0
 */
public class LocalTimeDemo {

    public static void main(String[] args) {

        // 获得当前时间,包含毫秒数
        LocalTime now = LocalTime.now();
        System.out.println(now.toString());

        // 字符串转为时间
        LocalTime parseLocalTime = LocalTime.parse("23:52:13");
        System.out.println(parseLocalTime.toString());
    }
}
