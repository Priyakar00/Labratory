package arrayexamples;

import java.util.Scanner;

public class AddElementsSpecifiicPosition {

	public static void main(String[] args) {
		int ar[]=new int[20];
		Scanner sc=new Scanner(System.in);
		int i,num,pos;
		System.out.println("How many elements do you want to enter:");
		int ele=sc.nextInt();
		System.out.println("Enter "+ele+ " elements:");
		for(i=0;i<ele;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Original array:");
		for(i=0;i<ele;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		System.out.println("Enter element which you want to insert:");
		num=sc.nextInt();
		
		System.out.println("Enter which position you want to insert:");
		pos=sc.nextInt();
		
		//if the position is valid or not
		if(pos>ele+1 ||pos<0)
		{
			System.out.println("Invalid position");
		}
		else 
		{
			//making room for new elements
			for(i=ele;i>=pos;i--)
			{
				ar[i]=ar[i-1];
			}
			ar[pos-1]=num;//taking pos-1 for set the entered position value at sequence
			ele++;
			
			System.out.println("Array after insertion:");
			for(i=0;i<ele;i++)
			{
				System.out.print(ar[i]+" ");
			}
		}

	}

}
