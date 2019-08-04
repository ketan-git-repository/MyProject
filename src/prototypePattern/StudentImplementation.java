package prototypePattern;

import java.util.ArrayList;
import java.util.List;

public class StudentImplementation extends Student implements Cloneable{

	List<String> studentList = new ArrayList<String>();
	
	
	
	public StudentImplementation(List<String> studentList){
		this.studentList = studentList;
	}


	public StudentImplementation() {
	}


	@Override
	public void getInfo() {
		
		studentList.add("ketan");
		studentList.add("kumod");
		studentList.add("sandeep");
		
	}
	
	public Object clone(){
		List<String> cloneOfStudent = new ArrayList<String>();
		cloneOfStudent = this.studentList;
		return cloneOfStudent;
		
	}
	
	public List<String> getEmpList() {
		return studentList;
	}

	@Override
	public String toString() {
		return "StudentImplementation [studentList=" + studentList + "]";
	}

	
	
	
}
