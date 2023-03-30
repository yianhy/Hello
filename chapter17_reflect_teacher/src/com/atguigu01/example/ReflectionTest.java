package com.atguigu01.example;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * ClassName: ReflectionTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 14:46
 * @Version 1.0
 */
public class ReflectionTest {
    /**
     * 使用反射之前可以执行的操作
    */
    @Test
    public void test1(){

        //1.创建Person类的实例
//        public Person()
        Person p1 = new Person();
        System.out.println(p1);

        //2.调用属性
        //public int age;
        p1.age = 10;
        System.out.println(p1.age);

        //3.调用方法
        //public void show()
        p1.show();

    }

    /**
    * 使用反射完成上述的操作
     */
    @Test
    public void test2() throws Exception{
        //创建Person的反射
        Class<Person> personClass = Person.class;
        //创建Person实例,newInstance只能调空参构造器
        Person person = personClass.newInstance();
        //获取构造器类,可以调用私有的,有参的构造器
        Constructor<Person> declaredConstructor = personClass.getDeclaredConstructor(String.class, int.class);
        //改变使用构造器的权限限制
        declaredConstructor.setAccessible(true);
        Person tom = declaredConstructor.newInstance("tom", 12);
        System.out.println(tom);
        //给person属性赋值1:使用Class类的方法,获取属性对象2,用属性对象的方法对特定的对象赋值
        Field age = personClass.getField("age");
        //调用权限限制的属性
        Field name = personClass.getDeclaredField("name");
        //改变使用的限制
        name.setAccessible(true);
        age.set(person,12);
        name.set(person,"jack");
        //获取属性值,使用对应属性类的方法
        Method show = personClass.getDeclaredMethod("show");
        show.setAccessible(true);
        show.invoke("chinese");
        //1.创建Person类的实例
//        public Person()
        Class<Person> clazz = Person.class;
        Person p1 = clazz.newInstance();
        System.out.println(p1);

        //2.调用属性
        //public int age;
        Field ageField = clazz.getField("age");
        ageField.set(p1,10);
        System.out.println(ageField.get(p1));

        //3.调用方法
        //public void show()
        Method showMethod = clazz.getMethod("show");
        showMethod.invoke(p1);

    }

    /*
    * 出了Person类之后，就不能直接调用Person类中声明的private权限修饰的结构（属性、方法、构造器）
    * 但是，我们可以通过反射的方式，调用Person类中私有的结构  ---> 暴力反射
    *
    * */
    @Test
    public void test3() throws Exception {
        //1. 调用私有的构造器，创建Person的实例
        //private Person(String name, int age)
        Class clazz = Person.class;
        Constructor cons = clazz.getDeclaredConstructor(String.class,int.class);
        cons.setAccessible(true);
        Person p1 = (Person) cons.newInstance("Tom",12);
        System.out.println(p1);

        //2. 调用私有的属性
        //private String name;
        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(p1,"Jerry");
        System.out.println(nameField.get(p1));

        //3. 调用私有的方法
        //private String showNation(String nation)
        Method showNationMethod = clazz.getDeclaredMethod("showNation",String.class);
        showNationMethod.setAccessible(true);
        String info = (String) showNationMethod.invoke(p1,"CHN");
        System.out.println(info);
    }
}
