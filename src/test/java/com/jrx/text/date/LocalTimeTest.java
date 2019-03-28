package com.jrx.text.date;

import org.junit.Test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * LocalTime时间类   只获得时间。有毫秒数
 *
 * @Author: sunchuanyin
 * @Date: 2019/3/26 15:01
 * @Version 1.0
 */
public class LocalTimeTest {

    @Test
    public void localtimeTest() {

        // 获得当前时间
        LocalTime now = LocalTime.now();
        System.out.println(now);

        // 获得当前时间的小时
        int hour = now.getHour();
        System.out.println("当前的小时为：" + hour);

        // 获得当前的分钟数
        int minute = now.getMinute();
        System.out.println("当前的分钟数为：" + minute);

        // 获得当前的秒数
        int second = now.getSecond();
        System.out.println("当前的秒数为：" + second);

        // 格式化当前时间
        String formatTime = now.format(DateTimeFormatter.ofPattern("HH/mm"));
        System.out.println("格式化的时间为：" + formatTime);

        // 解析时间 的格式必须是用“:"连接
        LocalTime parseTime = LocalTime.parse("12:30:56");
        System.out.println("解析的时间为：" + parseTime);

        // 创建时间
        LocalTime createTime = LocalTime.of(15, 15, 15, 15);
        System.out.println("创建的指定时间是：" + createTime);

        // 更改当前时间的分钟数   类似的有时间、秒、纳秒
        LocalTime localTime = now.withMinute(32);
        System.out.println("更改分钟后的时间为：" + localTime);

    }
}
