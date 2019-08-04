package abstractFactoryPattern;

import abstractFactoryPattern.Computer;
import abstractFactoryPattern.AbstractFactoryComputer;

public class ComputerFactory {
	
	public static Computer getComputer(AbstractFactoryComputer instance){
		return instance.createComputer();
	}

}
