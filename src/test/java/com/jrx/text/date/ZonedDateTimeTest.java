package com.jrx.text.date;

import org.junit.Test;

import java.time.ZonedDateTime;

/**
 * ZonedDateTime用来表示带时区的日期，可以用来表示一个真实的开始时间，如果给定了值，那么不允许改变
 *
 * @Author: sunchuanyin
 * @Date: 2019/3/26 17:17
 * @Version 1.0
 */
public class ZonedDateTimeTest {

    @Test
    public void zonedDateTimeTest() {

        // 创建一个ZonedDateTime实例
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("获 得的当前的ZondDateTime时间为：" + now);

        // 获得年
        int year = now.getYear();
        System.out.println("当前年为：" + year);

        // 获得月
        int monthValue = now.getMonthValue();
        System.out.println("当前的月份是：" + monthValue + "月");
        // 获得日
        int dayOfMonth = now.getDayOfMonth();
        System.out.println("当前日是：" + dayOfMonth);

        // 获得小时
        int hour = now.getHour();
        System.out.println("当前的小时为：" + hour);

        // 获得分钟
        int minute = now.getMinute();
        System.out.println("当前的分钟为：" + minute);

        // 获得当前秒
        int second = now.getSecond();
        System.out.println("当前的秒数为：" + second);

        // 为当前月加一，类似的方法有增加年、日、小时、分钟、秒等
        ZonedDateTime plusZonedDateTime = now.plusMonths(1L);
        System.out.println("增加一月后的日期为：" + plusZonedDateTime);

        // 为当前月减一，类似的方法有减少年、日、小时、分钟、秒等
        ZonedDateTime minusZonedDateTime = now.minusMonths(1);
        System.out.println("减少一月的日期是：" + minusZonedDateTime);
    }
}

