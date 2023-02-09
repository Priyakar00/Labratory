package thursdaywork;

import java.util.Scanner;

public class MaxMinNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,s;
		System.out.println("Enter the size of array:");
		s=sc.nextInt();
		int ar[]=new int[s];
		System.out.println("Enter "+s+" elements:");
		for(i=0;i<s;i++)
		{
			ar[i]=sc.nextInt();
			
		}
       System.out.println("Array:");
       for(i=0;i<s; i++)
       {
    	   System.out.print(ar[i]+" ");
    	   
       }
       System.out.println();
       int max=ar[0];
       int min=ar[0];
       
       for(i=0;i<s;i++)
       {
    	   if(ar[i]>max)
    	   {
    		   max=ar[i];
    	   }
    	   else if (ar[i]<min)
    	   {
    		   min=ar[i];
    		   
    	   }
       }
       System.out.println("Maximum Number:"+max);
       System.out.println("Minimum Number:"+min);
	}


	}


