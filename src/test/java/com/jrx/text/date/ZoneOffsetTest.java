package com.jrx.text.date;

import org.junit.Test;

import java.time.ZoneOffset;
import java.time.zone.ZoneRules;

/**
 * ZoneOffset时区类,通过时期类，可以创建时区日期类
 *
 * @Author: sunchuanyin
 * @Date: 2019/3/26 16:21
 * @Version 1.0
 */
public class ZoneOffsetTest {

    @Test
    public void zoneOffsetTest() {

        // 创建一个时区，类似的方法有of...,可以使用小时、分钟、秒数来创建时区
        ZoneOffset zoneOffset = ZoneOffset.of("+09:00");
        // 获取时区的偏移id
        String id = zoneOffset.getId();
        System.out.println("获取时区 的偏移id=" + id);

        // 获取时区规则
        ZoneRules rules = zoneOffset.getRules();
        System.out.println("获取时区规则：" + rules);

        int totalSeconds = zoneOffset.getTotalSeconds();
        System.out.println("获取总区域偏移量：" + totalSeconds);


    }
}
