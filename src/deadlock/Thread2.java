package deadlock;

import java.util.Date;

public class Thread2 extends Thread{
	
	
	public void run() {
		synchronized (Integer.class) {
			System.out.println("Aquired lock on Integer.class object "+new Date()); 
			
			synchronized (String.class) {
				System.out.println("Aquired lock on String.class object"); 
				}
			}
		//System.out.println("Test JVM2");
		}


}
