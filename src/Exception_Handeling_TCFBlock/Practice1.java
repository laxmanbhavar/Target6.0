package Exception_Handeling_TCFBlock;

public class Practice1 {
	public static void main(String[] args) {
		String str=null;
		
		try {
		System.out.println(str.length()); //Risky code jvm faces abnormal situation.
		}
		
		catch(NullPointerException a) {   // catch block exception is handled.
			System.out.println("Exception is Handled");
		}
		
		
		System.out.println("program cant execute");
	}

}
