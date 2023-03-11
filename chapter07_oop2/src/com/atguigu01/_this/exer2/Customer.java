package com.atguigu01._this.exer2;

/**
 * ClassName: Customer
 * Package: com.atguigu01._this.exer2
 * Description:
 *
 * @Author 黄洋
 * @Create 2023/3/11 0:40
 * @Version 1.0
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;
    public Customer(String f,String l){
        firstName=f;
        lastName=l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
