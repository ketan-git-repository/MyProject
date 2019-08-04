package abstractFactoryPattern;

import abstractFactoryPattern.Computer;


public class TestAbstractFactoryDesignPattern {
	
	public static void main(String args[]){
		Computer PCInstance = ComputerFactory.getComputer(new PCFactory("500 GB", "3i processor", "8 GB"));
		
		System.out.print(PCInstance.getCPU()+ "  ");
		System.out.print(PCInstance.getHardDisk() + " ");
		System.out.println(PCInstance.getRAM());
		
		Computer serverInstance = ComputerFactory.getComputer(new ServerFactory("500TB", "50 Core processor", "164 GB"));
		
		System.out.print(serverInstance.getCPU());
		System.out.print(serverInstance.getHardDisk());
		System.out.print(serverInstance.getRAM());
		
	}

}
