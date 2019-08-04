package trywithresource;

import trywithresource.Student;



public class CallingClass {
	
	public static void main(String args[]) throws Exception{
		
		
		String str = getDetails();
		/*
		Student stu = getDetails();
		if(stu != null){
		System.out.println(stu.getId());
		System.out.println(stu.getName());
		}
		else
			System.out.println("student object is null");
		
	}*/

	public String  getDetails() throws Exception {
		
		try(Student stud = new Student()){
			
			if(stud == null){
				stud.setId(101);
				stud.setName("ketan");
				
				return "hello";
			}
			else
				return "hello";
			
		}
		
	}

}
