package arrayexamples;

import java.util.Scanner;

public class SearchNumber {

	public static void main(String[] args) {
	int size,i;
	Scanner sc=new Scanner(System.in);
	//initializing the pos -1 as the 1st element on array is stored as index 0
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
	
	//searching for the elements
	for(i=0;i<size;i++) 
	{
		if(ar[i]==search) //checking the search elements with index elements
		{
			pos =i; //storing the position of index in position
			break;//if we find the number we break the loop
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
