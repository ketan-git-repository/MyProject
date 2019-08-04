package factoryDesignPattern;

public class ComputerFactory {

	public static Computer createComputer(ComputerType type,String hardDisk, String RAM, String CPU){
		
		System.out.println("type getting "+type);
		Computer com = null;
		if(ComputerType.PC.equals(type))
		return new PC(hardDisk,RAM,CPU);
		else if(ComputerType.SERVER.equals(type))
			return new Server(hardDisk,RAM,CPU);
		else if(ComputerType.SUPERCOMPUTER.equals(type))
			return new SuperComputer(hardDisk, RAM, CPU);
		else return com;
		
	}


	
}
