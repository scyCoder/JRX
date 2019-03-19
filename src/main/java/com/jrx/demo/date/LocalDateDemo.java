package com.jrx.demo.date;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * LocalDate的使用
 *
 * @Author: sunchuanyin
 * @Date: 2019/3/18 23:30
 * @Version 1.0
 */
public class LocalDateDemo {

    public static void main(String[] args) {

        // 获得当前时间
        LocalDate now = LocalDate.now();
        System.out.println(now.toString());

        // 指定时间
        LocalDate date = LocalDate.of(2018, 3, 12);
        System.out.println(date.toString());

        // 获取本月第一天日期
        LocalDate firstDayOfCurrentMonth = now.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(firstDayOfCurrentMonth.toString());

        // 获取本月第二天日期
        LocalDate secondDayOfCurrentMonth = now.withDayOfMonth(2);
        System.out.println(secondDayOfCurrentMonth.toString());

        // 获取本月第三天日期
        LocalDate lastDayOfCurrentMonth = now.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(lastDayOfCurrentMonth.toString());

    }
}
