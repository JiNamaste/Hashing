package hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {

	public static void uniqueChar(String str) {
		
		String ans="";
		HashMap<Character,Boolean> hm= new HashMap<Character,Boolean>();
		for(int curr=0;curr<str.length();curr++) {
			char currChar = str.charAt(curr);
			if(!hm.containsKey(currChar)) {
				hm.put(currChar, true);
				ans+=currChar;
			}
			
		}
		System.out.println(ans);
	}
	public static ArrayList<Integer> removeDuplicates(int[] arr){
		ArrayList<Integer> output = new ArrayList<>();
		HashMap<Integer,Boolean> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(!map.containsKey(arr[i])) {
				output.add(arr[i]);
				map.put(arr[i],true);
			}
			
		}
		return output;
	}
	
	public static void main(String[] args) {
		 int arr[] = {1,3,2,2,3,1,6,2,5};
		 ArrayList<Integer> output = removeDuplicates(arr);
		 System.out.println(output);
		 
		 String str1 ="this is input" ;
		 uniqueChar(str1);

	}

}
