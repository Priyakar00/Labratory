package thursdaywork;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,s;
		System.out.println("Enter the size of an array: ");
		s = sc.nextInt();
		int ar[] = new int[s];
		System.out.println("Enter elements: ");
		for(i=0; i<s; i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Array: ");
		for(i=0;i<s;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println("Reversed Array: ");
		for(i=s-1;i>=0;i--)
		{
			System.out.print(ar[i]+" ");
		}

	}

	

}
