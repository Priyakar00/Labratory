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


interface Sayable{ //third interface
	void say();
	int x=10;
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

//using interface we can perform multiple inheritance(though not supported in java)

class Message implements Drawable,Sayable{//we can solve the DIAMOND PROBLEMS using inheritance
	//a class can inherit any number of interface                                       

	@Override
	public void display() {
		System.out.println("Hello");
		
	}

	@Override
	public void fun() {
		System.out.println("This is fun");
		
	}

	@Override
	public void say() {
		System.out.println("Speaking is fun");
		
	}

	@Override
	public void draw() {
		System.out.println("drawing id fun");
		
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
		
		System.out.println("----------------------");
		
		Message message=new Message();
		message.display();
		message.fun();
		message.say();
		message.draw();
		System.out.println("The value of x="+Sayable.x);//printing the value of x using reference variable
		
	}

}
