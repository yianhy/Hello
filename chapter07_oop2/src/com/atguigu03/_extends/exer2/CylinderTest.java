package com.atguigu03._extends.exer2;

/**
 * ClassName: CylinderTest
 * Package: com.atguigu03._extends.exer2
 * Description:
 *
 * @Author 黄洋
 * @Create 2023/3/11 2:06
 * @Version 1.0
 */
public class CylinderTest {
    public static void main(String[] args) {
        Cylinder c1=new Cylinder();
        c1.setRadius(10);
        c1.setLength(4);
        System.out.println(c1.findVolume());
        System.out.println(c1.findArea());
    }
}
