package com.atguigu01.oop;

/**
 * @author 尚硅谷-宋红康
 * @create 16:29
 */
public class PhoneTest {
    public static void main(String[] args) {
        Phone p1=new Phone();
        p1.name="三星";
        p1.price=111.21;
        p1.sendMessage("爱你!");
        p1.playGame();
        p1.call();
    }
}
