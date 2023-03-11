package com.atguigu04.example.exer1;

/**
 * ClassName: Person
 * Package: com.atguigu04.example.exer1
 * Description:
 *
 * @Author 黄洋
 * @Create 2023/3/10 21:15
 * @Version 1.0
 */
public class Person {
    String name;
    int age;
     char gender;

     public void study(){
         System.out.println("studying");
     }
     public int showAge(){
         return age;
     }

     public void addAge(int addAge){
         age+=addAge;
     }
}
