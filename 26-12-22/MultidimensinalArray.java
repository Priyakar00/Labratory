package arrayexamples;

public class MultidimensionalArray {

	public static void main(String[] args) {
		
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(arr[0][0]);
		
		 for(int i=0;i<3;i++) //row
		 {
			 for(int j=0;j<3;j++) //column
			 {
				 System.out.print(arr[i][j]+" ");
			 }
			 System.out.println();
		 }

	}

}
