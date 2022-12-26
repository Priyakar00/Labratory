package abstraction;

public class BlankFinalStaticVar {
	
	static final int data;
	static {
		data=10;
	}
	
	public int cube(final int n)
	{
		return n*n*n;
		}
	
	
	public static void main(String[] args) {
		 
     BlankFinalStaticVar blank=new BlankFinalStaticVar();
     System.out.println("Cube of the data is:"+blank.cube(10));
	}

}
