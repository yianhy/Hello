package com.atguigu06.polymorphism.exer2;

/**
 * ClassName: AnimalTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 16:39
 * @Version 1.0
 */
public class AnimalTest {

    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();

        test.adopt(new Dog());
        test.adopt(new Cat());
    }

    public void adopt(Animal animal){
        animal.eat();
        animal.jump();
        if (animal instanceof Dog){
            Dog dog =(Dog) animal;
            dog.watchDoor();
        }

        if (animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }

//    public void adopt(Dog dog){
//        dog.eat();
//        dog.jump();
//
//    }
//
//    public void adopt(Cat cat){
//        cat.eat();
//        cat.jump();
//
//    }

    //。。。。

}



