package String_Class;

public class Practice {
	public static void main(String[] args) {		
		String s1 = new String("with String Buffer");
		String s2 = new String("with String Buffer"); // duplicate are allowed store in pool Area
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.concat("write java program"));
		System.out.println(s1); //memory allocate many times
		//String class:  Immutable- bheviour not change
		//sored in pool area
		//Performance is high
	}

}
