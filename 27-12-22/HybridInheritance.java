package abstraction;

class Dance{//parent class
	public void display() {
		System.out.println("Here is some dance form");
	}
}

class Bihu extends Dance{//child class
    public void location() {
    	System.out.println("Bihu located Asaam");
    }
}

abstract class Bharatnatyam extends Bihu{  //declaring an abstract class 
	abstract void display1();
	
	public void demo() { //concrete method
		System.out.println("Bharatnatyam located Tamilnadu");
	 }
	}
interface Bhangra{
	void display2();
	
}

class Kathakali extends Bharatnatyam implements Bhangra{

	@Override
	public void display1() {
		System.out.println("Kathakali located kerala");
		
		
	}

	@Override
	public void display2() {
		System.out.println("Bhangra located Punjab");
		
	}
	
}


public class HybridInheritance {

	public static void main(String[] args) {
		Kathakali dance=new Kathakali();
		dance.display();
		dance.location();
		dance.demo();
		dance.display1();
		dance.display2();
		
	}

}
