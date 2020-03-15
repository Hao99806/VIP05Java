package com.testing.MysqlTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MysqlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/test_project?serverTimezone=GMT&useUnicode=true&autoReconnect=true&characterEncoding=utf-8";
		String user="root";
		String password="huawei123";
		
		try {
			//加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			//建立连接
			Connection mysqlConnector=DriverManager.getConnection(url, user, password);
			//建立查询
			Statement myst=mysqlConnector.createStatement();
			//拼接sql语句
			String inputUser="Roy";
			String inputPwd="123456";
			String sql="SELECT * FROM `userinfo` where username='"+inputUser+"' and `password`='"+inputPwd+"';";
			//执行查询，并把结果赋值给rs
			ResultSet rs= myst.executeQuery(sql);
			System.out.println(rs);
			//判断是否取到值，和是否有下一条数据
			if(rs.next()) {
				System.out.println("登录成功");
			}
			else {
				System.out.println("登录失败");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
