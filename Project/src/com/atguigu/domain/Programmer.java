package com.atguigu.domain;

import com.atguigu.service.Status;

/**
 * @author yian
 * @date 2023/3/20 12:53
 */
public class Programmer extends Employee{
    private int member;//Tid,开发团队的id
    private Status status=Status.FREE;
    private Equipment equipment;

    public Programmer() {
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMember() {
        return member;
    }

    public void setMember(int member) {
        this.member = member;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }
    public String getDetailsForTeam() {
        return member+"/"+getId()+"\t"+getName()+"\t"+getAge()+"\t"+getSalary()+"\t程序员";
    }
    @Override
    public String toString() {
        return super.toString()+"\t程序员\t" +  status +"\t\t\t\t\t" + equipment.getDescription();
    }
}
