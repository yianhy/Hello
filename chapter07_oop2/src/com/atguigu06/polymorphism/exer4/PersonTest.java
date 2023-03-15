package com.atguigu06.polymorphism.exer4;

/**
 * @author yian
 * @date 2023/3/15 2:16
 */
public class PersonTest {
    public static void main(String[] args) {
        Person[] people=new Person[2];
        people[0]=new Man();
        people[1]=new Woman();
        meeting(people);
    }

    public static void meeting(Person... ps){
        for (int i = 0; i < ps.length; i++) {
            ps[i].eat();
            ps[i].toilet();
            if (ps[i] instanceof Man){
                Man man=(Man) ps[i];
                man.smoke();
            }
            if (ps[i] instanceof Woman){
                Woman woman=(Woman) ps[i];
                woman.makeup();
            }
        }
    }
}
