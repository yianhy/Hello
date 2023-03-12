package com.atguigu06.polymorphism.interview;

public class PersonTest {
    public static void main(String[] args) {
        Person p1=new Person();
        Man m1=new Man();

        //多态性
        Person p2=new Man();
        p2.sleep();
        p2.eat();
    }
}
