package com.jrx.demo.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * 获得流的方式：
 * Collection集合获得：
 * 通过集合的stream方法获得
 * Map获得(间接获得)：
 * key获得
 * values获得
 * entrySet获得
 * 数组获得：
 * 通过Stream的静态of方法获得
 * 通过Arrays的静态stream方法
 * Stream中的方法：
 * filter   过滤
 * skip     跳过
 * map     映射
 * count   统计
 * limit   限制最大数
 * concat  合并流
 * forEach 遍历流
 * 以Stream流的方式遍历集合
 *
 * @Author: sunchuanyin
 * @Date: 2019/3/18 17:21
 * @Version 1.0
 */
public class StreamDemo {

    public static void main(String[] args) {

        // 定义一个集合
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("一");
        arrayList.add("二");
        arrayList.add("一三");
        arrayList.add("一四");
        arrayList.add("一五");
        // 将ArrayList集合转换为Stream对象
        Stream<String> stream = arrayList.stream();

        // 通过Stream遍历ArrayList集合
        stream.
                filter(string -> string.contains("一")).
                skip(2).
                forEach(string -> System.out.println(string));

        /*统计
        long count = stream.count();
        System.out.println(count);*/
    }
}
