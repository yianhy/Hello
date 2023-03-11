package com.atguigu05.method_more._01overload.exer;

/**
 * ClassName: overload
 * Package: com.atguigu05.method_more._01overload.exer
 * Description:
 *
 * @Author 黄洋
 * @Create 2023/3/10 21:48
 * @Version 1.0
 */
public class Overload {
    public void mol(int i,int j){
        System.out.println(i*j);
    }
    public void mol(int i){
        System.out.println(i*i);
    }

    public void mol(String str){
        System.out.println(str);
    }

    public int max(int i,int j){
        return (i>j)?i:j;
    }

    public double max(double i,double j){
        return (i>j)?i:j;
    }

    public double max(double num1,double num2, double num3){
        return (((num1>num2)?num1:num2)>num3)?((num1>num2)?num1:num2):num3;
    }
}
