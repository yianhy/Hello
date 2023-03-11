package com.atguigu01._this.exer2;

/**
 * ClassName: Account
 * Package: com.atguigu01._this.exer2
 * Description:
 *
 * @Author 黄洋
 * @Create 2023/3/11 0:31
 * @Version 1.0
 */
public class Account {
    private double balance;
    public Account(double balance){
        this.balance=balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt){
        balance+=amt;
    }

    public void withdraw(double amt){
        if (balance>=amt){
            balance-=amt;
        }else {
            System.out.println("你的余额不足");
        }
    }
}
