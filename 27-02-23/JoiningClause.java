package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JoiningClause {

	public static void main(String[] args) {
		
		try(Connection conn= DatabaseConnection.getConnection()){
			
//			Statement st=conn.createStatement();
//			String create="create table course1(c_id int primary key auto_increment, course_name varchar(20), teacher_id int, "
//					+ "foreign key(teacher_id) references teacher(id))";
//			
//			int row=st.executeUpdate(create);
//			System.out.println(row+" table created successfully!!");
//			
			
//			Statement st1=conn.createStatement();
//			String q="insert into course1(course_name, teacher_id) "
//					+ "values('JAVA', 102), ('MySQL', 103), ('DotNet', null)"; 
//			int row=st1.executeUpdate(q);
//			System.out.println(row+" record inserted successfully!!");
//			
			
			//Equi join
			Statement st2=conn.createStatement();
			//String sql="select t.id, t.name, c.course_name from teacher t, course1 c where t.id=c.teacher_id";
			
			//Inner join
			//String sql1="select t.id, t.name, c.course_name from teacher t inner join course1 c on t.id+c.teacher_id";
			
			//Left join
			//String sql2="select t.id, t.name, c.course_name from teacher t left join course1 c on t.id+c.teacher_id";
			
			//Right join
			String sql3="select t.id, t.name, c.course_name from teacher t right join course1 c on t.id+c.teacher_id";
			
			ResultSet rs=st2.executeQuery(sql3);
			
			while(rs.next()) {
				System.out.println("Teacher Id: "+rs.getInt(1));
				System.out.println("Teacher name: "+rs.getString("name"));
				System.out.println("Course name: "+rs.getString("course_name"));
				System.out.println("===============================");
				
			}
			
		}
			catch(SQLException e) {
				System.out.println(e.getMessage());
			}
		
		
	}

}
