package com.atguigu01._static.exer1;

/**
 * @author yian
 * @date 2023/3/15 21:28
 */
public class Account {
    private int id;
    private String password;
    private double balance;
    private static int init=100001;
    private static String initPassword="88888888";

    public Account() {
        id=init++;
        password=initPassword;
    }

    public Account(String password) {
        id=init++;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }

    public static int getInit() {
        return init;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
