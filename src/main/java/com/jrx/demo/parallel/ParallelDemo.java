package com.jrx.demo.parallel;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 并行数组
 * parallelSetAll方法和parallelSort方法
 *
 * @Author: sunchuanyin
 * @Date: 2019/3/19 0:20
 * @Version 1.0
 */
public class ParallelDemo {

    public static void main(String[] args) {

        long[] longs = new long[2000];
        // parallelSetAll方法生成随机数
        Arrays.parallelSetAll(longs, index -> ThreadLocalRandom.current().nextInt(1000000));
        for (long index : longs) {
            System.out.println(index);
        }

        // 对随机数排序
        Arrays.parallelSort(longs);
        for (long index : longs) {
            System.out.println(index);
        }
    }
}
