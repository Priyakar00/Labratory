//WAP to find out the total sum of odd or even numbers in an array
package arrayexamples;

import java.util.Scanner;

public class OddEvenSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //creating the object of scanner
		System.out.println("Enter the size of array:");
		int s= sc.nextInt(); //taking the size of an array during run time
		int a[]=new int[s];
		int i,sumo=0,sume=0,ecount=0,ocount=0;
		
		//taking input
		System.out.println("Enter the elements of array:");
		
		for(i=0; i<s; i++) {
             a[i]=sc.nextInt();
		}
		
		for(i=0; i<s; i++) {
  	   if((a[i])%2==0){
  		   ecount=ecount+1;
  		   sume=sume+a[i];
  	   }
  	   else {
  		   ocount=ocount+1;
  		   sumo=sumo+a[i];
  	   }
    }
		System.out.println();
		System.out.println("Total Even number:" +ecount);
		System.out.println("Total Odd number:" +ocount);
		System.out.println("Total Even numbers "+sume);
     System.out.println("Total Odd numbers "+sumo);
     
	}

	
}
