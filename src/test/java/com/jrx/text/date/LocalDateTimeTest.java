package com.jrx.text.date;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * LocalDateTime日期时间类，获得的是日期和时间
 *
 * @Author: sunchuanyin
 * @Date: 2019/3/26 15:23
 * @Version 1.0
 */
public class LocalDateTimeTest {

    @Test
    public void localDateTiemTest() {

        // 获得当前的日期
        LocalDateTime now = LocalDateTime.now();
        System.out.println("当前的日期为：" + now);

        // 格式化当前日期
        String formatNow = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SSS"));
        System.out.println("格式化的日期为：" + formatNow);

        // 获得年份
        int year = now.getYear();
        System.out.println("当前的月份为：" + year);
        // 获得当年的第几月份
        int monthValue = now.getMonthValue();
        System.out.println("本月是当年的第" + monthValue + "月");

        // 获得本月的第几日
        int dayOfMonth = now.getDayOfMonth();
        System.out.println("当前日是本月的第：" + dayOfMonth + "日");

        // 获得当前日期的小时
        int hour = now.getHour();
        System.out.println("当前的小时位：" + hour);
        // 获得当前日期的分钟
        int minute = now.getMinute();
        System.out.println("当前的分钟数为：" + minute);

        // 获得当前日期的秒数
        int second = now.getSecond();
        System.out.println("当 前日期的秒数为：" + second);

        LocalDateTime parseLocalDateTime = LocalDateTime.parse("2019-03-26T15:55:10.758");
        System.out.println("解析的时间为：" + parseLocalDateTime);

        // 创建指定的时间
        LocalDateTime createLocalDateTime = LocalDateTime.of(2018, 12, 3, 12, 22, 33, 333);
        System.out.println("创建的时间为：" + createLocalDateTime);

        // 更改日期  类似的方法有年、月、日、时、秒、纳秒
        LocalDateTime localDateTime = now.withMinute(22);
        System.out.println("更改分钟后的日期为：" + localDateTime);

    }
}
