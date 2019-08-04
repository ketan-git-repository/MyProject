package String;

public class StringManupulation {

	
	
	
	public static void main(String args[]) {
		
		Object obj = new Object();
		
		String test = null;
		String str = "ketan";
		System.out.println("before comparison");
		
		if(str.equals(test)){
			System.out.println("null pointer");
		}
		else
			System.out.println("success");
		
		String str1 = new String("ketan");
		String str2 = "ketan";
		String str3 = new String("ketan");
		
		str1 = str;
		
		System.out.println(str.equals(str2));
		System.out.println(str == str1);
		System.out.println(str1.equals(str3));
		System.out.println(str1 == str3);
	}
}
