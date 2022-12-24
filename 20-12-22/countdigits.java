package oops;

import java.util.Scanner;

public class countdigits {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num,first_digit=0, last_digit=0, temp;
		System.out.println("Enter a number:");
		num=sc.nextInt();
		temp=num;
	     
		last_digit=num%10;
		System.out.println("The last digits of"+num+ "is:" +last_digit);
		
		for(;num>=10;)
        {
     	   num=num/10;
     	   first_digit=num;
        }
	     System.out.println("The first digit of" +temp+ "is:" +first_digit);
           
	}
	}
