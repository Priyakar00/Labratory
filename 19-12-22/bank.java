package basic;

import java.util.Scanner;

public class bank {
	public static double deposit(double a, double b) {
		double result= a+b;
		System.out.println("now available balance is:"+result);
	    return result;
	}
	public static double withdraw(double a, double b) {
		double c=0;
		if(a>b) {
			c=a-b;
			System.out.println("now available balance is:"+c);
		}
		else {
			System.out.println("In sufficient balance");
		}
		return c;
	}
	public static void main(String[] args) {
    double num1,num2,res,num3,num4,result;
    Scanner sc=new Scanner(System.in);
    System.out.println("which operation you want to perform");
	System.out.println("1)deposit /n 2)withdraw");
	int choice=sc. nextInt();
	switch (choice) {
	case 1:
		System.out.println("enter your current balance");
		num1=sc.nextDouble();
		System.out.println("enter deposit amount");
		num2=sc.nextDouble();
		res=bank.deposit(num1,num2);
		break;
	case 2:
		System.out.println("enter your current balance:");
		num3 =sc.nextDouble();
		System.out.println("enter withdraw amount");
		num4 =sc.nextDouble();
		result =bank.withdraw(num3, num4);
		break;
	}

}
}
