package singleton;

import java.util.concurrent.Executors;

public class ExecutorService {
	
	public void useSingleton(){
		Singleton1 singleton = Singleton1.getInstance();
	}
	
	public static void main(String args[]){
		
		java.util.concurrent.ExecutorService service = Executors.newFixedThreadPool(2);
		
		service.execute(new Runnable() {
		    public void run() {
		    	Singleton1 singleton = Singleton1.getInstance();
		    	System.out.println(singleton.hashCode());
		    }
		});
		
	}

}
