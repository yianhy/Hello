package com.atguigu01._this.exer1;

/**
 * ClassName: Boy
 * Package: com.atguigu01._this.exer1
 * Description:
 *
 * @Author 黄洋
 * @Create 2023/3/11 0:21
 * @Version 1.0
 */
public class Boy {
    private  String name;
    private  int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void marry(Girl girl){
        System.out.println("我要娶:"+girl.getName());

    }
    public void shout(){

    }
}
