package arrayexamples;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortDecs {
public static void main(String[] args) {
	int b[]= {45,77,34,23,21};
	int temp=0;
	System.out.println("Original arrays:");
	for(int i=0; i<b.length; i++) {
		System.out.print(b[i]+" ");
	}
	System.out.println();
	for(int i=0;i<b.length;i++)
	{
		for(int j=i+1;j<b.length;j++) 
		{
			if(b[i]<b[j]) {
			temp=b[i];
			b[i]=b[j];
			b[j]=temp;
			}
		}
	}
	System.out.println();
	System.out.println("Sorted array:(Descending order");
	
	for(int i=0;i<b.length;i++) {
		System.out.print(b[i]+" ");
	}
	//second sorter method
	System.out.println();
	System.out.println("Second method");
	Integer arr[]= {12,55,99,35,9};
	Arrays.sort(arr,Collections.reverseOrder());
	System.out.println("Sorted array(2nd method):(descending order)");
	for(int i=0; i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}
}
