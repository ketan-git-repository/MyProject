package singleton;

public class MySingleton {
	
	private static MySingleton singleton = new MySingleton();
	
	private MySingleton(){
		
	}
	
	public  static synchronized MySingleton getInstance(){
		
			if(singleton == null)
				return new MySingleton();
			else
				return singleton;
		
		
	}

}
