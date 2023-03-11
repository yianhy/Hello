package com.atguigu01._this.exer2;

/**
 * ClassName: Banl
 * Package: com.atguigu01._this.exer2
 * Description:
 *
 * @Author 黄洋
 * @Create 2023/3/11 0:42
 * @Version 1.0
 */
public class Bank {
    private Customer[] customer;
    private int numberOfCustomer;
    public Bank(){
        customer=new Customer[10];
    }

    public Customer getCustomer(int index) {
        return customer[index-1];
    }

    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }
    public void addCustomer(String f,String l){
        customer[numberOfCustomer++]=new Customer(f,l);
    }
}
