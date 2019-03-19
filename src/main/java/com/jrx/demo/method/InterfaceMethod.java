package com.jrx.demo.method;

/**
 * 主要演示jdk8新特性中的默认方法和静态方法
 *      如果一个默认方法存在多个接口中，且一个类同时实现了两个或两个以上的接口，那么必须重写这个默认方法，而静态方法不
 *      需要，因为静态方法是由类名直接调用
 *
 * @Author: sunchuanyin
 * @Date: 2019/3/18 17:37
 * @Version 1.0
 */
public interface InterfaceMethod {

    /**
     * 默认方法
     */
    default void eat() {
        System.out.println("默认吃饭方法");
    }

    /**
     * 静态方法
     */
    static void sleep() {
        System.out.println("静态睡觉方法");
    }
}

