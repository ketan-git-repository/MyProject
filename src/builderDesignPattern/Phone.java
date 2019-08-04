package builderDesignPattern;

public class Phone {
	
	private String phone;
	private int RAM;
	private String processor;
	private int battery;
	
	public Phone(String phone, int RAM, String processor, int battery) {
		super();
		this.phone = phone;
		this.RAM = RAM;
		this.processor = processor;
		this.battery = battery;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getRAM() {
		return RAM;
	}

	public void setRAM(int rAM) {
		RAM = rAM;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	public String toString() {
		return "Phone [phone=" + phone + ", RAM=" + RAM + ", processor=" + processor + ", battery=" + battery + "]";
	}
	
	

}
