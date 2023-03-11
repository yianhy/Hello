package com.atguigu03._extends.exer2;

/**
 * ClassName: Cylinder
 * Package: com.atguigu03._extends.exer2
 * Description:
 *
 * @Author 黄洋
 * @Create 2023/3/11 2:04
 * @Version 1.0
 */
public class Cylinder extends circle{
    private double length;

    public Cylinder() {
        this.length = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double findVolume(){
        return Math.PI*getRadius()*getRadius()*length;
    }
    @Override
    public double findArea(){
        return (getRadius()*getRadius()* Math.PI*2+ Math.PI*2*getRadius()*length);
    }

}
