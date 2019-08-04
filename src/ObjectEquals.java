
public class ObjectEquals {
	
	public static void main(String[] args){
		
		StudentObject ob = new StudentObject(1,"amarjit");
		StudentObject ob1 = new StudentObject(1,"amarjit");
		
		System.out.println(ob.equals(ob1));
		
		try{
			
			Object obj = null;
			
			int a = 10/0;
			obj.toString();
			
		
			
			
		}
		catch(NullPointerException |ArithmeticException ae){
			
			System.out.println("inside catch");
			ae.printStackTrace();
			
		}
		
	}
	


}
