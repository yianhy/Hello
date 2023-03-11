package com.atguigu05.method_more._04recursion.exer1;

/**
 * ClassName: Recursion
 * Package: com.atguigu05.method_more._04recursion.exer1
 * Description:
 *
 * @Author 黄洋
 * @Create 2023/3/10 22:28
 * @Version 1.0
 */
public class Recursion {
    public int recur(int num){
        if (num==20){
            return 1;
        }
        if (num==21){
            return 4;
        }
        return recur(num+2)-recur(num+1)*2;
    }
}
