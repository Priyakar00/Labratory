package arrayexamples;

public class WrapperClass {
	
	public static void  check(int a) {
		System.out.println(a+ "is an integer.");
	}
	public static void check(char c) {
		System.out.println(c+ "is a character");
	}

	public static void main(String[] args) {
		//auto-boxing-->conversion of primitive data type into its corresponding wrapper class
		
		int a=20;
		Integer b=Integer.valueOf(a);//manually
		Integer c=a;//automatic
		System.out.println(a+" "+b+" "+c);
        
		
		//un-boxing-->conversion of object into primitive datatype
		Integer x=7;
		int y=x.intValue();//manually
		int z=x;//automatic
		System.out.println(y+" "+z);
		System.out.println(x.getClass().getName());
		WrapperClass.check(z);
	}

}
