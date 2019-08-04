package abstractFactoryPattern;
import abstractFactoryPattern.Computer;
import abstractFactoryPattern.PCComputer;

public class PCFactory implements AbstractFactoryComputer {
	
	private String getHardDisk;
	private String getCPU;
	private String getRAM;
	

	public PCFactory(String getHardDisk, String getCPU, String getRAM) {
		super();
		this.getHardDisk = getHardDisk;
		this.getCPU = getCPU;
		this.getRAM = getRAM;
	}


	public Computer createComputer() {
		return new PCComputer(getHardDisk, getCPU, getRAM);
	}

}
