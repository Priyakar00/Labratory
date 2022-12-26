package oops;

class Rbi{
	public void loanInterest() {
		System.out.println("RBI:9% loan interest");
	}
}
class Sbi extends Rbi{
	public void loanInterest() {
		System.out.println("SBI:5% loan interest");
	}
}
class Hdfc extends Rbi{
	public void loanInterest() {
		System.out.println("HDFC:8% loan interest");
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		Rbi rbi;
		rbi=new Rbi();
		rbi.loanInterest();
		
		Rbi Sbi;
		rbi=new Rbi();
		rbi.loanInterest();
		
		Rbi Hdfc;
		rbi=new Rbi();
		rbi.loanInterest();
		
		

	}

}
