package Basic_Java_Interview_Program;

public class reverse_string {
	public static void main(String[] args) {
		String s= "My name is Laxman";
		
				
		
		
		System.out.println("--reverse string--");
		
		for(int i=s.length()-1;i>=0;i--) { // i-- start from last index
			System.out.print(s.charAt(i)); // charAT(i) use for read string or printing charactar
			
		}
		
	}

}
