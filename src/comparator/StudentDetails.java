package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StudentDetails {

	
	public static void main(String args[]){
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student("ketan", 29));
		list.add(new Student("kumod", 30));
		list.add(new Student("sandeep", 27));
		list.add(new Student("manish", 35));
		list.add(new Student("vinay", 39));
		list.add(new Student("subodh", 20));
		
		
		
		int arr[] = {2,2,9,9,3,4,5,6,2,9};
		
		for(int i= 0;i<arr.length;i++)
			for(int j= i+1;j<arr.length;j++)
				if(arr[i]==arr[j]){
					System.out.println(arr[i]);
				}
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Object obj = new Object();
		obj.getClass();
		
		Set set = new HashSet();
		//set.add(null);
		set.add(1);
		set.add("ketan");
		//System.out.println(set);
		
		Collections.sort(list, new AgeComparator());
		//System.out.println(list.toString());
		
		Iterator itr2 =list.iterator();  
		while(itr2.hasNext()){  
		Student st=(Student)itr2.next();  
		//System.out.println(st.age+" "+st.name+" ");  
		}  
		
		
	}
	
}
