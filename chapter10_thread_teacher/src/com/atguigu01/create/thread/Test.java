package com.atguigu01.create.thread;

/**
 * @author yian
 * @date 2023/3/20 23:51
 */
public class Test {
    public static void main(String[] args) {
        EvenNumPrint evenNumPrint=new EvenNumPrint();
        OddNumPrint oddNumPrint=new OddNumPrint();
        evenNumPrint.run();
        oddNumPrint.run();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }).start();
        new Thread(){
            @Override
            public void run(){
                for (int i = 0; i < 100; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }
            }
        }.start();
    }


}
class EvenNumPrint extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }


}

class OddNumPrint extends Thread{
    @Override
    public void run(){
        for (int i=0;i<100;i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
