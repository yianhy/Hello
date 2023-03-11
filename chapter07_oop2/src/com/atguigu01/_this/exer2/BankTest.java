package com.atguigu01._this.exer2;

/**
 * ClassName: BankTest
 * Package: com.atguigu01._this.exer2
 * Description:
 *
 * @Author 黄洋
 * @Create 2023/3/11 0:48
 * @Version 1.0
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank=new Bank();
        bank.addCustomer("huang","yang");
        bank.getCustomer(1).setAccount(new Account(1000));
        System.out.println(bank.getNumberOfCustomer());


    }
}
