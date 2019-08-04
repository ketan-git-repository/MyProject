package abstractFactoryPattern;

import abstractFactoryPattern.Computer;
import abstractFactoryPattern.ServerComputer;

public class ServerFactory implements AbstractFactoryComputer {

	private String getHarDisk;
	private String getCPU;
	private String getRAM;
	
	
	
	public ServerFactory(String getHarDisk, String getCPU, String getRAM) {
		super();
		this.getHarDisk = getHarDisk;
		this.getCPU = getCPU;
		this.getRAM = getRAM;
	}



	public Computer createComputer() {
		return new ServerComputer(getHarDisk,getCPU,getRAM);
	}

}
