
public class OverloadingTest {
	
	
	public void test(int sbd){
		System.out.println("int");
	}
	
	
	public void test(short sb){
		System.out.println("short");
	}
	
	public void test(double ch){
		System.out.println("double");
	}
	
	
	
	public void test (long name){
		System.out.println("long");
	}
	
	public static void main(String args[]){
		OverloadingTest ob = new OverloadingTest();
		ob.test(1.2f);
	}
	

}
