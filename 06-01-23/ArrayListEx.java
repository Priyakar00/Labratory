package Collections;

import java.util.ArrayList;
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
		
		
	}

}
