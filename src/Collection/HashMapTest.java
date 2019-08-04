package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	
	public static void main(String args[]){
		Map<Integer,Integer> map = new HashMap<>();
		map.put(null, 1);
		map.put(null, 2);
		
		System.out.println(map);
		
	}

}
