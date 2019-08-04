package factoryDesignPattern;

public class ClientProgram {

	public static void main(String args[]){
		Computer PC = ComputerFactory.createComputer(ComputerType.PC,"500GB", "4GB", "3i");
		
		System.out.println(PC);
		
		Computer SERVER = ComputerFactory.createComputer(ComputerType.SERVER,"500TB", "64GB", "7i");
		
		System.out.println(SERVER);
		
		Computer SUPERCOMPUTER = ComputerFactory.createComputer(ComputerType.SUPERCOMPUTER, "10000TB", "1000GB", "11i");
		
		System.out.println(SUPERCOMPUTER);
	}
}
