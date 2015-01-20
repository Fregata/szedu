package com.szedu.framework.base



import java.sql.DriverManager
import java.sql.ResultSet

import com.mysql.jdbc.Connection
import com.mysql.jdbc.PreparedStatement
import com.mysql.jdbc.Statement

class TestDB {

	static main(args) {
		try{
			//加载HSQLDB数据库JDBC驱动
			Class.forName("com.mysql.jdbc.Driver");
			//在内存中建立临时数据库score，用户名为sa，密码为空
			@SuppressWarnings("unused")
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/szedu?characterEncoding=UTF-8&amp;jdbcCompliantTruncation=false", "root", "1qasw2de");
			System.out.println("Link is OK！");
			
			Statement state = connect.createStatement();
//			state.executeUpdate("create table Tb1 (ID INTEGER, Name VARCHAR(20))");
//			System.out.println("Create is  OK！");
//			
//			state.executeUpdate("Insert into Tb1 (ID, Name) Values(1, '潘永刚')");
//			state.executeUpdate("Insert into Tb1 (ID, Name) Values(2, '刘德华')");
//			System.out.println("Insert is OK！");
			
			PreparedStatement pstmt2   =   connect.prepareStatement("select * from admin");
			ResultSet rs = pstmt2.executeQuery();
			while(rs.next()){
				String x;
				x = rs.getString(1) + "   " + rs.getString(2);
				System.out.println(x);
			}
			System.out.println("Select is OK！");
			pstmt2.close();
			rs.close();
			
			state.close();
			connect.close();
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
