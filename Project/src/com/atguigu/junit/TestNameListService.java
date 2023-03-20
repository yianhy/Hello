package com.atguigu.junit;

import com.atguigu.domain.Employee;
import com.atguigu.service.NameListService;
import com.atguigu.service.TeamException;
import org.junit.Test;

/**
 * @author yian
 * @date 2023/3/20 13:49
 */
public class TestNameListService {
    @Test
    public void textGetAllEmployee(){
        NameListService nameListService=new NameListService();
        Employee[] employees=nameListService.getAllEmployees();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
    @Test
    public void textGetEmployee(){
        NameListService nameListService=new NameListService();
        int id=3;
        id=13;

        try {
            Employee employee=nameListService.getEmployee(id);
            System.out.println(employee);
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }

    }
}
