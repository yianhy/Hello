package com.atguigu05._super.exer3;

/**
 * ClassName: CheckAccount
 * Package: com.atguigu05._super.exer3
 * Description:
 *
 * @Author 黄洋
 * @Create 2023/3/11 12:03
 * @Version 1.0
 */
public class CheckAccount extends Account{
    double overdraft;
    public CheckAccount() {
        overdraft=0;
    }

    public CheckAccount(int id, double balance, double annualInterestRate,double overdraft){
        super(id,balance,annualInterestRate);
        this.overdraft=overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }
}
