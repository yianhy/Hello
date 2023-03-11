package com.atguigu03.field_method.field.exer2;

/**
 * ClassName: EmployeeTest
 * Package: com.atguigu03.field_method.field.exer2
 * Description:
 *
 * @Author 黄洋
 * @Create 2023/3/10 21:07
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.name="黄洋";
        e1.id="1111";
        e1.age=11;
        e1.salary=33;
        e1.birthday=new MyDate();
        e1.birthday.year=1444;
        e1.birthday.month=4;
        e1.birthday.day=11;
        Employee e2=new Employee();
        e2.age=11;
        e2.name="小三";
        e2.id="44444";
        e2.salary=1111.111;
        System.out.println(e1.name+e1.age+e1.salary+e1.birthday.year+e1.birthday.month+e1.birthday.day);
    }
}
