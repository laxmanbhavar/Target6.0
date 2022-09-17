package Basic_Java_Interview_Program;

public class find_eachword_Chractercount_instring {

	public static void main(String[] args) {
		String str="This is java program";
		String[] s = str.split(" ");  
		for(int i=0;i<=s.length-1;i++) {
			System.out.println(s[i]+": "+s[i].length());
			
			
		}					

	}
}
