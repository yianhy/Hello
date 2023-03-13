package com.atguigu06.polymorphism.exer2;

/**
 * @author yian
 * @date 2023/3/12 20:50
 */

class Dog extends Animal{
    public void eat(){
        System.out.println("狗吃骨头");
    }

    public void jump(){
        System.out.println("狗急跳墙");
    }

    public void watchDoor(){
        System.out.println("狗能看家");
    }
}