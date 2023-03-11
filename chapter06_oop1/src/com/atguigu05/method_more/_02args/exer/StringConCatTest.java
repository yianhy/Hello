package com.atguigu05.method_more._02args.exer;

/**
 * ClassName: StringConCatTest
 * Package: com.atguigu05.method_more._02args.exer
 * Description:
 *
 * @Author 黄洋
 * @Create 2023/3/10 22:21
 * @Version 1.0
 */
public class StringConCatTest {
    public static void main(String[] args) {
        StringConCatTest s1=new StringConCatTest();
        System.out.println(s1.StringConCat('-', "xiaopeng", "黄洋"));
    }
    public String StringConCat(char ch,String... str){
        String result="";
        for (int i = 0; i < str.length; i++) {
            if (i==str.length-1){
                result+=str[i];
            }else {

                result+=str[i];
                result+=ch;
            }
        }
        return result;
    }

}
