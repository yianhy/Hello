package com.atguigu01._this.exer1;

/**
 * ClassName: Girl
 * Package: com.atguigu01._this.exer1
 * Description:
 *
 * @Author 黄洋
 * @Create 2023/3/11 0:23
 * @Version 1.0
 */
public class Girl {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void marry(Boy boy){
        System.out.println("我要嫁给"+boy.getName());
        boy.marry(this);
    }

    public int compare(Girl girl){
        if (girl.age>this.age){
            return 1;
        }
        if (girl.age==this.age){
            return 0;
        }
        return 1;
    }
}
