package hashing;

import java.util.*;

public class Union {

	static int union(int [] arr1,int []arr2) {
	Set <Integer> hm = new HashSet<Integer>();
	for(int i=0;i<arr1.length;i++)
		hm.add(arr1[i]);
	
	for(int i=0;i<arr2.length;i++)
		hm.add(arr2[i]);
	
		
		
		return hm.size();
	}
	
	public static void main(String[] args) {
		int arr1[] = {2,8,3,5,6};
		int arr2[] = {4,8,3,6,1};
System.out.println(		union(arr1,arr2));

	}

}
