package com.atguigu05._super.exer1;

/**
 * ClassName: Kids
 * Package: com.atguigu03._extends.exer1
 * Description:
 *
 * @Author 黄洋
 * @Create 2023/3/11 1:58
 * @Version 1.0
 */
public class Kids extends ManKind {
    int yearOld;
    void printAge(){
        System.out.println(yearOld);
    }

    @Override
    public void employeed(){
        super.employeed();
        System.out.println("Kids should study and no job.");
    }
}
