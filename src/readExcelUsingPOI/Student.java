package readExcelUsingPOI;

public class Student {
	
	private String name;
	private String maths;
	private String science;
	private String english;
	
	public Student(){}
	
	public Student(String name, String maths, String science, String english) {
		super();
		this.name = name;
		this.maths = maths;
		this.science = science;
		this.english = english;
	} 
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMaths() {
		return maths;
	}


	public void setMaths(String maths) {
		this.maths = maths;
	}


	public String getScience() {
		return science;
	}


	public void setScience(String science) {
		this.science = science;
	}


	public String getEnglish() {
		return english;
	}


	public void setEnglish(String english) {
		this.english = english;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", maths=" + maths + ", science=" + science + ", english=" + english + "]";
	}



}
