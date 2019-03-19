package com.jrx.demo.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * LocalDateTime的使用
 *
 * @Author: sunchuanyin
 * @Date: 2019/3/18 23:54
 * @Version 1.0
 */
public class LocalDateTimeDemo {

    public static void main(String[] args) {

        // 获取当前时间的年月日时分秒
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.toString());

        // 格式化指定的时间
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String formatLocalDateTime = dateTimeFormatter.format(now);
        System.out.println(formatLocalDateTime);
    }
}
