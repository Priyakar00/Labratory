package oops;

class Company{
	int compId;
	String compName;
	
	Address address;//entity reference

	public Company(int compId, String compName, Address address) {
		super();
		this.compId=compId;
		this.compName=compName;
		this.address=address;
	}

	//getter method
	public int getCompId() {
		return compId;
	}

	public String getCompName() {
		return compName;
	}

	public Address getAddress() {
		return address;
	}
	
}


public class AggregationDemo {

	public static void main(String[] args) {
		Address address1=new Address(700001, "Kolkata", "West Bengal", "India");
		Address address2=new Address(100000, "New York city", "New York", "USA");
		
		Company company1=new Company(100, "Anudip Foundation", address1);
		Company company2=new Company(120, "Anudip Foundation USA", address2);
		
        System.out.println("First Company:" +company1.getCompName());
        System.out.println("Address:" +company1.getAddress().getCity());
        
        System.out.println();
        
        System.out.println("Second Company:" +company2.getCompName());
        System.out.println("Address:"+company2.getAddress().getCity());
	}

}
