package builderDesignPattern;

public class PhoneBuilder {
	
	private String phone;
	private int RAM;
	private String processor;
	private int battery;
	
	public PhoneBuilder setPhone(String phone) {
		this.phone = phone;
		return this;
	}
	public PhoneBuilder setRAM(int rAM) {
		RAM = rAM;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	
	public Phone getPhone(){
		return new Phone(phone, RAM, processor, battery);
	}
	

}
