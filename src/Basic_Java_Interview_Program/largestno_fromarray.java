package Basic_Java_Interview_Program;

import java.util.Arrays;

public class largestno_fromarray {
	public static void main(String[] args) {
		int num[]= {10,20,78,45,89,456,785,496};
		Arrays.sort(num);
		for(int i=0;i<=num.length-1;i++) {
			System.out.println(num[i]);
		}
		System.out.println("Largest value is"+num[num.length-1]);
	}

}
