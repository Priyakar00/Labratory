package arrayexamples;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input number of elements:");
		int a=sc.nextInt();
		int arr[]=new int [a];
		System.out.println("Input array elements:");
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
		int copyArray []=new int[arr.length];
		for(int i=0;i<arr.length;i++) 
		{
			copyArray[i]=arr[i];
		}
		
		
		System.out.println("Old array:"+Arrays.toString(arr));
		
		System.out.println("New array:"+Arrays.toString(copyArray));
		
		sc.close();
	}

}
