package com.atguigu04.override.exer1;

/**
 * ClassName: ManKind
 * Package: com.atguigu03._extends.exer1
 * Description:
 *
 * @Author 黄洋
 * @Create 2023/3/11 1:55
 * @Version 1.0
 */
public class ManKind {
    int sex;
    int salary;
    void manOrWoman(){
        if (sex==1){
            System.out.println("男");
        }else {
            System.out.println("女");
        }
    }

    void employeed(){
        if (salary==0){
            System.out.println("no job");
        }else {
            System.out.println("job");
        }
    }

}
