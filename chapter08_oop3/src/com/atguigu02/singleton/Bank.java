package com.atguigu02.singleton;

/**
 * @author yian
 * @date 2023/3/13 12:54
 */
public class Bank {

    //2 建立对象
    //4 static建立对象属性
    private static Bank instance =new Bank();

    //1 建立私有构造器
    private Bank() {
    }

    //3 建立get函数

    public static Bank getInstance() {
        return instance;
    }
}
