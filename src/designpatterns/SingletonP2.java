package designpatterns;

public class SingletonP2 {

	private static SingletonP2 instance = null;
	
	private SingletonP2() {
		
	}
	
	public SingletonP2 getInstance() {
		
		if(instance == null) {
			synchronized(SingletonP2.class) {
				instance = new SingletonP2();
			}
		}
		return instance;
	}
	
}
