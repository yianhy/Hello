package com.atguigu06.polymorphism.exer1;

/**
 *
 *
 * @author yian
 * @date 2023/3/12 16:18
 */

public class GeometricTest {

    public static void main(String[] args) {
        GeometricTest test=new GeometricTest();
        Circle c1=new Circle("红色",1.0,1.1);
        Circle c2=new Circle("白色",12,3.3);
        System.out.println(c1.findArea());

        test.displayGeometricObject(c1);
        System.out.println(test.equalArea(c1, c2));
    }
    public boolean equalArea(GeometricObject g1,GeometricObject g2){
        return g1.findArea()==g2.findArea();
    }

    public void displayGeometricObject(GeometricObject g){
        System.out.println("图形的面积为:"+g.findArea());
    }
}
