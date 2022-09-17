package javabysk;

public class palindrome {
	public static void main(String[] args) {

		String s = "11 1";

		String revstr = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			// System.out.println(s.charAt(i)); // string to char convert

			revstr = revstr + s.charAt(i); //
		}
		System.out.println(revstr);

		if (s.equals(revstr)) {
			System.out.println("given number is palindrom");
		} 
		else {
			System.out.println("given number is not palindrom");
		}

	}

}
