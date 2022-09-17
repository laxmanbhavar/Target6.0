package Collections_02;

import java.util.HashSet;

public class Set_01 {
	public static void main(String[] args) {
		HashSet h=new HashSet();
		
		System.out.println(h.isEmpty());
		System.out.println(h.size());
		
		h.add("laxman");
		h.add('b');
		h.add("bhavar");
		h.add(7767);
		h.add(null);
		h.add("laxman");
		System.out.println(h.isEmpty());
		System.out.println(h.size());
		System.out.println(h);
		System.out.println(h.contains('a'));
		
	}

}
