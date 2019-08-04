package ExternalizablePractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CallingClass {
	
	public static void main(String args[]) throws IOException, ClassNotFoundException{
		
		ExternalizableClass ext = new ExternalizableClass("Ketan",28,2019);
		ExternalizableClass cons = new ExternalizableClass();
		
		FileOutputStream out = new FileOutputStream("C://Users//kebhardwaj//Pictures//test.txt");
		ObjectOutputStream obOut = new ObjectOutputStream(out);
		obOut.writeObject(ext);
		obOut.flush();
		
		FileInputStream in = new FileInputStream("C://Users//kebhardwaj//Pictures//test.txt");
		ObjectInputStream inp = new ObjectInputStream(in);
		cons = (ExternalizableClass) inp.readObject();
		
		
		System.out.println(ext.hashCode());
		System.out.println(cons.hashCode());
		
	}

}
