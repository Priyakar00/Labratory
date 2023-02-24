package com.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableEx {

	public static void main(String[] args) {
		//try with resources
		try(Connection conn=DatabaseConnection.getConnection()){
			//create statement
			Statement st=conn.createStatement();
			
			//write /create query
			String sql="create table teacher(id int primary key, name varchar(30) not null,"
					+ " email varchar(50) not null unique, salary int not null)";
			
			st.executeUpdate(sql);
			//st.executeUpdate("create table teacher(id int primary key, name varchar(30) not null,"
			//		+ " email varchar(50) not null unique, salary int not null)";);
			
			
			System.out.println("Table created successfully!!");
			
					
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
