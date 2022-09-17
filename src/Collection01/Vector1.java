package Collection01;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;



public class Vector1 {
	public static void main(Strings12[] args) {
		Vector vr = new Vector();
		System.out.println(vr.capacity()); // default capacity is 10
		System.out.println(vr.isEmpty());
		vr.add("xyz");
		vr.add(100);
		vr.add('R');
		vr.add("xyz");
		vr.add(null);
		System.out.println(vr);
		System.out.println(vr.capacity());
		System.out.println(vr.size());
		System.out.println(vr.isEmpty());
		
   System.out.println("--------check different methods-------");
		
		System.out.println(vr.indexOf(100));
		System.out.println(vr.indexOf("xyz"));
		System.out.println(vr.lastIndexOf("xyz"));
		System.out.println(vr.get(1));
		System.out.println(vr.contains('R'));
		
		
		System.out.println("------check add remove element------");
        vr.add(2, 40);
        System.out.println(vr);
        vr.add(3, "bhavar");
        System.out.println(vr);
        vr.set(3, "velocity");
        System.out.println(vr);
        vr.remove(3);
        System.out.println(vr);
        
        System.out.println("----Read using iterator------");
        Iterator itr = vr.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
        for(int i=0;i<=vr.size()-1;i++) {
        	System.out.println(vr.get(i));
        }
        Enumeration e= vr.elements();
        while(e.hasMoreElements()) {
        	System.out.println(e.nextElement());
        	
        }
        
        
       
        
		
		
		
	
	}

}
