package batchApplication;

import java.util.Scanner;

public class BatchMain {

	public static void main(String[] args) {
		
		int Choice, ch, c;
		Scanner sc=new Scanner(System.in);
		BatchService batch=new BatchService();
		System.out.println("Welcome to Anudip Foundation");
		
		do {
		    System.out.println("Please choose which course you want to pursue:\n"
		    		+ "1)Java  2)AWS  3)Others  4)Exit");
		    Choice=sc.nextInt();
		    
		    switch(Choice)
		    {
		    case 1:
		    	System.out.println("-----JAVa-----");
		    	System.out.println("1)Enter student info\n2)Show student info\n3)Update student info");
		    	
		    	ch=sc.nextInt();
		    	switch(ch)
		    	{
		    	case 1:
		    		batch.javaStudentInfo();
		    		System.out.println();
		    		break;
		    	case 2:
		    		batch.getAllJavaStudentDetails();
		    		System.out.println();
		    		break;
		    	case 3:
		    		batch.updateJavaStudentInfo();
		    		break;
		    	}
		    	break;
		    	
		    case 2:
		    	System.out.println("-----AWS-----");
		    	System.out.println("1)Enter student info\n2)Show student info\n3)Update student info");
		    	
		    	c=sc.nextInt();
		    	switch(c)
		    	{
		    	case 1:
		    		batch.awsStudentInfoo();
		    		System.out.println();
		    		break;
		    	case 2:
		    		batch.getAllAwsStudentDetails();
		    		System.out.println();
		    		break;
		    	case 3:
		    		batch.updateAwsStudentInfo();
		    		break;
		    	}
		    	break;
		    	
		    case 3:
		    	System.out.println("Others");
		    	System.out.println();
		    	batch.searchCourses();
		    	break;
		    	
		    case 4:
		    	System.exit(0);
		    	break;
		    	
		    default: 
		    	System.out.println("Wrong choice!!");
		    }
			
		   }
	   while(true);
	}

}
