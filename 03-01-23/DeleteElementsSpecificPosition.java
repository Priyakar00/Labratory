package arrayexamples;

import java.util.Scanner;

public class DeleteElementsSpecificPosition {

	public static void main(String[] args) {
		int a[]=new int[20];
		Scanner sc=new Scanner(System.in);
		int i,num,pos;
		System.out.println("How many elements do you want to enter:");
		int ele=sc.nextInt();
		System.out.println("Enter "+ele+" elements");
		for(i=0;i<ele;i++)
		{
			a[i]=sc.nextInt();
		}
		//printing the elements before deletion
		System.out.println("Original array;");
		for(i=0;i<ele;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		System.out.println("Enter position you want to remove");
		pos=sc.nextInt();
		
		//checking the elements is valid or not
		if(pos>ele+1 || pos<0)
		{
			System.out.println("Invalid input");
		}
		else 
	   {
			//removing the elements from the position and shifting the elements in its position
			for(i=pos-1;i<ele;i++) {
				a[i]=a[i+1];
			}
			ele--; //decrementing the size
		}
		System.out.println();
		System.out.println("After removing "+pos+" th element:");
		for(i=0;i<ele;i++)
		{
			System.out.println(a[i]+" ");
		}
	}

}
