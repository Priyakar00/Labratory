package bookmanagement;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		BookService bservice=new BookService();
		int ch;
		do {
			System.out.println("Welcome to Book Management System.");
			System.out.println("1)Creat book details.\n 2)Get all book details.\n 3)Get book details by book Id.\n 4)Get book details by name.\n 5)Get book details by author name.\n 6)Exit ");
			System.out.println();
			System.out.println("Input : ");
			ch=sc.nextInt();
			
			switch (ch) {
			case 1:{
				bservice.createBook();
				System.out.println();
				break;
			}
			case 2:{
				bservice.getAllBookDetails();
				System.out.println();
				break;
			}
			case 3:{
				bservice.getBookDetailsbyId();
				System.out.println();
				break;
			}
			case 4:{
				bservice.getBookDetailsbyName();
				System.out.println();
				break;
			}
			case 5:{
				bservice.getBookDetailsbyAuthor();
				System.out.println();
				break;
			}
			case 6:{
				System.out.println("Thank you");
				System.exit(0);
			}
			default :{
				System.out.println("Invalid input tray again.");
			}
			}
		}
		while (ch !=6);
	}

}
