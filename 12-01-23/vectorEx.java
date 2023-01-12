package Collections;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		Vector<String> vec=new Vector<String>(5);
		
		vec.add("Riya");
		vec.add("Priya");
		vec.add("Rita");
		vec.add("Gita");
		vec.add("Lita");
		
		System.out.println(vec);
		System.out.println("Size of vctor:"+vec.size());
		System.out.println("Default capacity:"+vec.capacity());
		
		System.out.println();
		
		vec.addElement("Sunita");
		vec.addElement("Madhu");
		
		System.out.println("Size of vector:"+vec.size());
		System.out.println("Default capacity:"+vec.capacity());
	}

}
