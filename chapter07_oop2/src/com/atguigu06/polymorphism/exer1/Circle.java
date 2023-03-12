package com.atguigu06.polymorphism.exer1;

/**
 *
 *
 * @author yian
 * @date 2023/3/12 16:14
 */
public class Circle extends GeometricObject{

    private double radius;

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return Math.PI*radius*radius;
    }
}
