package com.jrx.demo.reference.method;

/**
 * super关键字和this关键字方法引用
 *
 * @Author: sunchuanyin
 * @Date: 2019/3/18 22:20
 * @Version 1.0
 */
public class Dog extends Animal {

    @Override
    public void play() {

        methodPlay(super::play);
        methodEat(this::eat);
    }

    public void methodPlay(Playable playable) {
        playable.play();
    }

    private void eat() {
        System.out.println("吃饭了");
    }

    public void methodEat(Eatable eatable) {
        eatable.eat();
    }
}
