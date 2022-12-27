package abstraction;

interface Printable{ //first interface
	int x=100;    //we cannot add the body of the method so we need to implement it
	void display();
	void fun();
}

//interface-->interface(extends)
//class-->class(extends)
//class-->interface(implements)

interface Drawable extends Printable{  //second interface inheriting Printable
	void draw();
}

class Print implements Drawable{ 

	@Override
	public void display() {
		System.out.println("Hello");
		
	}

	@Override
	public void fun() {
		System.out.println("This is fun");
		
	}

	@Override
	public void draw() {
		System.out.println("Drawing is fun");
		
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		//you cannot instantiate interface,but we can create reference variable
		Print print=new Print();
		print.display();
		print.draw();
		print.fun();
		System.out.println("The value of x="+print.x);
		
	}

}
