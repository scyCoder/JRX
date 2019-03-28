package com.jrx.text;

import org.junit.Test;

/**
 * 测试内部类访问外部类成员变量
 *
 * @Author: sunchuanyin
 * @Date: 2019/3/25 20:33
 * @Version 1.0
 */
public class InnerDemoTest {

    // 外部成员变量
    private Integer numberOne = 10;
    // 静态外部成员变量
    private static Integer numberTwo = 20;

    /**
     * 创建内部类
     */
    public class InnerOne {

        public String str = "hello";

        /**
         * 访问外部类成员变量
         */
        public void assessDataFromOutter() {

            System.out.println("访问InnerOne中的成员变量str = " + str);
            // 反编译：System.out.println(InnerDemoTes.this.numberOne)
            System.out.println("访问InnerDemoTest中的静态成员变量number = " + numberOne);
        }
    }

    /**
     * 创建静态内部类
     */
    public static class InnerTwo {

        public String str = "world";

        public void assessDataFromOutter() {
            System.out.println("访问InnerTwo中的成员变量str = " + str);
            System.out.println("访问InnerDemoTest中的成员变量numberTwo = " + numberTwo);
        }
    }

    /**
     * 测试内部类InnerOne访问外部类InnerDemoTest中的numberOne变量
     */
    @Test
    public void getDataFromOutter() {

        // 创建内部类对象
        // InnerOne InnerOne = new InnerOne();
        InnerOne InnerOne = new InnerDemoTest().new InnerOne();
        InnerOne.assessDataFromOutter();
    }

    /**
     * 测试内部类InnerTwo访问外部类InnerDemoTest中的numberTwo变量
     */
    @Test
    public void getStaticDataFromOutter() {
        InnerTwo innerTwo = new InnerTwo();
        innerTwo.assessDataFromOutter();
    }


}
