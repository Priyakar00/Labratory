package arrayexamples;

import java.util.Scanner;

public class CountOccurance {
	public static int countOcc(String input,char search) {
		int count=0;
		for(int i=0;i<input.length();i++)
		{
			if(search==input.charAt(i)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String input=sc.nextLine();
		System.out.println("Enter which occurance to find:");
		char search=sc.next().charAt(0);
		
		System.out.println("No of occurance of "+search+" is: "+countOcc(input, search));
	}

}
