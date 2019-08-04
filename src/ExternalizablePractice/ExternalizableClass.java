package ExternalizablePractice;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExternalizableClass implements Externalizable{
	
	String name;
	int age;
	int year;

	public ExternalizableClass(String name, int age, int year) {
		this.name = name;
		this.age = age;
		this.year = year;
	}

	public ExternalizableClass() {
	}

	@Override
	public String toString() {
		return "ExternalizableClass [name=" + name + ", age=" + age + ", year=" + year + "]";
	}

	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeInt(age);
		out.writeInt(year);
		
	}

	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String) in.readObject();
		age = in.readInt();
		year = in.readInt();
		
	}
	
}
