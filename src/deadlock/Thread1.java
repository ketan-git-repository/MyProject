package deadlock;

import java.util.Date;

public class Thread1 extends Thread{

	
	public void run() { 
		synchronized (String.class) {
			System.out.println("Aquired lock on String.class object "+new Date());
			synchronized (Integer.class) {
				System.out.println("Aquired lock on Integer.class object");
				
				}

		}
		System.out.println("Test JVM1");
	}
	
	
	
	

}