package com.atguigu06.polymorphism.interview;

public class Woman extends Person{
    public boolean isBeauty;
    public void eat(){
        System.out.println("女人注意减肥");
    }
    public void sleep(){
        System.out.println("女人要睡好觉");
    }

    public void walk(){
        System.out.println("女人窈窕的走路");
    }
}
