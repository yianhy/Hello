package com.atguigu05._super.exer3;

/**
 * ClassName: Account
 * Package: com.atguigu05._super.exer3
 * Description:
 *
 * @Author 黄洋
 * @Create 2023/3/11 11:56
 * @Version 1.0
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account() {
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterest(){
        return annualInterestRate/12;
    }
    public void withdraw(double amount){
        if (amount>=0){
            balance+=amount;
        }else {
            System.out.println("你输入的金额有误");
        }
    }

    public void deposit(double amount){
        if (amount>=0&&amount<=balance){
            balance-=amount;
        }else {
            System.out.println("你输入的金额有误");
        }
    }
}
