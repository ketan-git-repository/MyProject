package customException;

public class TestCustomException {

	public static void main(String args[]){
		try
        { 
            if("abc" == "abc")
            throw new MyException("inside try"); 
            else
            	System.out.println("execution as follows");
        } 
		
		catch (MyException ex) 
        { 
            System.out.println("inside catch"); 
  
            // Print the message from MyException object 
            System.out.println(ex.getMessage()); 
        } 
				
	}
}
