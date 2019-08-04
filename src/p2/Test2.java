package p2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import p1.Test1;;

public class Test2 extends Test1 {
	
	String _default = "This is default String";
	protected String _protected = "This is protected String";
	
	
	public void m2(){
		System.out.println("This is simple m2 method");
		Test1 object = new Test1();
		//object._default;
		//object._public;
		//object._protected;
		
	}
	
	public static void main(String args[]) {
		 Test2 obj = new Test2();
		 System.out.println(obj._default);
		 System.out.println(obj._protected);
		 
		 List<Integer> list = new ArrayList<>();
		 list.add(10);
		 list.add(15);
		 list.add(4);
		 list.add(12);
		 list.add(6);
		 list.add(11);
		 list.add(14);
		 
		 int sum = 0;
		 Iterator<Integer> itr = list.iterator();
		 while(itr.hasNext()) {
			 int num = itr.next();
			 if(num >= 10) {
				 sum += num;
			 }
		 }
		 System.out.println("sum of integers are : "+sum);
		 }
	
	
		
	 

}
 class Child extends Test2{
	
	 

	
	
}