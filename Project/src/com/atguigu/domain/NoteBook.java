package com.atguigu.domain;

/**
 * @author yian
 * @date 2023/3/20 12:48
 */
public class NoteBook implements Equipment{
    private String model;//机器型号
    private double price;//机器价格
    @Override
    public String getDescription() {
        return model+"("+price+")";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public NoteBook(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public NoteBook() {
    }
}
