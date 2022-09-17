package this_and_supr_Keyword;

public class Sub_Class extends Super_Class { // sub class
	
	int a=30; // global variable or instance variable
	
	public void m1() {
		int a=40; //Local Variable 
		System.out.println(a);
		System.out.println(this.a); //global and local variable nme should be same 
		                           // to access global variable into local method then use this keyword
		System.out.println(super.a);// Inherit variable and local variable  name should be same then use super keyword
		
		
	}
	public static void main(String[] args) {
		Sub_Class s =new Sub_Class();
		s.m1();
		
		
	}

}
