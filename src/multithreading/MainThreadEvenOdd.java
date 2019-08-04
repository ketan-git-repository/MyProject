package multithreading;

public class MainThreadEvenOdd {
	
	public static void main(String args[]){
		
		ThreadEvenOdd obj1 = new ThreadEvenOdd(1);
		ThreadEvenOdd obj2 = new ThreadEvenOdd(0);
		
		Thread t1 = new Thread(obj1,"Thread 1");
		Thread t2 = new Thread(obj2,"Thread 2");
		
		t1.start();
		t2.start();
		
		
		
	}

}
