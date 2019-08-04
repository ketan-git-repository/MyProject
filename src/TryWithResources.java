import java.io.File;
import java.io.PrintWriter;

public class TryWithResources {
	
	@SuppressWarnings("null")
	public static void main(String args[]) {
		
		
		File file =new File("C://Users//kebhardwaj//Desktop//A.txt");
		try (PrintWriter pw = new PrintWriter(file))
				{
//			File file =new File("C://Users//kebhardwaj//Desktop//A.txt");
//			pw = new PrintWriter(file);
			System.out.println("after file");
			int a = 10;
			int b = 2;
			a=a/b;
			pw.write("Division value is "+a);
			System.out.println("after writing");

			
			
			System.out.println("Division value is ========: "+a);
		}
		catch(Exception e){
			
			System.out.println("Exception raised");
			e.printStackTrace();
			
		}
		
		finally {
			System.out.println("Finally called");
		}
		
		
		
	}
	
	

}
