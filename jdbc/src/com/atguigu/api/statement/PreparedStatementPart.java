package com.atguigu.api.statement;

import java.lang.reflect.AccessibleObject;
import java.sql.*;
import java.util.Scanner;

/**
 * @author yian
 * @date 2023/4/15 0:50
 */
public class PreparedStatementPart {
    /*
    statement是静态,不好用,有注入攻击
     */

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.用户输入信息
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String username = scanner.next();
        System.out.println("请输入密码");
        String password = scanner.next();

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/atguigudb",username,password);

        /*
        statement
        1.创建statement
        2.拼接sql语句
        3.发送sql语句

        prepareStatement
        1.编写sql语句结构 不包含动态值部分,动态值用占位符 ?      注意:只能替代动态值
        2.创建prepareStatement,并传入动态值
        3.用动态值替换占位符
        4.发送sql语句,并获取返回结果
         */
        //3.编写sql语句结果
        String Sql = "select * from employees where employee_id=?";

        //创建预编译并设置sql语句返回结果
        PreparedStatement preparedStatement = connection.prepareStatement(Sql);

        //5.单独占位符赋值
        /*
        参数1:占位符位置:从1开始
        参数2:object占位符的值,可以设置任意类型数据
         */
        preparedStatement.setObject(1, 101);
        //preparedStatement.setObject(2, password);

        //6.发送语句,接收结果

        //这个需要传具体语句
        //ResultSet resultSet = statement.executeQuery(sql)
        //这个不需要传语句
       // ResultSet resultSet = statement.executeQuery()


        ResultSet resultSet = preparedStatement.executeQuery();

        //结果集解析
        while (resultSet.next()){
            System.out.println(resultSet.getString("employee_id"));
            System.out.println(resultSet.getString("last_name"));
            System.out.println(resultSet.getString("salary"));
        }
        //释放资源
        resultSet.close();
        preparedStatement.close();
        connection.close();

    }
}
