package com.jrx.demo.lambda;

/**
 * 又参和又返回值的Lambda表达式
 * @Author: sunchuanyin
 * @Date: 2019/3/18 21:00
 * @Version 1.0
 */
public class SumDemo {

    public static void main(String[] args) {

        sum((a,b) -> a + b);
    }

    private static void sum(Sumable sumable) {
        int sum = sumable.sum(2, 3);
        System.out.println(sum);
    }
}
