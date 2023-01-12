package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String> name= new LinkedList<String>();
		
		name.add("Amrita");
		name.add("Priya");
		name.add("Madhurima");
		name.add("Priti");
		
		System.out.println(name);
		System.out.println();
		
		//printing the strings using for each loop
		System.out.println("Using for each loop:");
		for(String a: name)
		{
			System.out.println(a);
		}
		System.out.println();
		
		//printing the strings using while loop
		System.out.println("Using while loop:");
		int count=0;
		while(count<name.size()) {
			System.out.println(name.get(count));
			count++;
		}
		System.out.println();
		//printing the strings using iterator 
		Iterator itr= name.iterator();
		System.out.println("Using Iterator:");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println();
		System.out.println("Performing adding operations:");
		name.addFirst("Sunita");//adding at first index
		name.addLast("Suborno");//adding at last index
		name.add(2, "Lokesh");//adding at index 2
		System.out.println(name);
		
		System.out.println();
		System.out.println("Performing removing operations:");
		name.removeFirst();//remove from first index 
		name.removeLast();//remove from last index
		System.out.println(name);
		name.remove(2);//remove from index 2
		System.out.println(name.remove("Lokesh"));//removing using object
		System.out.println(name);
		
		System.out.println();
		
		//replacing string using set
		name.set(1,"Lokesh");
		System.out.println(name);
		//String a=name.get(0);
		//System.out.println(a);
		System.out.println(name.get(0));//storing the value using get
		System.out.println(name);
		
		/*name.removeAll(name);//remove the value by passing variable
		System.out.println(name);
		//removing all the linked list 
		name.clear();
		System.out.println(name);*/
		
		
		ListIterator listit=name.listIterator();
		System.out.println("Forward direction:");
		while(listit.hasNext()) {
			System.out.println(listit.next());
		}
		System.out.println();
		
		System.out.println("Backward Direction:");
		while(listit.hasPrevious()) {
			System.out.println(listit.previous());
		}
		System.out.println();
		
		System.out.println("Printng in reverse using descending iterator:");
		Iterator itr1=name.descendingIterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a name to check:");
		String str=sc.next();
		//checking the contents using if loop using contains keyword
		if(name.contains(str)) {
			System.out.println("Data is present.");
		}
		else {
			System.out.println("Dta is not present.");
		}
		
		name.add("Sabdik");
		System.out.println(name);
		System.out.println(name.lastIndexOf("Rahul"));
		
		System.out.println();
		
		name.push("Sohel");
		System.out.println(name);
		
		System.out.println();
		
		name.pop();
		System.out.println("Element pooped:"+name.pop());
		System.out.println(name);
		System.out.println();
		System.out.println("Element poll:"+name.poll());
		System.out.println(name);
		
		System.out.println("Poll first:"+name.pollFirst());
		System.out.println(name);
		
		System.out.println("Poll last"+name.pollLast());
		System.out.println(name);
		
		name.push("Sandeep");
		name.push("Arnab");
		//convert linked list into array
		List<String> arlist=new ArrayList<>(name);
		System.out.println();
		System.out.println(name);
		System.out.println();
		//convert linked list in to array list
		String array[]=name.toArray(new String[name.size()]);
		System.out.println("Converting linked list to array ");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]+" ");
		}
		System.out.println();
	}

}
