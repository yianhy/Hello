package com.atguigu.api.statement;

import org.junit.Test;

import java.sql.*;

/**
 * @author yian
 * @date 2023/4/15 18:06
 */
public class PSOtherPart {
    @Test
    public void text1() throws Exception {
        //实现自增长主键
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql:///employees?user=root&password=qwertyui");
        String sql = "insert into employees(last_name,salary) values(?,1000)";
        //添加return_generated_keys,可以获取主键
        PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setString(1, "张三");
        int i = preparedStatement.executeUpdate();
        //获取回显主键,为一行一列的id值
        ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
        //移动光标到第一行
        generatedKeys.next();
        //用int接收主键
        int id = generatedKeys.getInt(1);




    }
    @Test
    public void text2(){
        //使用批量插入,在占位符和发送sql语句设置重复
        /*
        不用statement.executeupdate
        而是用statement.addbatch()不执行,追加到values后面

        循环完后执行statement.executeBatch,批量操作
        要使用这种方法,需要在connection路径后面添加rewriteBatchedStatements=true
        注意要用values,且不能带;
         */

    }
}
