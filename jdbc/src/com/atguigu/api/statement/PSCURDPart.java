package com.atguigu.api.statement;

import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yian
 * @date 2023/4/15 13:36
 */
public class PSCURDPart {
    @Test
    public void text1() throws ClassNotFoundException, SQLException {//1.添加数据
        //插入一条数据

        //1注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql:///atguigudb", "root", "qwertyui");
        //编写sql语句结果
        String sql = "insert into employees(employee_id,salary,last_name,email) values(?,?,?,?)";
        //创建preparedStatement
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //占位符赋值
        preparedStatement.setObject(1,"3000");
        preparedStatement.setObject(2,"4000");
        preparedStatement.setObject(3,"Jack");
        preparedStatement.setObject(4,"ychag@example.com");
        //6发送sql
        //DML
        int rows = preparedStatement.executeUpdate();
        if (rows >0) {
            System.out.println("插入成功");
        }else {
            System.out.println("插入失败");
        }
        preparedStatement.close();
        connection.close();


    }
    
    @Test
    public void text2() throws SQLException, ClassNotFoundException {
        //修改emplouee_id为104员工last_name为Jacl
        //1注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql:///atguigudb", "root", "qwertyui");
        //编写sql语句结果
        String sql = "update employees set last_name=? where employee_id=?";
        //创建preparedStatement
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //占位符赋值
        preparedStatement.setObject(1,"jack");
        preparedStatement.setObject(2,"1004");
        //6发送sql
        int rows = preparedStatement.executeUpdate();
        if (rows >0) {
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }

        preparedStatement.close();
        connection.close();
        
    }
    
    @Test
    public void text3() throws ClassNotFoundException, SQLException {
        //删除id=300的数据
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql:///atguigudb", "root", "qwertyui");
        //编写sql语句结果
        String sql = "delete from employees  where employee_id=?";
        //创建preparedStatement
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //占位符赋值
        preparedStatement.setObject(1,"1004");
        //6发送sql
        int rows = preparedStatement.executeUpdate();
        if (rows >0) {
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }

        preparedStatement.close();
        connection.close();
    }

    @Test
    public void text4() throws SQLException, ClassNotFoundException {

        //查询所有,放在List<Map>,list集合中

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql:///atguigudb", "root", "qwertyui");
        //编写sql语句结果
        String sql = "select employee_id,last_name from employees where employee_id = ? ";
        //创建preparedStatement
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //占位符赋值
        preparedStatement.setObject(1,"103");
        //6发送sql
        ResultSet resultSet = preparedStatement.executeQuery();
        ArrayList<Map> maps = new ArrayList<>();
        //当前结果集列的信息,可以获得列的名称,也可以获取列的角标
        ResultSetMetaData metaData = resultSet.getMetaData();
        //获取列的数量
        int columnCount = metaData.getColumnCount();

        while (resultSet.next()) {
            //纯手动放入//代码固定,适用性不够高
            Map map = new HashMap<>();

            //遍历列
            for (int i = 1; i <= columnCount; i++) {
                //获取列下角标的值
                Object value = resultSet.getObject(i);
                //获取列的别名或列名
                String columnLabel = metaData.getColumnLabel(i);
                //通过别名和值添加到map中
                map.put(columnLabel,value);
            }
            //不推荐,代码固定,适用性不高
            //map.put("id",resultSet.getObject("employee_id"));
            //map.put("name",resultSet.getObject("last_name"));

            //将map存放在map里
            maps.add(map);
        }

        //自动遍历


        //自动遍历
        //获取列的信息


        preparedStatement.close();
        connection.close();
    }

}
