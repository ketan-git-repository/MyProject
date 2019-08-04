package deadlock;

public class MainThread {

	
	public static void main(String srgs[]) {
		Thread1 th1 = new Thread1();
		Thread2 th2 = new Thread2();
		
		th1.start();
		th2.start();
	}
}
