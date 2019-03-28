package com.jrx.text;

import com.jrx.second.entity.Student;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * 学生排序
 *
 * @Author: sunchuanyin
 * @Date: 2019/3/25 22:20
 * @Version 1.0
 */
public class StudentSortTest {

    @Test
    public void sortTest() {

        // 创建Student实例
        Student student1 = new Student(89.0, 18, "男", "一年级", "小华");
        Student student2 = new Student(89.0, 18, "女", "二年级", "小红");
        Student student3 = new Student(59.0, 18, "男", "三年级", "小梦");
        Student student4 = new Student(49.0, 18, "女", "四年级", "小花");
        Student student5 = new Student(99.0, 18, "男", "五年级", "小李");
        Student student6 = new Student(69.0, 18, "女", "六年级", "小兰");
        // 创建ArrayList集合
        ArrayList<Student> studentList = new ArrayList<>();
        // 将学生实例添加到集合中
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);

        /**
         * 排序
         *      先根据学生的分数从高到低排序，如果分数相等，那么根据学生的年级从高到低排序
         *      根据学生的年级排序，我是根据年级的hashCode值进行排序的
         */
        studentList.sort((student11, student21) -> (int) (student21.getScore() - student11.getScore()) == 0 ? (student21.getGrade().hashCode()
                - student11.getGrade().hashCode()) : (int) (student21.getScore() - student11.getScore()));
        // 遍历studentList集合
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
