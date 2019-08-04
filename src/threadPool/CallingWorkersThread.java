package threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallingWorkersThread {
	
	public static void main(String args[]){

		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		for(int i = 0; i < 10; i++){
			Runnable worker = new WorkersThread(" "+ i);
			executor.execute(worker);
		}
		executor.shutdown();
		
		System.out.println("Termination status "+executor.isTerminated());
		while(executor.isTerminated()){
			System.out.println("Finised all threads");
		}
		
	}

}
