package com.atguigu05._super.exer3;

/**
 * @author yian
 * @date 2023/3/15 0:56
 */
public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount a1=new CheckAccount(111,1000,0.1,1000);
        a1.withdraw(1500);
        System.out.println(a1.getBalance());
    }
}
