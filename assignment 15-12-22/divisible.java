import java.util.Scanner;

public class divisible{
	public static void main(String[]args){
		int num;
	     Scanner sc= new Scanner(System.in);
	     System.out.println("Enter a number:");
	     num = sc.nextInt();
	     if(num%5==0 && num%11==0)
	     {
	     	System.out.println("The no is divisible by both 5 and 11 ");
	    }
	      else
	     {
	    	System.out.println("The no is not divisible by both 5 and 11");
    	}
	}
}
