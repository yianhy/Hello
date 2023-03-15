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
        Dog d=new Dog();
        test.work(d);
        test.adopt(new Cat());
        Cat c=new Cat();
        test.work(c);
    }
    public void work(Animal animal){
        if (animal instanceof Dog){
            Dog dog=(Dog) animal;
            dog.watchDoor();
        }
        if (animal instanceof Cat){
            Cat cat=(Cat) animal;
            cat.catchMouse();
        }
    }

    public void adopt(Animal animal){ //Animal animal = new Dog()
        animal.eat();
        animal.jump();

//        animal.watchDoor();
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

class Animal{
    public void eat(){
        System.out.println("动物进食");
    }

    public void jump(){
        System.out.println("动物跳");
    }
}

class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("狗吃骨头");
    }
@Override
    public void jump(){
        System.out.println("狗急跳墙");
    }

    public void watchDoor(){
        System.out.println("狗能看家");
    }
}

class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }
@Override
    public void jump(){
        System.out.println("猫跳~~");
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}

