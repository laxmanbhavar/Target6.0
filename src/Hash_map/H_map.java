package Hash_map;

import java.util.HashMap;

public class H_map {
	
	// Map is representation of key-valu pair // key should be unique
	//value can be duplicate //any no. of null value is allowed 
	//only one null value for key is allowed
	public static void main(String[] args) {
		HashMap h = new HashMap();
		System.out.println(h.size());
		System.out.println(h.isEmpty());
		
		h.put(null, "null"); // for key only one null allowed
		h.put(501, "null");  // for value any no. of null is allowed 
		h.put(502, "null");  // only one duplicate value is read 
		h.put(503, "Bhsfr");
		h.put(504, "abcd");
		
		System.out.println(h);
		System.out.println(h.size());
		System.out.println(h.isEmpty());
		
		System.out.println("--Map View--");
		
		System.out.println(h.keySet());
		System.out.println(h.values());
		System.out.println(h.entrySet());
		
		 System.out.println("--Other methods--");
		 
		 System.out.println(h.containsKey(506));
		 System.out.println(h.containsValue("abcd"));
		 System.out.println(h.get(503));
		
	}
	
	
	

}
