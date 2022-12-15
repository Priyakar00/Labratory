import java.util.Scanner;

public class vowel{
	public static void main(String[]args){
	Scanner sc= new Scanner(System.in);
	char c;
	System.out.println("Enter a character:");
	c= sc.next().charAt(0);
	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
	{
		System.out.println("The character is a vowel");
	}
	else
	{
		System.out.println("The character is a consonant");
	}
	}
}
