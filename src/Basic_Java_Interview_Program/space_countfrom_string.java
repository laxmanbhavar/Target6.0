package Basic_Java_Interview_Program;

public class space_countfrom_string {
	public static void main(String[] args) {
		String str= " I Love My India";
		int count=0;
		for(int i=0;i<=str.length()-1;i++) {
			char s = str.charAt(i);
			
			if(s==' ') { 
				count++;
				
			}
		}			System.out.println(count);

	
	}
}
