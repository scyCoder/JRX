package com.jrx.text;

import com.jrx.second.entity.Student;
import org.junit.Test;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @Author: sunchuanyin
 * @Date: 2019/3/25 23:32
 * @Version 1.0
 */
public class LambdaTest {

    @Test
    public void lambdaTest() {
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
        Stream<Student> stream = studentList.stream();
        Stream<Student> studentStream = stream.filter(student -> student.getScore() < 60.0);
        // 定义一个局部变量，用来接收学生的总分数
        double totalScore = 0;
        // 将studentStream流转换成数组
        Object[] students = studentStream.toArray();
        for (Object student : students) {
            Student s = (Student) student;
            totalScore = totalScore + ((Student) student).getScore();
        }
        System.out.println("当前学生的总分数为：" + totalScore);
        System.out.println("当前学生的平均分数为：" + totalScore / students.length);

    }
}
