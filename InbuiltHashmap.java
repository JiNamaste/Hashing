package hashing;
import java.util.HashMap;
import java.util.Set;
public class InbuiltHashmap {

	public static void main(String[] args) {
		
		HashMap <String,Integer> map = new HashMap<>();
		
		// put the value in map
		map.put("abc", 6);
		map.put("jkl", 3);
		map.put("kmb", 9);
		map.put("abc", 1);
		
		//Size of map
		System.out.println(map.size());
		
		
		// check presence
		if(map.containsKey("jkl"))
			System.out.println("true");
		
		
		// get the value of key 
		int v = map.get("abc");
		System.out.println(v);
		
		if(map.containsKey("klm"))
			System.out.println(map.get("jkl"));
		
		//iterate 
	Set<String> keys = map.keySet();
	for(String s:keys) {
		System.out.println(s);
	}
		
	System.out.println(map.containsValue(9   ));	

	}

}
