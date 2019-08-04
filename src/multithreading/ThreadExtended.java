package multithreading;

public class ThreadExtended extends Thread implements Cloneable {
	
	public void run() {
		System.out.println("New thread invoked");
		Object ob = null;
		
		
	}
	
	public synchronized void play() {
		
	}
	
	public static void main(String args[]) {
		ThreadExtended thread1 = new ThreadExtended();
//		System.out.println("Is Alive "+thread1.isAlive());
		ThreadExtended thread2 = new ThreadExtended();
		
		/*System.out.println("Thread Name "+thread1.getName());
		System.out.println("Thread Priority "+thread1.getPriority());
		System.out.println("Thread hashcode "+thread1.hashCode());
		System.out.println("Is Alive "+thread1.isAlive());
		System.out.println("Is Daemon "+thread1.isDaemon());
		System.out.println("Is Interrupted "+thread1.isInterrupted());
		System.out.println("get Class "+thread1.getClass());
		System.out.println("state "+thread1.getState());*/
		
		try {
			thread1.sleep(10000);
		} catch (InterruptedException e2) {
			e2.printStackTrace();
		}
		
		try {
			thread2.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		try {
			thread1.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		thread1.start();
		thread2.start();
		//System.out.println(thread2.getName());
	}

}
