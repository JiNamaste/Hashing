package hashing;

import java.util.*;

public class Distinct_element {
 
	static int distinct(int arr[]) {
		Set<Integer> h= new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			h.add(arr[i]);
		}
		
		
		return h.size();
	}
	public static void main(String[] args) {
		int [] arr= {15,16,27,27,27,15};
		System.out.println(distinct(arr));
		

	}

}
