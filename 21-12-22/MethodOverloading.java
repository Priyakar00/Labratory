package oops;
class Addition{
	public void add(int a) {
		
	
	//if we don't give brackets then +sign will be taken as concatenation
	//this is why we use brackets to add
	
	System.out.println("Addition of one parameter:"+(a+10));
}
	public void add(int a, int b,int c) {
		System.out.println("Addition of three parameter:"+(a+b+c));
	}
	public void add(double a, double b) {
		System.out.println("Addition of the parameter(double,double):"+(a+b));
	}
	public void add(int a, double b) {
		System.out.println("Addition of the parameter(int,double):"+(a+b));
	}
	
	
}


public class MethodOverloading {

	public static void main(String[] args) {
	
		Addition a=new Addition();
        a.add(11);
        a.add(10,11,12);
        a.add(34.98,89.65);
        a.add(23,34.98);
	}

}
