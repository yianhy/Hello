package com.atguigu08.constructor.exer3;

/**
 * @author yian
 * @date 2023/3/14 22:53
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer c1=new Customer("huang","yang");
        c1.setAccount(new Account(111,10,0.1));
        c1.getAccount().withdraw(19);
        c1.getAccount().deposit(111.11);

    }
}
