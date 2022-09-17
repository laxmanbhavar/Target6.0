package Exception_Handeling_TCFBlock;

public class Practice2 {
	public static void main(String[] args) {
		
		int[] ar= {5,6,8,10,15};
		
		try {
		System.out.println(ar[5]);
		}
		
		catch(ArrayIndexOutOfBoundsException x){
			System.out.println("Exception is Handled");
		}
		
		System.out.println("End of program"); 
	}
}
