package arrayexamples;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int ar[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements:");
		for(int i=0; i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		Arrays.sort(ar);
		System.out.println("Sorted Arrays are:");
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println("\nEnter elements to search:");
		int ele=sc.nextInt();
		int result=Arrays.binarySearch(ar, ele);
		
		if(result<0) {
			System.out.println("Element not found.");
		}
		else {
			System.out.println("Elements presents in position:"+(result+1));
		}

	}

}
