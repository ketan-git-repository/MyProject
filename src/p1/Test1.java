package p1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 extends Thread{
	
	public String _public = "This is public instance of Test1 class";
	public String _protected = "This is protected instance of Test1 Class";
	public String _default = "This is default instance of Test1 Class";
	
	public static void main(String args[]){
		Map<String, Integer> map = new HashMap<>();
		
		List<String> lt = new ArrayList<>();
		
		int arr[] = new int[5];
		
		map.put("abc", 1);
		map.put("acb", 2);
		map.put("bca", 3);
		map.put("bac", 4);
		
		Object ob = new Object();
		Object ob1 = new Object();
		
		ob = "11";
		ob1 = "11";
		
		System.out.println("ob hashcode : "+ob.hashCode());
		System.out.println("ob1 hashcode : "+ob1.hashCode());
		
		System.out.println("equals : "+ ob.equals(ob1));
		System.out.println("asdf");
		System.out.println("just "+(ob == ob1));
		if(ob == ob1){
			System.out.println("hello");
		}
				
		
		String str = new String("ketan");
		String str1 = new String("ketan");
		
		StringBuffer sb1 = new StringBuffer("111");
		StringBuffer sb2 = new StringBuffer("111");
		
		System.out.println("hash code of sb1 "+sb1.hashCode());
		System.out.println("hash code of sb2 "+sb2.hashCode());
		
		StringBuilder sb = new StringBuilder();
		
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1 == sb2);
		
		//System.out.println(str.equals(str1));
		//System.out.println(str == str1.intern());
		
		 
		 //System.out.println(str);
		
		
		
		//System.out.println(map);
	}

}


