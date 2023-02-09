package thursdaywork;

import java.util.Scanner;

public class FirstLastDigit {

	public static void main(String[] args) {
		int number;
		int firstDigit = 0;
		int lastDigit = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		number = sc.nextInt();
		lastDigit = number%10;
		System.out.println("Last Digit of a number is: "+lastDigit);
		while(number!=0)
		{
			firstDigit = number%10;
			number /= 10;
		}
		System.out.println("First Digit of a number is: "+firstDigit);

	}

}
