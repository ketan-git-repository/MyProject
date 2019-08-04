package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionClient {

	
	public static void main(String args[]) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		
		Class claas = Class.forName("singleton.Singleton2");
		Constructor<Singleton2> constructors =  claas.getDeclaredConstructor();
		constructors.setAccessible(true);
		Singleton2 obj3  = constructors.newInstance();
		
		System.out.println("\n "+obj3.hashCode());
		Singleton2 obj1 = Singleton2.getInstance();
		Singleton2 obj2 = Singleton2.getInstance();
		
		System.out.println(obj1.hashCode() + "  "+obj2.hashCode() );
		
		
		
		
		
	}
}
