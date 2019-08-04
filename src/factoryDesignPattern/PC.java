package factoryDesignPattern;

public class PC extends Computer {

	String HardDisk;
	String RAM;
	String CPU;
	
	
	
	public PC(String hardDisk, String RAM, String CPU) {
		super();
		this.HardDisk = hardDisk;
		this.RAM = RAM;
		this.CPU = CPU;
	}

	@Override
	public String getHardDisk() {
		return this.HardDisk;
	}

	@Override
	public String getRam() {
		return this.RAM;
	}

	@Override
	public String getCPU() {
		return this.CPU;
	}

}
