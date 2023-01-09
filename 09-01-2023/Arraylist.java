package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		System.out.println(list.size());
		list.add(11);     //adding elements in arrays
		list.add(12);
		list.add(13);
		System.out.println(list);
		System.out.println(list.size());
		list.add(14);
		list.add(15);
		System.out.println(list);
		System.out.println(list.size());
		
		ArrayList<Integer> arrlist=new ArrayList<Integer>();
		System.out.println(arrlist.size());
		arrlist.add(15);
		arrlist.add(16);
		System.out.println(arrlist);
		
		int arr[]= {1,2,3,4,5};
		arr[1]=6;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");	
		}
		
		System.out.println();
		
		list.add(1, 16);
		System.out.println(list);
		System.out.println(list.size());
		
		list.remove(1);
		System.out.println(list);
		System.out.println(list.size());
		
		list.set(1, 17);
		System.out.println(list);
		
		list.replaceAll(a -> a+5);
		System.out.println(list);
		
		
		//print elements using for each loop
		System.out.println("Using for each loop:");
		for(Integer a: list)
		{
			System.out.println(a);
		}
		
		//using while loop
		int count=0;
		System.out.println("Using while loop:");
		while(count<list.size()) {
			System.out.println(list.get(count));
			count++;
		}
		
		//Using Iterator
		Iterator itr= list.iterator();
		System.out.println("Using Iterator:");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//sort array list in ascending order
		Collections.sort(list);
		System.out.println("Sorting in ascending order:");
		System.out.println(list);
		
		//sort arraylist descending order
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Sorting in descending order:");
		System.out.println(list);
		
		//copy array list
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.addAll(list);
		System.out.println("Copied list:"+list2);
		
		//sublist
		List<Integer> sublist= new ArrayList<Integer>();
		System.out.println(sublist);
		
		//for searching any elements
		System.out.println(list.contains(77));
		
	}

}
