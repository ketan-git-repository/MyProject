package Exception;

public class CheckedExceptionExample {

	public static void main(String args[]){
		
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		try{
			int a = 10/0;
		}
		catch(ArithmeticException ae){
			ae.printStackTrace();
		}
		finally
		{
			System.out.println("This is finally block");
		}
		
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		
	}
	
	


}
