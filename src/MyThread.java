import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class MyThread implements Callable, Future, Comparable {
	
	StringBuffer sb =new StringBuffer();
	StringBuilder sb1 =  new StringBuilder();
	static String str= null;
	Map map = new TreeMap();
	
	String str1 = "ketan";
	static String str2 = "ketan";
	
	
	
	StringTokenizer st = new StringTokenizer(null);
	HashMap hm = null;
	public Long call() throws Exception {
		Object ob = new Object();
		
		"ketan".equals(str1);
		
		return 123l; 
		}

	

	public static void main(String args[]){
		ExecutorService es = Executors.newSingleThreadExecutor();
		/*if(str.equals(str1)){
			
		}*/
		
		
	}



	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public boolean cancel(boolean mayInterruptIfRunning) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean isCancelled() {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean isDone() {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public Object get() throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Object get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
		// TODO Auto-generated method stub
		return null;
	}
}

