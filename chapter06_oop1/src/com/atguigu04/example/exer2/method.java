package com.atguigu04.example.exer2;

/**
 * ClassName: method1
 * Package: com.atguigu04.example.exer2
 * Description:
 *
 * @Author 黄洋
 * @Create 2023/3/10 21:21
 * @Version 1.0
 */
public class method {
    public void method1(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public int method2(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        return 10*8;
    }

    public int method3(int n,int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        return n*m;
    }
}
