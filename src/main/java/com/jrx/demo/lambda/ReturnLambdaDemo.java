package com.jrx.demo.lambda;

/**
 * Lambda表达式作为返回值
 *
 * @Author: sunchuanyin
 * @Date: 2019/3/18 21:29
 * @Version 1.0
 */
public class ReturnLambdaDemo {

    public static void main(String[] args) {

        // 接收Lambda表达式
        Sumable sumable = sumable();
        sum(sumable);

    }

    public static void sum(Sumable sumable) {
        int sum = sumable.sum(3, 4);
        System.out.println(sum);
    }

    /**
     * Lambda表达式作为返回值
     *
     * @return
     */
    public static Sumable sumable() {
        return (a, b) -> a + b;
    }
}
