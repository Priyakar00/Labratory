//for printing {{1 2 3},{4 5 6 7};{8 9}}
package arrayexamples;

//import java.util.Scanner; (for taking input)

public class JaggedArray {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);(for taking input)

		int arr[][]=new int[3][];
		arr[0]=new int[3];  //1st row and 3 columns
		arr[1]=new int[4];  //2nd row and 4 columns
		arr[2]=new int[2];  //3rd row and 2 columns
		
		//initialing the jagged array
		int count=1;     //for taking any input you should take count=0
		for(int i=0; i<arr.length;i++)   //row
		{
			for(int j=0; j<arr[i].length; j++)   //column
			{
				arr[i][j]=count++;
				//arr[i][j]=sc.nextInt();(for taking input)

			}
		}
       
		//printing the array
		System.out.println("Jaggede Array");
		for(int i=0; i<arr.length;i++)   //row
		{
			for(int j=0; j<arr[i].length; j++)   //column
			{
			    System.out.print(arr[i][j]+ "  ");
			}
			System.out.println();
		}
	}

}
