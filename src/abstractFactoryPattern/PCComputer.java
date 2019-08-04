package abstractFactoryPattern;

public class PCComputer extends Computer{

	private String hardDisk;
	private String CPU;
	private String RAM;
	
	public PCComputer(String hardDisk, String CPU, String RAM) {
		super();
		this.hardDisk = hardDisk;
		this.CPU = CPU;
		this.RAM = RAM;
	}

	public String getHardDisk() {
		return this.hardDisk;
	}

	public String getRAM() {
		return this.RAM;
	}

	public String getCPU() {
		return this.CPU;
	}

}
