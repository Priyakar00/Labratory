package oops;

public class Address {

	int pincode;
	String city,state,count;
	
	
	public Address(int pincode, String city, String state, String count) {
		super();
		this.pincode = pincode;
		this.city = city;
		this.state = state;
		this.count = count;
	}
	
//no argument constructor	
	public Address() {
		super();
	}



	public int getPincode() {
		return pincode;
	}

//getter and setter
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getCount() {
		return count;
	}



	public void setCount(String count) {
		this.count = count;
	}
	
		
	
	
	
	
	
	
}
