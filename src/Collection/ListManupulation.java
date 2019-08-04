package Collection;

import java.util.LinkedList;
import java.util.List;

public class ListManupulation {


	public static void main(String args[]){
		List<Integer> list1 = new LinkedList<>();
		List<Integer> list2 = new LinkedList<>();
		List<Integer> list3 = new LinkedList<>();

		Integer i1 = 1;
		Integer i2 = 1;
		Integer i3 = 1;

		list1.add(2);
		list1.add(-3);
		list1.add(-4);
		list1.add(-5);

		list2.add(2);
		list2.add(-7);
		list2.add(-2);
		list2.add(-5);

		list3.add(2);
		list3.add(-5);
		list3.add(-9);
		list3.add(-5);

		for(Object ob:list1){
			i1 = i1 * (Integer)ob;
			if(i1 < 0)
			i1 = -(i1);
		}
		for(Object ob:list2){
			i2 = i2 * (Integer)ob;
			if(i2 < 0)
			i2 = -(i2);
		}
		for(Object ob:list3){
			i3 = i3 * (Integer)ob;
			if(i3 < 0)
			i3 = -(i3);
		}
		
		System.out.println(i1 + " " +i2 + " "+i3);

	}
}
