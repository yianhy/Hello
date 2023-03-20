package com.atguigu02.trycatchfinally.interview;

/**
 * @author yian
 * @date 2023/3/19 15:21
 */
public class Test {
    public static void main(String[] args) {
        Son son=new Son();
        son.arr[1]=11;
        System.out.println();
        son.sout();
    }
}

class Father{
    int[] arr=new int[10];
    void sout(){
        try {
            System.out.println(arr[1]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组下标超了");
        }finally {
            System.out.println("结束");
        }

    }
}

class Son extends Father{

}
