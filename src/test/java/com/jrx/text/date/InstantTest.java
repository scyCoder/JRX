package com.jrx.text.date;

import org.junit.Test;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

/**
 * 测试Instant时间戳
 *
 * @Author: sunchuanyin
 * @Date: 2019/3/26 9:38
 * @Version 1.0
 */
public class InstantTest {


    /**
     * 获得当前时间;
     * 直接有Instant.now()获得时间不是北京时间。是因为使用的是UTC时间 ，所以需要
     * 在获得的时间的基础上加上8个小时;
     * Instant时间是便于机器使用的
     */
    @Test
    public void getInstantTest() {

        // 获得北京时间
        Instant now = Instant.now().plusMillis(TimeUnit.HOURS.toMillis(8));
        System.out.println("当前时间为：" + now);

        // 获得当前的时间秒数
        long epochSecond = now.getEpochSecond();
        System.out.println("当前时间的秒数为：" + epochSecond);

        // 获得当前时间的毫秒数
        long toEpochMilli = now.toEpochMilli();
        System.out.println("当前时间的毫秒数为：" + toEpochMilli);

        /**
         * 获得指定一个时间的Instant实例
         * ofEpochSecond方法两个参数：
         *     epochSecond：表示秒数
         *     nanoAdjustment：表示毫秒数，但是在这个方法中，把这个毫秒转成了秒数，然后经过底层判断输入时的值是否正确
         */

        Instant instant = Instant.ofEpochSecond(1553577055L, 1553577055990L)
                .plusMillis(TimeUnit.HOURS.toMillis(8));
        System.out.println("指定的时间为：" + instant);

        // 通过秒数获得指定的时间
        Instant instantFromSecond = Instant.ofEpochSecond(1553606847L);
        System.out.println("指定的时间为：" + instantFromSecond);
        
        // 比较两个时间   使用compareTo方法
        int result = now.compareTo(instantFromSecond);
        if (result == 0) {
            System.out.println("now与instantFromSecond的时间相等");
        }
        if(result > 0) {
            System.out.println("now时间大于instantFromSecond的时间");
        } else {
            System.out.println("now时间小于instantFromSecond的时间");
        }


        // 判断当前时间在指定时间的位置
        boolean after = now.isAfter(instantFromSecond);
        System.out.println("当前时间在指定时间的后面？" + after);
        boolean before = now.isBefore(instantFromSecond);
        System.out.println("当前时间在指定时间的前面？" + before);

    }
}
