package com.atguigu.api.statement;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;

/**
 * @author yian
 * @date 2023/4/14 21:32
 */
public class StatementQueryPart {
    public static void main(String[] args) throws SQLException {
        //1.注册驱动,8+选带cj的driver
        DriverManager.registerDriver(new Driver());
        /*
        2.获取连接.即与数据库创建链接
        参数1:url
        jdbc:厂商名://ip地址:part/数据库名
        jdbc:mysql://127.0.0.1:3306/atguigudb
         */

         Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/atguigudb","root","qwertyui");

         //3.创建statement
        Statement statement = connection.createStatement();
        //4.发送sql语句,并获取返回结果
        String sql = "select * from employees";
        ResultSet resultSet = statement.executeQuery(sql);

        //5.进行结果集解析

        //判断有没有下一行数据
        while (resultSet.next()) {
            int id = resultSet.getInt("employee_id");
            String lastName = resultSet.getString("last_name");
            System.out.println(id+"=="+lastName);
        }

        //关闭资源
        resultSet.close();
        statement.close();
        connection.close();
    }
}
