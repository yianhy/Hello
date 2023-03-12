package com.atguigu06.polymorphism.exer1;

/**
 *
 *
 * @author yian
 * @date 2023/3/12 16:16
 */
public class MyRectangle extends GeometricObject{
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public MyRectangle(String color, double weight, double width, double height) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    @Override
    public double findArea() {
        return height*width;
    }
}
