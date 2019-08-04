package singleton;

public class Singleton2 {
	
	private static Singleton2 singleton = new Singleton2();
	
	private Singleton2(){
		if(singleton != null){
			throw new RuntimeException("Cannot create instance, please use getInstance()");
		}
	}
	
	public static Singleton2 getInstance(){
		
		if(singleton  == null){
			singleton = new Singleton2();
			return singleton;
		}
		else
			return singleton;
	}
	

}
