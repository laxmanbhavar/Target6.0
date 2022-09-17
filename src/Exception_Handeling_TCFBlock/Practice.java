package Exception_Handeling_TCFBlock;

public class Practice {
	public static void main (String[]args) {
		int a=50;
		int b=0;
		
		try {           // try block
		int c=a/b;      // Risky code means thats code in jvm faces abnormal situation.
		System.out.println(c);
		}
		catch(ArithmeticException x){ //catch block
			System.out.println("Exception is Handled");
			b=10;        // after exception found then code will pre- defined or reused
			int c=a/b;
			System.out.println(c);
		}
		
		System.out.println("Program execute");
		
	}

}
