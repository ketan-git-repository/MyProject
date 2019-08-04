package Exception;

public class FinallyCall {

	public static void main(String args[]){

		try{
			try {
				int a =10/0;
				throw new MyException();
			}
			catch(ArithmeticException e){
				System.out.println("inside arithmetic exception catch block");
				e.printStackTrace();
			}
			finally{System.out.println();
				
				System.out.println("This is first finally block");
			}
		}

		catch(Exception e){
			System.out.println("inside exception ");
		}

		finally{
			System.out.println("This is final finally block");
		}
	}
}

