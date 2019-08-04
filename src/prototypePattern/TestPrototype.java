package prototypePattern;

import java.util.List;

public class TestPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {

		StudentImplementation obj = new StudentImplementation();
		obj.getInfo();
		
		System.out.println(obj.toString());
		
		StudentImplementation obj1 =   (StudentImplementation) obj.clone();
		
		List<String> stuList = obj1.getEmpList();
		
		System.out.println(stuList);
		
	}

}
