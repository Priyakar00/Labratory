package abstraction;

abstract class Bank{
	abstract public void getloanInterest();
	
	public void display() {
		System.out.println("This is a bank class..");
	}
}

class Sbi extends Bank{

	@Override
	public void getloanInterest() {
		
		System.out.println("SBI is providing 6.5% interest");
		
	}
	
}

class Hdfc extends Bank{

	@Override
	public void getloanInterest() {
	System.out.println("HDFC is providing 7.5% interest");
		
	}
	
}

public class AbstractDemo {

	public static void main(String[] args) {
	Bank bank;
	bank=new Sbi();
	bank.getloanInterest();
	bank.display();
	
	bank=new Hdfc();
	bank.getloanInterest();

	}

}
