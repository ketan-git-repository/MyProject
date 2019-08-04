package builderDesignPattern;

public class TestBuilder {

	public static void main(String args[]){
		
		Phone ph  = new PhoneBuilder().setPhone("Moto").setRAM(4).setProcessor("qualcomm").getPhone();
		System.out.println(ph.toString());
		
		Phone ph1 = new PhoneBuilder().setPhone("Samsung").setBattery(3000).setRAM(2).getPhone();
		
		System.out.println(ph1.toString());
	}
	
}
