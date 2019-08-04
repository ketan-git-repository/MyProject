import java.util.List;

public class PrototypeMain {

		public static void main(String[] args) throws CloneNotSupportedException {
			PrototypeDesignPattern emps = new PrototypeDesignPattern();
			emps.loadData();
			
			//Use the clone method to get the Employee object
			PrototypeDesignPattern empsNew = (PrototypeDesignPattern) emps.clone();
			PrototypeDesignPattern empsNew1 = (PrototypeDesignPattern) emps.clone();
			List<String> list = empsNew.getEmpList();
			list.add("John");
			List<String> list1 = empsNew1.getEmpList();
			list1.remove("Pankaj");
			
			System.out.println("emps List: "+emps.getEmpList());
			System.out.println("empsNew List: "+list);
			System.out.println("empsNew1 List: "+list1);
		}

	}
	
