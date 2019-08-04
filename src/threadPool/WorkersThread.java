package threadPool;

public class WorkersThread implements Runnable{
	
	private String message;
	public WorkersThread(String theMessage){
		this.message = theMessage;
	}
	
	
	public void run(){
		System.out.println(Thread.currentThread().getName()+ " Started");
		try {
			processMessage();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+ " Ended");
	}

	private void processMessage() throws InterruptedException {
		Thread.sleep(2000);
	}
}


