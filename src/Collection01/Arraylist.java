package Collection01;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
	public static void main(Strings12[] args) {
		
		ArrayList ar = new ArrayList();
		System.out.println(ar.size());
		System.out.println(ar.isEmpty());
		ar.add("vaibhav");
		ar.add('A');
		ar.add(50);
		ar.add("laxman");
		ar.add(null);    // order of insertion is maintained also duplicate allowed
		System.out.println(ar);
		System.out.println(ar.size());
		System.out.println(ar.isEmpty());
		
		System.out.println("--------check different methods-------");
		
		System.out.println(ar.indexOf(50));
		System.out.println(ar.indexOf("laxman"));
		System.out.println(ar.lastIndexOf("laxman"));
		System.out.println(ar.get(1));
		System.out.println(ar.contains('A'));
		
		System.out.println("------check add remove element------");
        ar.add(2, 40);
        System.out.println(ar);
        ar.add(3, "bhavar");
        System.out.println(ar);
        System.out.println("----Read using iterator------");
        
        Iterator itr = ar.iterator();
       while(itr.hasNext()) {
        System.out.println(itr.next());
      }
       for(int i=0;i<=ar.size()-1; i++){
    	   System.out.println(ar.get(i));
       }
       
        
        
        
		
		
		
		
	}

}
