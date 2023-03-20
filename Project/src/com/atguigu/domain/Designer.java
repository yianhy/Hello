package com.atguigu.domain;

/**
 * @author yian
 * @date 2023/3/20 12:59
 */
public class Designer extends Programmer{
    private double bonus;

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public Designer() {
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    @Override
    public String getDetailsForTeam() {
        return getMember()+"/"+getId()+"\t"+getName()+"\t"+getAge()+"\t"+getSalary()+"\t设计师\t"+getBonus();
    }

    @Override
    public String toString() {
        return getDetails()+"\t设计师\t" + getStatus() +"\t"+ bonus + "\t\t\t"+getEquipment().getDescription();
    }
}
