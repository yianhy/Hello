package com.atguigu.service;

/**
 * @author yian
 * @date 2023/3/20 13:44
 */
public class TeamException extends Exception{
    static final long serialVersionUID = 432675239784502L;

    public TeamException(String message) {
        super(message);
    }

    public TeamException() {
    }
}
