package com.jrx.text;

import com.jrx.second.Workable;
import org.junit.Test;

/**
 * 测试匿名内部类
 *
 * @Author: sunchuanyin
 * @Date: 2019/3/25 21:34
 * @Version 1.0
 */
public class AnonymousDemoTest {

    /**
     * 测试
     */
    @Test
    public void work() {

        /**
         * 创建内部类
         */
        new Workable() {
            @Override
            public void work() {
                System.out.println("我要工作了");
            }
        }.work();
    }

    /**
     * 匿名内部类作为参数
     *
     * @param workable
     */
    public void toWork(Workable workable) {
        workable.work();
    }

    /**
     * 测试匿名内部类作为参数
     */
    @Test
    public void testToWork() {
        toWork(new Workable() {
            @Override
            public void work() {
                System.out.println("工作工作！！！！");
            }
        });
    }
}