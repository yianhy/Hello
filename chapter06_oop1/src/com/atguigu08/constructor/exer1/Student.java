package com.atguigu08.constructor.exer1;

/**
 * @author yian
 * @date 2023/3/14 23:01
 */
public class Student {
    String name;
    int age;
    String school;
    String major;
    public Student(String n,int a){
        name=n;
        age=a;
    }
    public Student(String n,int a,String s){
        name=n;
        age=a;
        school=s;
    }
    public Student(String n,int a,String s,String m){
        name=n;
        age=a;
        school=s;
        major=m;
    }
}
