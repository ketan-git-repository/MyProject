import java.util.Comparator;

public class ObjectValue  {
	
	int age;
	String designation;
	
	
	
	public ObjectValue(int age, String designation) {
		
	}
	public ObjectValue() {
		super();
	}
	
	@Override
	public String toString() {
		return "ObjectValue [age=" + age + ", designation=" + designation + "]";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
		
		
}
