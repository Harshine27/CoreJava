package com.jdbc.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//1.loading the driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2.Create the Connection
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adavancedjava", "root", "java");
		
		//3.Create the Statement
		
		
		Statement stmt = conn.createStatement();
		
		//4.executing the queires
		
		//--->> ddl--->> execute()
		
		//---dml----->> executeUpdate()
		
		
		// drl/dql ---->> executeQuery()
		
		//stmt.execute("create table product(prodid int , proname varchar(15))");
		
		stmt.executeUpdate("insert into product values(1,'Laptop')");
		
		stmt.executeUpdate("insert into product values(2,'Mobile')");
		
		ResultSet result = stmt. executeQuery("select * from product");
		
		while(result.next()) {
			
			System.out.println(result.getInt(1) + " " + result.getString(2));
			
		}
		
		//5.close the connecton
		
		conn.close();
		
		System.out.println("Table is selected");
		
		
		

	}

}
