package com.atguigu05.method_more._01overload.exer;

/**
 * ClassName: OverloadTest
 * Package: com.atguigu05.method_more._01overload.exer
 * Description:
 *
 * @Author 黄洋
 * @Create 2023/3/10 21:55
 * @Version 1.0
 */
public class OverloadTest {
    public static void main(String[] args) {
        Overload o1=new Overload();
        o1.mol(4);
        o1.mol("111hao");
        o1.mol(3,4);
        System.out.println(o1.max(11, 44, 22));
    }
}
