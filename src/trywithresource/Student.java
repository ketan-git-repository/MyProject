package trywithresource;

public class Student implements AutoCloseable {

	int id;
	String name;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void close() throws Exception {
		
		System.out.println("Closing Student object");
		throw new Exception("Exception during closing Student object");
		
	}
	
}
