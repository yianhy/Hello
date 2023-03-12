package com.atguigu06.polymorphism.interview;

public class Man extends Person{
    public boolean isSmoking;
    public void eat(){
        System.out.println("男人多吃肉");
    }
    public void sleep(){
        System.out.println("男人少睡觉");
    }
}
