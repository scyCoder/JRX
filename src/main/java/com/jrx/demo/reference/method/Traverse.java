package com.jrx.demo.reference.method;

/**
 * 遍历
 *
 * @Author: sunchuanyin
 * @Date: 2019/3/18 22:00
 * @Version 1.0
 */
public class Traverse {

    /**
     * 遍历字符串的每一个字符
     *
     * @param string
     */
    public void traverse(String string) {
        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }
    }

    /**
     * 静态方法
     * @param string
     */
    public static void compare(String string) {
        System.out.println("hello".equals(string));
    }
}
