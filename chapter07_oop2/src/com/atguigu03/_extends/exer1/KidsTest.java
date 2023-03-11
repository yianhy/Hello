package com.atguigu03._extends.exer1;

/**
 * ClassName: KidsTest
 * Package: com.atguigu03._extends.exer1
 * Description:
 *
 * @Author 黄洋
 * @Create 2023/3/11 1:59
 * @Version 1.0
 */
public class KidsTest {
    public static void main(String[] args) {
        Kids someKid=new Kids();
        someKid.sex=1;
        someKid.salary=0;
        someKid.yearOld=11;
        someKid.printAge();
        someKid.manOrWoman();
        someKid.employeed();
    }
}
