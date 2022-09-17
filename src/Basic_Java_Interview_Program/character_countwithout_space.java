package Basic_Java_Interview_Program;

public class character_countwithout_space {
	public static void main(String[] args) {
		String str= "this is java program";
		
		System.out.println(str.length());
		String s1 = str.replace(" ", "");
		System.out.println(s1.length());

	}
	
	
}
