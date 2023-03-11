package com.atguigu02.memory;

/**
 * Perosn类对应的测试类
 *
 * @author 尚硅谷-宋红康
 * @create 14:38
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.name="黄";
        p1.age=16;
        p1.gender='男';
        p1.eat();
        p1.sleep(4);
    }
}
