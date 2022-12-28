package arrayexamples;

public class ArrayCreation {

	public static void main(String[] args) {
		//creating an array in compile time
		int arr[]= {2,3,5,8};
		
		String name[]= {"Rahul", "Sunita", "Lokesh", "Priya","madhurima"};
		
		
        System.out.println("The length od array name is:" +name.length);
        System.out.println("The length od array integer:"+arr.length);
        
        for(int i=0; i<name.length; i++) {
        	System.out.println(name[i]);
        }
	}

}

