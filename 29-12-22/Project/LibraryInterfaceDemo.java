package abstraction;

import java.util.Scanner;
interface LibraryUser{
	void registerAccount();
	void registerBook();
}
class KidUser implements LibraryUser{
    int age;
    String bookType;
    Scanner sc=new Scanner(System.in);
	@Override
	public void registerAccount() {
		System.out.println("Enter your age:");
		age=sc.nextInt();
		
		if(age<=12) {
			System.out.println("You have Successfully registered under a Kids Account");
			
			
		}
		else {
			System.out.println("Sorry,Age must be less than 12 to register as a kid");
		}
	}

	@Override
	public void registerBook() {
		System.out.println("Enter your book type:");
		bookType=sc.next();
		
		if(bookType.equalsIgnoreCase("Kids")) {
			System.out.println("Book issued succesfully,please return the book within 10 days");
		}
		else {
			System.out.println("Oops,you are allowed to take only Kids books");
		}
		
	}
	
}

class AdultUser implements LibraryUser{
	 int age;
	 String bookType;
	 Scanner sc=new Scanner(System.in);
	@Override
	public void registerAccount() {
		System.out.println("Enter your age:");
		age=sc.nextInt();
		if(age>12) {
			System.out.println("You have Successfully registered under a Adults Account");
		}
		else {
			System.out.println("Sorry,Age must be greater than 12 to register as an adult");
		}
		
	}

	@Override
	public void registerBook() {
		System.out.println("Enter your book type:");
		bookType=sc.next();
		
		if(bookType.equalsIgnoreCase("Fiction")) {
			System.out.println("Book issued succesfully,please return the book within 7 days");
		}
		else {
			System.out.println("Oops,you are allowed to take only adult Fiction books");
		}
		
	}
	
}

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		KidUser kid=new KidUser();
		AdultUser adult=new AdultUser();
		do {
			System.out.println("Welcome to Central Library");
			System.out.println("Which book you want?\n1)Kids\n2)Fiction\n3)Exit");
			
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				{
					
				    System.out.println("1)Register\n2)Borrow");
			        int c=sc.nextInt();
				
			    	switch(c){
			    	    case 1:
			    		kid.registerAccount();
		            
				
			            case 2:
			    	    kid.registerBook();
                        break;
			        	}
				
				
				}
			    	break;
			case 2:
				      System.out.println("1)Register\n2)Borrow");
				      int ch=sc.nextInt();
				      
				      switch(ch) {
				          case 1:
				    	  adult.registerAccount();
				    
				    	  
				          case 2:
				    	  adult.registerBook();
				    	  break;
				      }
				     break; 
			case 3:
				System.exit(0);
			default:
				System.out.println("Wrong choice!!");
			}
		}
		while (true);
		
	}

}

