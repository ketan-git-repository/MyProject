package factoryDesignPattern;

public class Server extends Computer {

	String HardDisk;
	String RAM;
	String CPU;
	
	

	public Server(String HardDisk, String RAM, String CPU) {
		super();
		this.HardDisk = HardDisk;
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
