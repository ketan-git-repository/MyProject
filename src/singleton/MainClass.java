package singleton;

public class MainClass {

	public static void main(String args[]){
		Object ob = MySingleton.getInstance();
		System.out.println(ob);
		Object ob1 = MySingleton.getInstance();
		System.out.println(ob1);
	}
}
