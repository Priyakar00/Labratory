
package basic;

import java.util.Scanner;

public class countNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num,temp;
		System.out.println("Enter a number:");
		num=sc.nextInt();
		temp=num;
		System.out.println();
           System.out.println("Using while loop");
           int count=0;
           while(num!=0)
           {
        	   num=num/10;
        	   count++;
           }
	     System.out.println("No of digits in" +temp+ "is:" +count);
	}
	}

