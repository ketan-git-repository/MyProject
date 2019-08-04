import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Testing {
	
	public static void main(String args[]){
		
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date date = new Date();
		System.out.println(2+3+dateFormat.format(date)+"hello");
		
		int a =10;
		
		double b = a;
		
		System.out.println(b);
		
	
		
	}

}
