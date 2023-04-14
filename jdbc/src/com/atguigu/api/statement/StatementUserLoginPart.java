package com.atguigu.api.statement;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.Scanner;

import static java.lang.Class.forName;

/**
 * @author yian
 * @date 2023/4/14 22:20
 */
public class StatementUserLoginPart {
    public static void main(String[] args) throws SQLException,ClassNotFoundException {
        //1.用户输入信息
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String username = scanner.next();
        System.out.println("请输入密码");
        String password = scanner.next();

        /*
        2.注册驱动
        方案1:
        DriverManager.registerDriver
        问题:registerDriver和Driver的静态代码块都会注册一次
        解决:只触发静态代码块Driver
        触发静态代码块
        1.类加载时刻触发
        类加载机制:1.加载:class文件进入jvm虚拟机  2.连接:验证(检查文件类型) 准备(静态变量赋默认值) 解析(触发静态代码块)    初始化:静态属性赋真实值
        触发类加载:
        new关键字
        调用静态方法
        接口
        反射
        子类触发父类
        程序入口main

        触发Driver类加载
        方案1:触发了两次
        DriverManager.registerDriver(new Driver())
        方案2:代码写死了,用的mysql的包不好换数据库
        new Driver()
        方案3:只需将字符串提取为配置文件,更灵活.在不修改代码的情况下切换数据库
        Class.forName("com.mysql.cj.jdbc.Driver")

         */
        Class.forName("com.mysql.cj.jdbc.Driver");

        //forName("com.mysql.cj.jdbc.Driver")

        //2.获取数据库连接r
        /*

        getConnection(1.2.3)是个重载方法!
        核心参数:
        1.主机ip地址:localhost/107.0.0.1
        2.端口号:3306
        3.用户名:root
        4.密码:qwertyui
        5.数据库名:atguigudb
        6.可选信息:先不写]

        三个参数:
        string url  具体格式:
        jdbc:[数据库软件名称]://ip地址:端口号/数据库名?可选信息
        具体:jdbc:mysql://localhost:3306/atguigudb
        本机简写:jdbc:mysql:///atguigudb(必须是本机,端口号是3306,使用三个/)
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/at")

        两个参数:
        string url:和三个参数的url一样
        properties info:存储账号和密码 类似Map,只不过key和value都是String类型
        properties info = new Properties()
        info.put("user", "root")账号
        info.put("password", "qwertyui")密码
        connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/atguigudb",info)

        string user 账号
        string password 密码

        一个参数:
        string url:和三个参数的url一样,可以在?key=value&key=value填写
        如:jdbc:mysql://localhost:3306/atguigudb?user=root&password=qwertyui
        connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/atgu?user=root&password=qwertyui")

        还能填写其他信息

         */

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/atguigudb",username,password);

        //3.创建发送sql语句的statement对象
        //statement可以发送sql语句,并获取返回结果
        Statement statement = connection.createStatement();

        //4.发送sql语句
        String sql = "select * from employees where employee_id = 1";
        //int i = statement.executeUpdate(sql)

        /*
        分类:DDL(容器创建,修改,删除)  DML(插入,修改,删除)   DQL(查询) DCL(权限控制)   TPL(事务控制语句)

        executeUpdate(sql)sql应该为非DQL
        返回为int类型
        情况1:DML:返回影响的行数
        情况2:DML:返回 0

        executeQuery(sql)参数为DQL
        返回为ResultSet类型
        resultSet resultSet=statement.executeQuery(sql)

         */
        ResultSet resultSet = statement.executeQuery(sql);

        //5.结果集解析
        /*
        注意结果为result,也是有行和列的概念
        存在光标,光标在第一行之前,每用一次next方法就向后移动一行
        只需用next()方法就行
        while (result.next)

        获取列数据
        result.get类型(String columnlabel/int columnindex)
        columnlabel:列名或者别名
        columnindex:列序号,从1开始

        while (result.next){
            System.out.println(result.getString("employee_id"))
            System.out.println(result.getString("employee_name"))
            System.out.println(result.getString("employee_age"))

        }


         */
        while (resultSet.next()){
            System.out.println(resultSet.getString("employee_id"));
            System.out.println(resultSet.getString("employee_name"));
            System.out.println(resultSet.getString("employee_age"));
            System.out.println(resultSet.getString("employee_address"));
            System.out.println(resultSet.getString("employee_salary"));
            System.out.println(resultSet.getString("employee_department"));
            System.out.println(resultSet.getString("employee_job"));
            System.out.println(resultSet.getString("employee_email"));
            System.out.println(resultSet.getString("employee_phone"));
            System.out.println(resultSet.getString("employee_create_time"));
            System.out.println(resultSet.getString("employee_update_time"));
            System.out.println(resultSet.getString("employee_status"));
            System.out.println(resultSet.getString("employee_remark"));
        }

        //6.关闭资源
        resultSet.close();
        statement.close();
        connection.close();
    }
}
