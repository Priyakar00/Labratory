package thursdaywork;

import java.util.Scanner;

public class SearchElements {

	public static void main(String[] args) {
		int size,i;
		Scanner sc=new Scanner(System.in);
		int pos=-1;
		System.out.println("Enter the size of array:");
		size=sc.nextInt();
		int ar[]=new int[size];
		System.out.println("Enter "+size+" elements:");
		for(i=0;i<size;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Enter which elements you want to search:");
		int search=sc.nextInt();
		
	
		for(i=0;i<size;i++) 
		{
			if(ar[i]==search) 
			{
				pos =i; 
				break;
			}
		}
		
		if(pos!=-1) 
		{
			System.out.println("The elements "+search+" is presents in: "+(pos+1)+" position");
		}
		
		else 
		{
			System.out.println("Data not found in array");
		}
	 }

	

}
