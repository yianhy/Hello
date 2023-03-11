package com.atguigu03.field_method.field.exer1;

/**
 * ClassName: EmployeeTest
 * Package: com.atguigu03.field_method.field.exer1
 * Description:
 *
 * @Author 黄洋
 * @Create 2023/3/10 21:03
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee();
        e1.name="赵三";
        e1.age=12;
        e1.id="1123";
        e1.salary=1111.323;
        e2.name="赵本山";
        e2.age=14;
        e2.salary=444.4;
        e2.id="13444";
        System.out.println(e1.name+e1.age+e1.id+e1.salary);
    }
}
