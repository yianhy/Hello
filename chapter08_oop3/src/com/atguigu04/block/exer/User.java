package com.atguigu04.block.exer;

/**
 * @author yian
 * @date 2023/3/15 22:40
 */
public class User {
    private String userName;
    private String password;
    private long registrationTime;
    {
        System.out.println("新用户注册");
        registrationTime=0;
    }

    public User() {
        userName=""+registrationTime;
        password="123456";
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(long registrationTime) {
        this.registrationTime = registrationTime;
    }
}
