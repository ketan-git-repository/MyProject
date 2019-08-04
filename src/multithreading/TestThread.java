package multithreading;

public class TestThread extends Thread{
	 
	 
	  public void run(){
	    System.out.println(Thread.currentThread().getName());
	  }
	  
	  public static void main(String args[]) throws InterruptedException{
	   
		
	    TestThread t1 = new TestThread();
	    TestThread t2 = new TestThread();
		  
	    
	    t1.start();
	    t2.start();
	    t1.join();
	    t2.join();
	    
	    //Thread.currentThread().join();
	    System.out.println("This is main thread");
	    
	  }
	 
	}