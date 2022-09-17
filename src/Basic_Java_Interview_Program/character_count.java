package Basic_Java_Interview_Program;

public class character_count {
	public static void main(String[] args) {
		String str= "I am tester";
		String[] s = str.split(" ");
		String revstr=""; // to decleare a store   reverse string 
		for(String str1:s) {
			String str1rev="";  // to store a reverse word
			
		
		for(int i=str1.length()-1;i>=0;i--) { // use to read by descending order
			
			str1rev=str1rev+str1.charAt(i);  // use to reverse word
		}
		//revstr=revstr+str1rev+" ";
		System.out.println(str1rev);
		}
		
		
		//System.out.println(revstr);
		
		
		
		
	}

}
