package basic;

import java.util.Scanner;

public class calculator {
	public static int addition(int a, int b) {
		int result = a+b;
		return result;
	}
	public static int subtraction(int a, int b){
		int c;
		if(a>b) {
			c=a-b;
		}
		else {
			c=b-a;
		}
	}
public static void main(String[] args) {
	int choice,num1,num2,res;
	Scanner sc=new Scanner(System.in);
	System.out.println("which operation do you want to perform?");
	System.out.println("1)addition \n 2)subtraction");
	choice=sc. nextInt();
	switch (choice)
	{
	case 1:
		System.out.println("enter thr first digit:");
		num1=sc.nextInt();
		System.out.println("enter the second digit;");
		num2 =sc.nextInt();
		res = calculator.addition(num1, num2);
		System.out.println(num1+"+"+num2+"="+res);
		break;
	case 2:
		System.out.println("enter thr first digit:");
		num1 =sc.nextInt();
		System.out.println("enter the second digit;");
		num2 =sc.nextInt();
		res = calculator.subtraction(num1, num2);
		System.out.println(num1+"-"+num2+"="+res);
		break;
	}
	}

}
