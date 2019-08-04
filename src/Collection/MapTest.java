package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class MapTest {
	
	public static void main(String args[]) {
		
		StringBuffer sb = new StringBuffer();
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("ketan", 3);
		map.put("sandeep",3);
		map.put("kumod", 3);
		map.put("ketan", 4);
		 
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		String str = "ketan";
		String str1 = new String("kumod");
		ArrayList<String> al  = new ArrayList<String>();
		al.add(str);
		al.add(str1);
		System.out.println(al); // output : [ketan]
		str1 = new String("Sandeep");
		//System.out.println(str); // output : null
		System.out.println(al); // output : [ketan]
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
