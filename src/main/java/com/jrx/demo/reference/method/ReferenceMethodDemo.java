package com.jrx.demo.reference.method;

/**
 * 方法引用和Lambda表达式的联合使用
 * 目的：解决Lambda表达式中重复的逻辑
 * 1、对象引用成员方法
 * 2、类名引用静态方法
 * 3、this引用本类方法
 * 4、super引用父类方法
 * 5、构造方法引用    创建对象
 *
 * @Author: sunchuanyin
 * @Date: 2019/3/18 17:50
 * @Version 1.0
 */
public class ReferenceMethodDemo {

    public static void main(String[] args) {


        Traverse traverse = new Traverse();
        // 对象引用成员方法
        print(traverse::traverse);
        // 引用静态方法
        print(Traverse::compare);
        // super和this方法引用
        Dog dog = new Dog();
        dog.play();
        // 构造方法引用
        create(Person::new);


    }

    public static void print(ReferenceMethod referenceMethod) {
        referenceMethod.print("hello");
    }

    public static void create(CreatePersonable createPerson) {
        Person person = createPerson.create("小红", 22);
        System.out.println(person);
    }

}
