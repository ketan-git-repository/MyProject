import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class Stud implements Comparable<Stud>{
	int roll,marks;
	String name;
	
	List list = new ArrayList();
	Set<String> set = new HashSet<>();
	LinkedList<String> ll = new LinkedList<>();
	
	public Stud(){
		
	}
	
	public void add(){
		ll.addFirst("ketan");
		ll.addLast("kumar");
		
	}
	
	
	public Stud(int roll, int marks, String name) {
		super();
		this.roll = roll;
		this.marks = marks;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Stud [roll=" + roll + ", marks=" + marks + ", name=" + name + "]";
	}


	public int compareTo(Stud s) {
		char ch[] = name.toCharArray();
		char ch1[] = s.name.toCharArray();
		if(ch[0] > ch1[0])
			return 1;
			else 
			return -1;
	}

	
}


public class ComparableExample  {

	public static void main(String args[]){
		Stud ob = new Stud();
		ob.add();
		List<Stud> st = new ArrayList<>();
		st.add(new Stud(101,90,"ketan"));
		st.add(new Stud(101,85,"kumod"));
		st.add(new Stud(101,95,"mist"));
		st.add(new Stud(101,82,"sandy"));
		st.add(new Stud(101,86,"manish"));
		
		Collections.sort(st);
		
		for(Stud s : st){
			System.out.println(s);
		}
		
		
	}


}
