package factory;

public class MobileFactory {
	
	public static Mobile createMobile(String type) {
		if(type.equals(Mobile.Iphone)) {
			return new Iphone(2,"A9","A9GPU");
		}
		else if(type.equals(Mobile.Sony)) {
			return new Sony(2,"ARM");
		}
		else if(type.equals(Mobile.Samsung)) {
			return new Samsung("Intel");
		}else
			return null;
		
	}

}
