package Collection;

import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {
	
	public static void main(String args[]){
		
		List<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		System.out.println(list);
		int size = list.size();
		List<Integer> list1 = new LinkedList<>();
		for(int i = size-1;i>=0; i--){
			//System.out.println(list.get(i));
			list1.add(list.get(i));
		}
		System.out.println(list1);
		
	}

}
