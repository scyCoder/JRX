package com.jrx.text.date;

import org.junit.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

/**
 * Duration：表示两个Instant之间的时间段;
 * 创建的Duration实例是不可变的
 *
 * @Author: sunchuanyin
 * @Date: 2019/3/26 13:50
 * @Version 1.0
 */
public class DurationTest {

    @Test
    public void durationTest() {

        // 获得一个Instant对象
        Instant instant1 = Instant.now().plusMillis(TimeUnit.HOURS.toMillis(8));
        // 获得第二个Instant对象
        Instant instant2 = Instant.ofEpochSecond(1553606847L);
        // 获得Duration对象
        Duration duration = Duration.between(instant2, instant1);
        System.out.println("得到的时间段为：" + duration);

        // 获得时间段的秒数
        System.out.println("时间段中的秒数为：" + duration.getSeconds());

        // 给当前的时间段增加天数，获得新的时间段
        Duration newDuration = duration.plusDays(3L);
        System.out.println("增加天数的新的时间段的秒数为：" + newDuration.getSeconds());

        // 给当前的时间段减少天数，获得新的时间段
        Duration minuDuration = newDuration.minusDays(3L);
        System.out.println("减少天数的新的时间段的秒数为：" + minuDuration.getSeconds());

        // 获取时间段持续的天数
        long days = newDuration.toDays();
        System.out.println("时间段持续的天数为：" + days);

    }
}
