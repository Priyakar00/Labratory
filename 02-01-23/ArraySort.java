package arrayexamples;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
    int a[]= {12,10,9,5,8,43};
    Arrays.sort(a);
    System.out.println("Sorting elements :(assending order)");
    for(int var: a) {
	System.out.print(var+" ");
    }

	}

}

