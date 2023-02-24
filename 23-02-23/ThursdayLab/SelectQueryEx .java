package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectQueryEx {

	public static void main(String[] args) {
		try(Connection conn=DatabaseConnection.getConnection()){
			String sql="select * from teacher"; 
			
			PreparedStatement pst=conn.prepareStatement(sql); 
			ResultSet rs=pst.executeQuery(); //execute query to execute the salary
			
			while(rs.next()) //result set next method
			{
				System.out.println("Teacher id: "+rs.getInt(1));//get Int column index
				System.out.println("Teacher name: "+rs.getString("name")); //get string column name
				System.out.println("Teacher email: "+rs.getString(3));
				System.out.println("Teacher salary: "+rs.getInt("salary"));
				System.out.println("=================================");
			}
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
