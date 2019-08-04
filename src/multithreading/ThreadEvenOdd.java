package multithreading;

public class ThreadEvenOdd implements Runnable{
	
	 static Object lock = new Object();
	 static int num = 1;
	 int max = 20;
	 int remainder;
	 
	 ThreadEvenOdd(int remainder){
		 this.remainder = remainder;
	 }
	 
	 public void run(){
		 
		 while(num< max){
			 synchronized(lock){
				 while(num % 2 != remainder){
					 try{
						 lock.wait();
					 }
					 catch(InterruptedException e){
						 e.printStackTrace();
					 }
				 }
				 System.out.println("Thread name "+ Thread.currentThread().getName() +  "  "+ num);
				 lock.notifyAll();
				 num++;
			 }
			 
		 }
		 
		 
	 }
	 
}
