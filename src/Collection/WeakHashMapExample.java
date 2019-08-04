package Collection;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.WeakHashMap;

public class WeakHashMapExample {
	
	public static void main(String args[]) {
		
		
		Map<Student,String> map = new WeakHashMap<>();
		map.put(new Student("kumod",2),   "MBA");
		map.put(new Student("Ketan",1),   "MCA");
		map.put(new Student("Sandeep",3), "MSC-IT");
		
		Set<Entry<Student, String>> entry = map.entrySet();
		
		
		Student st = new Student("Giri",4);
		map.put(st, "MBA");
		System.out.println("size before calling GC "+map.size()); //4
		
		System.gc();
		
		System.out.println("size after calling GC "+map.size()); // 1
		
		
	}
	
	

}

class Student{
	private String name;
	private int id;
	
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
