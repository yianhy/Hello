package com.atguigu04.example.exer1;


/**
 * ClassName: PersonTest
 * Package: com.atguigu04.example.exer1
 * Description:
 *
 * @Author 黄洋
 * @Create 2023/3/10 21:18
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.age=11;
        p1.name="zhaoxiao";
        System.out.println(p1.showAge());
        p1.addAge(2);
        System.out.println(p1.showAge());
    }
}
