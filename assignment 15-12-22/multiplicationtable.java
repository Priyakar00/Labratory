import java.util.Scanner;

public class multiplicationtable{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int i,n,result;
	     n=sc.nextInt();
		for(i=0; i<=10; i++)
		{
			result=n*i;
			System.out.println(n+ "*" +i+ "=" +result);
		}
	}
}
