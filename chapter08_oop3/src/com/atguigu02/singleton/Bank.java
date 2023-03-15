package com.atguigu02.singleton;

/**
 * @author yian
 * @date 2023/3/13 12:54
 */
public class Bank {
    private static Bank instance=new Bank();

    private Bank() {
    }

    public static Bank getInstance() {
        //return instance;
        if (instance==null){
           instance=new Bank();
        }
        return instance;
    }
}
