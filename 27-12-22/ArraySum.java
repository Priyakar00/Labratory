//WAP to find sum of all the elements of an array
package arrayexamples;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //creating the object of scanner
		System.out.println("Enter the size of array:");
		int s= sc.nextInt(); //taking the size of an array during run time
		int a[]=new int[s];
		int sum=0;
		
		System.out.println("Enter the elements of array:");
		for(int i=0; i<s; i++) {
             a[i]=sc.nextInt();
		}
		
		//finding the sum
     for(int i=0; i<a.length; i++) {
    	 sum=sum+a[i];
     }
     System.out.println("Sum of all elements in the array:"+sum);
	}

}
