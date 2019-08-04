import java.io.IOException;

public class calling extends Thread{
	
	
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
	
	
	
	
	
	public static void main(String args[]) throws IOException{
		
		calling call1 = new calling();
		calling call2 = new calling();
		call1.start();
		call2.start();
		System.out.println("Ending of main thread");
		System.out.println(Runtime.getRuntime().totalMemory());
		Process process = Runtime.getRuntime().exec("google-chrome");
		
		
		/*try{
			System.out.println("try");
			throw new IllegalArgumentException();
		}
			
		catch(Exception e){
			System.out.println("catch");
			throw new NullPointerException();	
		}
		
		finally{
			System.out.println("Finally");
		}*/		
	}
	
	
}