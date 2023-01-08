package bookmanagement;

import java.util.Scanner;

public class BookService {
    static Book[] book=new Book[10];
    static Scanner sc=new Scanner(System.in);
    static int index=0;
    
    //create book method
    public void createBook() {
    	System.out.println("Enter Book Id:");
    	int id =sc.nextInt();
    	
    	sc.nextLine();
    	System.out.println("Enter Book name:");
    	String bookName=sc.nextLine();
    	
    	System.out.println("Enter Author's Name:");
    	String authorName=sc.nextLine();
    	
    	System.out.println("Enter Book price:");
    	double price=sc.nextDouble();
    	
    	book[index]=new Book(id, bookName, authorName, price);
    	index++;
    	System.out.println("Book details added succesfully:");
    	System.out.println();
   	
    }
    
    public void getAllBookDetails() {
    	for(int i=0; i<index; i++) {
    		System.out.println();
    		System.out.println("Book Id:"+book[i].getBookId());
    		System.out.println("Book Name:"+book[i].getBookName());
    		System.out.println("Book Author name:"+book[i].getAuthor());
    		System.out.println("Book Price:"+book[i].getBookPrice());
    		System.out.println();
    	}
    }
    	
     public void getBookDetailsbyId() {
    	 boolean flag=false;
    	 System.out.println("Enter book Id:");
    	 
    	 int id=sc.nextInt();
    	 for(int i=0; i<index; i++) {
    		 if(id==book[i].getBookId()) {
    			 System.out.println();
    	    		System.out.println("Book Id:"+book[i].getBookId());
    	    		System.out.println("Book Name:"+book[i].getBookName());
    	    		System.out.println("Book Author name:"+book[i].getAuthor());
    	    		System.out.println("Book Price:"+book[i].getBookPrice());
    	    		System.out.println();
    	    		flag=true;
    		 }
    	 }
    	 if(flag==false) {
    		 System.out.println("Invalid id try again.");
    		 System.out.println();
    	 }
     }
     
     public void getBookDetailsbyName() {
    	 boolean flag=false;
    	 System.out.println("Enter book name: ");
    	 
    	 sc.nextLine();
    	 String bookName=sc.nextLine();
    	 for(int i=0; i<index; i++) {
    		 if(bookName.equalsIgnoreCase(book[i].getBookName()))
    		 {
    			    System.out.println();
    	    		System.out.println("Book Id:"+book[i].getBookId());
    	    		System.out.println("Book Name:"+book[i].getBookName());
    	    		System.out.println("Book Author name:"+book[i].getAuthor());
    	    		System.out.println("Book Price:"+book[i].getBookPrice());
    	    		System.out.println();
    	    		flag=true;
    		 }
    	 }
    	 if(flag==false) {
    		 System.out.println("Invalid name try again.");
    		 System.out.println();
    	 }
     }

public void getBookDetailsbyAuthor() {
	boolean flag=false;
	System.out.println("Enter Author name: ");
	
	sc.nextLine();
	String author=sc.nextLine();
	for(int i=0; i<index;i++) {
		if(author.equalsIgnoreCase(book[i].getAuthor())){
			System.out.println();
    		System.out.println("Book Id:"+book[i].getBookId());
    		System.out.println("Book Name:"+book[i].getBookName());
    		System.out.println("Book Author name:"+book[i].getAuthor());
    		System.out.println("Book Price:"+book[i].getBookPrice());
    		System.out.println();
    		flag=true;
		}
	}
	if(flag==false) {
		System.out.println("Invalid author try again.");
		System.out.println();
	}

   }
    
}
