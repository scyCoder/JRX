package com.jrx.text;

import org.junit.Test;

import java.io.File;

/**
 * @Author: sunchuanyin
 * @Date: 2019/3/25 23:00
 * @Version 1.0
 */
public class FileTest {

    // 定义一个全局变量，用来统计文件的个数
    private Integer count = 0;

    /**
     * 判断一个文件是否存在
     */
    @Test
    public void isExist() {
        File file = new File("H:\\a\\d.txt");
        boolean isExist = file.exists();
        System.out.println("d.txt文件是否存在？" + isExist);
    }

    /**
     * 测试文件中的所有文件个数
     */
    @Test
    public void countFile() {
        File file = new File("H:\\a");
        System.out.println(file.isDirectory());
        count(file);
        System.out.println("H:\\a文件夹中的文件个数有：" + count);
    }

    /**
     * 统计文件夹中的文件个数
     *
     * @param file
     */
    public void count(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()) {
                count++;
            } else if (file1.isDirectory()) {
                count(file1);
            }
        }
    }
}
