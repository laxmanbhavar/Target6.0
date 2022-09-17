package Hash_map;

import java.util.HashMap;
import java.util.Hashtable;

public class H_Table {
	public static void main(String[] args) {
       Hashtable t = new Hashtable();
		System.out.println(t.size());
		System.out.println(t.isEmpty());
		
	t.put(101, "null");   //  for key null value is not allowed
	t.put(102, "null");   //  for value any no of  null valu  is allowed
	t.put(103, "null");
	t.put(104, "Laxman");
	t.put(105, "Hrushikesh"); 
	t.put(106, "Sonaji");
	t.put(107, "Sagar");
	
	System.out.println(t.size()); // Duplicate value not read key should be unique
	System.out.println(t.isEmpty());
	
	System.out.println("--Map View Method--");
	System.out.println(t.keySet());
	System.out.println(t.values());
	System.out.println(t.entrySet());
	
	System.out.println("--other method--");
	System.out.println(t.containsKey(102)); // true
	System.out.println(t.containsValue("Laxman")); // true
	System.out.println(t.get(105));
	
	System.out.println(t.remove(105));
	System.out.println(t.replace(106, "Tanaji"));
	System.out.println(t);
		
		
	}
	
	
}
