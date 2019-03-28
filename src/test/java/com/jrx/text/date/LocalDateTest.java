package com.jrx.text.date;

import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

/**
 * LocalDate时间   只获得日期
 *
 * @Author: sunchuanyin
 * @Date: 2019/3/26 14:18
 * @Version 1.0
 */
public class LocalDateTest {


    @Test
    public void localDateTest() {
        // 获得当前时间,只用日期
        LocalDate now = LocalDate.now();
        System.out.println("当前的时间为：" + now);

        // 格式化指定的时间
        String formatNow = now.format(DateTimeFormatter.ofPattern("yyyy:MM:dd"));
        System.out.println("格式化后的时间为：" + formatNow);

        // 获得本月的第多少天
        int dayNum = now.get(ChronoField.DAY_OF_MONTH);
        System.out.println("当前是本月的第：" + dayNum + "天");

        // 获得本月的第多少天
        int dayOfMonth = now.getDayOfMonth();
        System.out.println("当前是本月的第：" + dayNum + "天");

        // 获得当前日为当年的多少天
        int dayOfYear = now.getDayOfYear();
        System.out.println("当前日为当年的第：" + dayOfYear + "天");

        // 获得年份
        int year = now.get(ChronoField.YEAR);
        System.out.println("当前的年份为：" + year);

        // 获得月份
        int month = now.get(ChronoField.MONTH_OF_YEAR);
        System.out.println("当前的月份是：" + month);

        // 获得当前周是本年的第几周
        int week = now.get(ChronoField.ALIGNED_WEEK_OF_YEAR);
        System.out.println("当前周是本年的第：" + week + "周");

        // 解析日期  指定的日期格式只能使用"-"连接符
        LocalDate parseDate = LocalDate.parse("2017-12-22");
        System.out.println(parseDate);

        // 获得本月共用多少天
        int totalDay = now.lengthOfMonth();
        System.out.println("当前月共有：" + totalDay + "天");

        // 获得本年的天数
        int totalYear = now.lengthOfYear();
        System.out.println("当前年共有："  + totalYear + "天");

        // 获得本月的第一天日期
        LocalDate firstDateOfCurrentMonth = now.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("本月第一天的日期为：" +firstDateOfCurrentMonth);

        // 判断是否是闰年
        boolean isLeapYear = now.isLeapYear();
        System.out.println("当前日期是否是闰年：" + isLeapYear);
    }
}
