package com.atguigu03._extends.exer2;

/**
 * ClassName: Cylinder
 * Package: com.atguigu03._extends.exer2
 * Description:
 *
 * @Author 黄洋
 * @Create 2023/3/11 2:01
 * @Version 1.0
 */
public class circle {
    private double radius;

    public circle() {
        this.radius = 1;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double findArea(){
        return Math.PI*radius*radius;
    }
}
