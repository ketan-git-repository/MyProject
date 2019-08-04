package factoryDesignPattern;

public class SuperComputer extends Computer{

	String hardDisk;
	String RAM;
	String CPU;
	
	public SuperComputer(String hardDisk, String RAM, String CPU) {
		super();
		this.hardDisk = hardDisk;
		this.RAM = RAM;
		this.CPU = CPU;
	}

	
	
	@Override
	public String getHardDisk() {
		return this.hardDisk;
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
