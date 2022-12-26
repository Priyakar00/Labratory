package abstraction;
class Vehicle
{
	final void speed() {
		System.out.println("The speed is:1000km/hr");
		
	}
}

public class FinalKeywordDemo extends Vehicle{
	
	final int a=100;
	
	public static void main(String[] args) {
		FinalKeywordDemo demo=new FinalKeywordDemo();
		System.out.println(demo.a);
		demo.speed();
		
	}
}

