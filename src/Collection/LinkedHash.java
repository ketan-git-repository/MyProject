package Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import oracle.net.aso.e;

public class LinkedHash {

	public static void main(String args[]) {
		
		TreeSet ts = new TreeSet();
		ts.add("bcd");
		ts.add("abc");
		ts.add("cdb");
		ts.add("fgh");
		ts.add("def");
		//System.out.println(ts);
	
		
		LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add("Ketan");
		lhs.add("1");
		lhs.add(null);
		lhs.add(null);
		lhs.add("abc");
		lhs.add("bcd");
		
		//System.out.println(lhs);
		
		HashSet hs = new HashSet();
		hs.add("5");
		hs.add("1");
		hs.add("2");
		hs.add("3");
		hs.add("4");
		
		//System.out.println(hs);
		
		HashMap<Integer,String> hmap = new HashMap<Integer,String>();
		hmap.put(1,"Ketan");
		hmap.put(2, "kumod");
		System.out.println(hmap.get(1));
		System.out.println(hmap.get(2));
		System.out.println(hmap.get(3));
		
		
		
		
		
	}
}
