package com.jrx.demo.lambda;

/**
 * Lambda表达式
 *      使用前提：必须要有接口，且只能有一个抽象方法。上下文推导
 *      使用方式：1、变量接收   2、当做参数
 *      Lambda的省略原则：
 *             1：方法体中只有一句代码，方法体的花括号可以省略、return关键字可以省略
 *             2：参数的类型可以省略
 *
 * @Author: sunchuanyin
 * @Date: 2019/3/18 16:27
 * @Version 1.0
 */
public class LambdaDemo {

    public static void main(String[] args) {
        // 变量接收
        Eatable eat = () -> System.out.println("吃饭了");
        eat.eat();

        // 当做参数
        eatMill(() -> System.out.println("吃饭了"));

    }

    public static void eatMill(Eatable eat) {
        eat.eat();
    }
}
