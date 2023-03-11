package com.atguigu01.oop;

/**
 * @author 尚硅谷-宋红康
 * @create 16:26
 */
public class Phone {
    double price;
    String name;

    public void call(){
        System.out.println("能打电话");
    }

    public void sendMessage(String message){
        System.out.println("发短信"+message);
    }

    public void playGame(){
        System.out.println("玩游戏");
    }

}
