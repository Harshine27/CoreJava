package com.jdbc.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1.loading the Driver class
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2.create the connection
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/core", "root", "java");
		
		//3.create the statement
		
		
		Statement stmt = conn.createStatement();
		
		// 4.execute the queries
		
		//-->>ddl--->>execute()
		
		//--dml--->> executeUpdate()
		// --drl/dql --->> executeQuery()
		
		//stmt.execute("create table pross(proid int , pname varchar (15))");
		stmt.executeUpdate("insert into pross values(1,'Laptop')");
		stmt.executeUpdate("insert into pross values(2,'Mobile')");
		
		ResultSet result = stmt.executeQuery("select * from pross");
		while(result.next()) {
		System.out.println(result.getInt(1)  + result.getString(2));
		}
		
		//5.close the connection
		
		conn.close();
		
		System.out.println("Table is selected");
		
		
		

	}

}
