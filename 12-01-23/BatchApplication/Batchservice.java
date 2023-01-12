package batchApplication;

import java.util.Scanner;

public class BatchService {

	//CRUD--> Create, Read, Update, Delete
	static Scanner sc=new Scanner(System.in);
	
	static Java java[]=new Java[20];
	static int id;
	static long phone;
	static String name, email;
	static int jindex=0;
	
	static Aws aws[]=new Aws[20];
	static int aindex=0;
	
	//student info taking java course
	public static void javaStudentInfo() 
	{
		System.out.println("Enter student Id:");
		id=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter student name:");
		name=sc.nextLine();
		
		System.out.println("Enter student phone number:");
		phone=sc.nextLong();
		
		sc.nextLine();
		
		System.out.println("Enter student email:");
		email=sc.nextLine();
		
		java[jindex]=new Java(id, name,phone, email);
		jindex++;
		
		System.out.println("Student details added succesfully.");
	}
	
	//get java student details
	public static void getAllJavaStudentDetails() 
	{
		for(int i=0; i<jindex; i++) {
			
		System.out.println("Student Id:"+java[i].getStdId());
		System.out.println("Student Name:"+java[i].getStdName());
		System.out.println("Student Email:"+java[i].getEmail());
		System.out.println("Student Phone No:"+java[i].getPhone());
		System.out.println("Course Name: JAVA");
		System.out.println("=====================================");
		}
	}
	
	//update student info
	public static void updateJavaStudentInfo()
	{
	System.out.println("Enter student id:");
	id=sc.nextInt();
	
	for(int i=0; i<jindex; i++)
	{
	 if(id==java[i].getStdId())	 
		{ 
		System.out.println("Enter student Id:");
		id=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter student name:");
		name=sc.nextLine();
		
		System.out.println("Enter student phone number:");
		phone=sc.nextLong();
		
		sc.nextLine();
		
		System.out.println("Enter student email:");
		email=sc.nextLine();
		
		java[i]=new Java(id, name,phone, email);
		System.out.println("Update successfully");
		}
	 else {
		 throw new StudentNotFoundException("Student details not found.");
	      }
	 }
	 
	}
	
 //student info taking AWS course
	public static void awsStudentInfoo() 
	{
		System.out.println("Enter student Id:");
		id=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter student name:");
		name=sc.nextLine();
		
		System.out.println("Enter student phone number:");
		phone=sc.nextLong();
		
		sc.nextLine();
		
		System.out.println("Enter student email:");
		email=sc.nextLine();
		
		aws[aindex]=new Aws(id, name,phone, email);
		aindex++;
		
		System.out.println("Student details added succesfully.");
		
	}
	
	//get aws student info
	public static void getAllAwsStudentDetails()
	{
		for(int i=0; i<aindex; i++) {
			
			System.out.println("Student Id:"+aws[i].getStdId());
			System.out.println("Student Name:"+aws[i].getStdName());
			System.out.println("Student Email:"+aws[i].getEmail());
			System.out.println("Student Phone No:"+aws[i].getPhone());
			System.out.println("Course Name: AWS");
			System.out.println("=====================================");
			}
	}
	
	//update Aws student info
	public static void updateAwsStudentInfo()
	{
		System.out.println("Enter student id:");
		id=sc.nextInt();
		
		for(int i=0; i<aindex; i++)
		{
		 if(id==java[i].getStdId())	 
			{ 
			System.out.println("Enter student Id:");
			id=sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Enter student name:");
			name=sc.nextLine();
			
			System.out.println("Enter student phone number:");
			phone=sc.nextLong();
			
			sc.nextLine();
			
			System.out.println("Enter student email:");
			email=sc.nextLine();
			
			aws[aindex]=new Aws(id, name,phone, email);
			System.out.println("Update successfully");
			}
		 else {
			 throw new StudentNotFoundException ("Student details not found.");
		      }
		 }
		 
	}
	
	public static void searchCourses() {
		System.out.println("Enter a course");
		String course=sc.nextLine();
		if(course.equalsIgnoreCase("Java")|| course.equalsIgnoreCase("aws")){
			System.out.println("Course is available");
		}
		else {
			throw new CourseNotFoundException("Course not found.");
		}
	}
	
}
