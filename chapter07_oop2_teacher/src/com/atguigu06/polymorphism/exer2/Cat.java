package com.atguigu06.polymorphism.exer2;

/**
 * @author yian
 * @date 2023/3/12 20:50
 */

class Cat extends Animal{
    public void eat(){
        System.out.println("猫吃鱼");
    }

    public void jump(){
        System.out.println("猫跳~~");
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}

