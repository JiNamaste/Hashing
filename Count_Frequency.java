package hashing;


import java.util.*;


public class Count_Frequency {
	
	public static void maxFrequency(int[] arr) {
	Map <Integer,Integer> hm = new HashMap<>();
	for(int i=0;i<arr.length;i++) {
		if(hm.containsKey(arr[i])) {
			hm.put(arr[i], hm.get(arr[i])+1);
		}else {
			hm.put(arr[i], 1);
		}
	}
	System.out.println(hm);	 
	}

	public static void main(String[] args) {
		
int [] arr= {32,14,14,76,14,32,29,32};

maxFrequency(arr);

	}

}
