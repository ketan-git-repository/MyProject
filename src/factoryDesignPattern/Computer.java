package factoryDesignPattern;

public abstract class Computer {

	public abstract String getHardDisk();
	public abstract String getRam();
	public abstract String getCPU();
	@Override
	public String toString() {
		return "Computer [getHardDisk()=" + getHardDisk() + ", getRam()=" + getRam() + ", getCPU()=" + getCPU() + "]";
	}
}
