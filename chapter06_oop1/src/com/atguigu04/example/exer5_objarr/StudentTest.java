package com.atguigu04.example.exer5_objarr;

/**
 * ClassName: StudentTest
 * Package: com.atguigu04.example.exer5_objarr
 * Description:
 *
 * @Author 黄洋
 * @Create 2023/3/10 21:40
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        Student[] student=new Student[20];
        for (int i = 0; i < student.length; i++) {
            student[i]=new Student();
            student[i].number=i+1;
            student[i].state=(int)(Math.random()*6+1);
            student[i].score=(int)(Math.random()*101);
        }

        for (int i = 0; i < student.length; i++) {
            if (student[i].state==3){
                System.out.println(student[i].score);
            }
        }
    }
}
