package poliphormis;

public class ApplicationClass {

	public static void main(String[] args) {
		//Parent obj = new Parent();
		//obj.m1();
		
		
		//Child ch = new Child();
		//ch.m1();
		
		Parent pt = new Child(); //upcasting
		pt.m1(100);
		
		 //Child child = (Child)new Parent();
		 //child.m1();
	}

}

