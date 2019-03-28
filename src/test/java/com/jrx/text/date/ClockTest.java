package com.jrx.text.date;

import org.junit.Test;

import java.time.Clock;
import java.time.ZoneId;
import java.util.Set;

/**
 * Clock时钟类用于获取当时的时间戳，或 当前时区下的日期信息;
 * Clock是一个抽象类
 *
 * @Author: sunchuanyin
 * @Date: 2019/3/27 14:52
 * @Version 1.0
 */
public class ClockTest {

    @Test
    public void clockTest() {


        //  获得当前的时钟，使用UTC时区转换日期和时间
        Clock clock = Clock.systemUTC();
        System.out.println("获得UTC时区的时钟是：" + clock);
        // 获取当前时钟的毫秒数
        long millis = clock.millis();
        System.out.println("当前时钟的毫秒数是：" + millis);

        // 获得默认系统默认时区的时钟
        Clock defaultZone = Clock.systemDefaultZone();
        System.out.println("获得的默认时区的时钟是：" + defaultZone);

        // 创建一个时区ID
        ZoneId zoneId = ZoneId.of("Asia/Hong_Kong");
        // 根据指定的时区Id,获得时钟
        Clock system = Clock.system(zoneId);
        System.out.println("根据指定的时区ID获得的时钟为：" + system);
    }
}
