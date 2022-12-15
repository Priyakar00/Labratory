public class factorial{
	public static void main(String[]args){
		int i;
		int factorial=1;
		System.out.println("factorials");
		for(i=1; i<=10; i++)
		{
			factorial*=i;
			System.out.println("factorial of" +i+ "is" +factorial);
		}
	}
}
