package hashing;

import java.util.*;

public class Pair_with {
	static boolean pair(int[] arr ,int x) {
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				if(arr[i]+arr[j]==x) {
					return true;
				}
			}
			
		}
		return false;
	}

	public static void main(String[] args) {
	
int arr[] = {8,4,3,9};
int x = 11;
 System.out.println(pair(arr,x));

	}

}
