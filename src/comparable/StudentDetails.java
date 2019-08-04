package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentDetails {
	
	public static void main(String args[]){
		
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student("ketan", "OS", 85));
		list.add(new Student("kumod", "OS", 75));
		list.add(new Student("manish", "OS", 76));
		list.add(new Student("sandy", "OS", 49));
		list.add(new Student("vinay", "OS", 79));
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
	} 

}
