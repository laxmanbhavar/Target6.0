package String_program;

public class even1 {
	public static void main(String[] args) {
		int odd=0;
		 for(int i=1;i<=100;i++) {
			 if(i%2!=0) {                // odd number condition
				 System.out.print(i+" ");
				
				 odd++;
				
			 } 
		 }System.out.println();
		
		 System.out.println("total odd number between 1 to 100:"+odd);
		
		
		
	}

}
