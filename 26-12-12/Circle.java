package abstraction;

import java.util.Scanner;

public class Circle {
	final double pi=3.14;
	
	public double CalculateArea(double pi, int radious)
	{
		double area;
		area= pi* radious* radious;
		return area;
	}
	
	public double CalculateCircum(double pi, int radious) {
		double cir;
		cir=2* pi* radious;
		return cir;
	}
	
	
	public static void main(String[] args) {
		Circle circle=new Circle();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the radious");
		int r=sc.nextInt();
			double result1=circle.CalculateArea(circle.pi, r);
			System.out.println("Area of circle is:"+result1);
			
			double result2=circle.CalculateCircum(circle.pi, r);
			System.out.println("Area of circle is:"+result2);
			
			
			
			
			
			
			
	}

}
