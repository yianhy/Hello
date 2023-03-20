package com.atguigu.domain;

/**
 * @author yian
 * @date 2023/3/20 13:00
 */
public class Architect extends Designer{
    private int stock;//股票

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public Architect() {
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    @Override
    public String getDetailsForTeam() {
        return getMember()+"/"+getId()+"\t"+getName()+"\t"+getAge()+"\t"+getSalary()+"\t架构师\t"+getBonus()+"\t"+getStock();
    }

    @Override
    public String toString() {
        return getDetails()+"\t架构师\t" +
                getStatus() +"\t"+ getBonus() + "\t"+getStock()+"\t"+getEquipment().getDescription();
    }
}
