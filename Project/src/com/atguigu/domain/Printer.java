package com.atguigu.domain;

/**
 * @author yian
 * @date 2023/3/20 12:49
 */
public class Printer implements Equipment{
    private String name;//机器名称
    private String type;//机器类型
    @Override
    public String getDescription() {
        return name+"("+type+")";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Printer(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Printer() {
    }
}
