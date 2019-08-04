package comparable;

public class Student implements Comparable<Student>{

	private String name;
	private String subject;
	private int marks;
	
	
	
	
	
	
	public Student(String name, String subject, int marks) {
		super();
		this.name = name;
		this.subject = subject;
		this.marks = marks;
	}






	@Override
	public String toString() {
		return "Student [name=" + name + ", subject=" + subject + ", marks=" + marks + "]";
	}






	@Override
	public int compareTo(Student o) {
		if(this.marks < o.marks)
		return -1;
		if(this.marks > o.marks)
			return 1;
		else
			return 0;
	}
	
}
