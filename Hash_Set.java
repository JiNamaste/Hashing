package hashing;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> h = new HashSet<Integer>();
		h.add(6);                                         //.add()
		h.add(12);
		h.add(18);
		h.add(24);
		h.add(6);
		System.out.println(h);                            // print HashSet
		System.out.println(h.size());                    // .size()
		h.remove(24);                                    // .remove(key)
		
		System.out.println(h.size());
		
		System.out.println(h.contains(12));               // .contains(key) ---- check it is available or not in boolean form 
		
		Iterator<Integer> i = h.iterator();              //  iterator()
		   while(i.hasNext()) {                          // traverse the Hashset
			   System.out.print(i.next()+" ");
		   }
		   System.out.println();                           // traverse the Hashset
		   for(Integer s: h) {
			   System.out.print(s+" ");
		   }
		   
		   System.out.println(h.isEmpty());            // .isEmpty() -----check hashset is empty or not 
		   h.clear();              // .clear() -----------delete all the element
		   System.out.println(h);
		
		

	}

}
