package Exception_Handeling_TCFBlock;

import java.io.EOFException;

public class Practice3_Generic {
	public static void main(String[] args) {
		int a=50;
		int b=5;
		try {
		String str=null;  // Risky Code
		System.out.println(str.length()); 
		}
		catch(ArithmeticException x){ //catch block
			System.out.println("Exception is Handled");
		}
		
		catch(ArrayIndexOutOfBoundsException s){
			System.out.println("Exception is Handled");
		}
		catch(Exception z) {
			System.out.println("Handle Generic Exception");
		}
		System.out.println("End of program");
		
	}

}
