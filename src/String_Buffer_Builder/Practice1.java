package String_Buffer_Builder;

public class Practice1 {
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("This is String Buffer Program");
		System.out.println(s1);
		System.out.println(s1.append(" Execute in java"));
		System.out.println(s1);
		System.out.println(s1.append(" its executed"));
		System.out.println(s1); //mutable behaviour:- change behavior
		System.out.println(s1.reverse()); // reverse string using reverse method
		
//when we perform some operation on string object then its original behaviour will get chenge
// is called mutable behaviour. stored in heap area  or performance is low.
	}

}
