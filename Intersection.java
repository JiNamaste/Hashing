package hashing;

import java.util.*;

public class Intersection {

static int intersection(int [] arr1,int [] arr2) {
	
	Set<Integer> hm = new HashSet<Integer>();
	for(int i=0;i<arr1.length;i++) {
		hm.add(arr1[i]);
	}
	
	int res =0;
	for(int i=0;i<arr2.length;i++) {
		if(hm.contains(arr2[i])) {
			res++;
			hm.remove(arr2[i]);
		}
	}
	return res;
	
	
}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {15,17,27,27,28,15};
		int arr2[] = {16,17,28,17,31,17};
//		intersection( arr1, arr2);

System.out.println(intersection( arr1, arr2));
	}

}
