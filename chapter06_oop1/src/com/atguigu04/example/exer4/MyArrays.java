package com.atguigu04.example.exer4;

/**
 * ClassName: MyArrays
 * Package: com.atguigu04.example.exer4
 * Description:
 *
 * @Author 黄洋
 * @Create 2023/3/10 21:31
 * @Version 1.0
 */
public class MyArrays {
    //求最大值
    public int Max(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;


    }

    public int[] copy(int[] arr){
        int[] copyArr=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copyArr[i]=arr[i];
        }
        return copyArr;
    }

    //排序
    public void sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }


}
