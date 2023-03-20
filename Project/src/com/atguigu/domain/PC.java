package com.atguigu.domain;

/**
 * @author yian
 * @date 2023/3/20 12:44
 */
public class PC implements Equipment{
    private String model;//机器型号
    private String display;//机器
    @Override
    public String getDescription() {
        return model+"("+display+")";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public PC() {
    }

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }
}
