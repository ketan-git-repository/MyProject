package designpatterns;

public class SingletonP {
	
	private static SingletonP instance = new SingletonP();
	
	private SingletonP() {
		
	}

	public SingletonP getInstance() {
		return instance;
	}
}
