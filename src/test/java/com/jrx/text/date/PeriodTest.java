package com.jrx.text.date;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Period;

/**
 * Period时间段
 *      两个日期之间的时间段
 *
 * @Author: sunchuanyin
 * @Date: 2019/3/26 16:02
 * @Version 1.0
 */
public class PeriodTest {


    @Test
    public void periodTest() {

        LocalDate localDate1 = LocalDate.now();
        System.out.println(localDate1);
        LocalDate localDate2 = LocalDate.of(2017, 4, 27);
        System.out.println(localDate2);
        Period period = Period.between(localDate2, localDate1);

        // 获得时间段中有多少天   这个天数是不足一个月的天数
        int days = period.getDays();
        System.out.println("此时间段中共有：" + days + "天");
        // 获得时间段中共有多少月  这个月数是不足一年的月数
        int months = period.getMonths();
        System.out.println("此时间段中共有：" + months + "月");

        // 获得时间段中共有多 少年
        int years = period.getYears();
        System.out.println("此时间段中共有：" + years + "年");

        // 获得时间段之间的总月数
        long toTotalMonths = period.toTotalMonths();
        System.out.println("此时间段中的总月数为：" + toTotalMonths);

        // 创建一个时间段
        Period createPeriod = Period.of(1, 12, 22);
        System.out.println(createPeriod);

    }
}
