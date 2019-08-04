package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;



public class setCheck {
	static int count = 0;
	public static void main(String args[]){
		
		
		Map<String,String> map = new HashMap();
		map.put("ketan", "bhardwaj");
		map.put(null,null);
		map.put("kumod", "sharma");
		
		System.out.println(map);
		System.out.println(map.get("kumod"));
		System.out.println(map.get(null));
		System.out.println(map.get("hello"));
		
		
		
		/*ArrayList ar = new ArrayList();
		ar.add("ketan");
		ar.add("bhardwaj");
		ar.add(null);
		ar.add(null);
		
		System.out.println(ar);
		System.out.println(ar.get(5));*/
		/*Set set = new HashSet();
		set.add("a");
		set.add("a");
		set.add(null);
		set.add(null);*/
				
		//System.out.println(set);
		//System.out.println(set.);
		/*String str[] =new String[]{"ketan","bhardwaj"};
		//System.out.println(setCheck.main(str[1]););
		System.out.println(count++);
		if(count == 10070){
			System.out.println("Terminating program");
			System.exit(0);
		}
		main(str);*/
		
	}
	
}
