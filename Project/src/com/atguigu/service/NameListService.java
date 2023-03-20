package com.atguigu.service;

import com.atguigu.domain.*;

import static com.atguigu.service.Data.*;

/**
 * @author yian
 * @date 2023/3/20 13:03
 */
public class NameListService {
    private Employee[] employees;

    public NameListService() {
        employees = new Employee[EMPLOYEES.length];
        for (int i = 0; i < employees.length; i++) {
            //创建通用属性
            int type = Integer.parseInt(EMPLOYEES[i][0]);
            int id=Integer.parseInt(EMPLOYEES[i][1]);
            String name=EMPLOYEES[i][2];
            int age=Integer.parseInt(EMPLOYEES[i][3]);
            double salary=Double.parseDouble(EMPLOYEES[i][4]);
            Equipment equipment;
            double bonus;
            int stock;
            switch (type) {
                case EMPLOYEE:
                    employees[i] = new Employee(id,name,age,salary);
                    break;
                case PROGRAMMER:
                    equipment=creatEquipment(i);
                    employees[i] = new Programmer(id,name,age,salary,equipment);
                    break;
                case DESIGNER:
                    equipment=creatEquipment(i);
                    bonus=Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id,name,age,salary,equipment,bonus);
                    break;
                case ARCHITECT:
                    equipment=creatEquipment(i);
                    bonus=Double.parseDouble(EMPLOYEES[i][5]);
                    stock=Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id,name,age,salary,equipment,bonus,stock);
                    break;
            }

        }
    }

    public Employee[] getAllEmployees() {
        return employees;
    }

    public Employee getEmployee(int id)throws TeamException {
        for (int i = 0; i < employees.length; i++) {
            if (id==employees[i].getId()){
                return employees[i];
            }
        }
        throw new TeamException("找不到指定员工");
    }

    private Equipment creatEquipment(int index){
        int equipmentType=Integer.parseInt(EQUIPMENTS[index][0]);
        String modelOrName=EQUIPMENTS[index][1];
        String priceOrDisplayOrType=EQUIPMENTS[index][2];
        switch (equipmentType){
            case PC:
                return new PC(modelOrName,priceOrDisplayOrType);

            case NOTEBOOK:
                return new NoteBook(modelOrName,Double.parseDouble(priceOrDisplayOrType));
            case PRINTER:
                return new Printer(modelOrName,priceOrDisplayOrType);
        }
        return null;
    }
}
