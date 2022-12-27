package abstraction;
//another way of performing multiple inheritance

abstract class B{  //declaring an abstract class
	abstract void display();
	
	public void demo() { //concrete method
		System.out.println("Abstract class");
	 }
	}

interface C //declaring an interface
{
	void add(int a, int b);
}

class D extends B implements C{

	@Override
	public void add(int a, int b) {
		System.out.println("The sum is:"+(a+b));
		
	}

	@Override
	void display() {
		System.out.println("Multiple inheritance achieved!!");
		
	}
	
}
public class MultipleInheritance {

	public static void main(String[] args) {
		D d=new D();
		d.demo();
		d.add(20, 30);
		d.display();
	
	}

}
