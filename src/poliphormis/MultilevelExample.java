package poliphormis;

class Fruit {
	
	public void m1(){
		System.out.println("This is parent class fuit");
	}

}
class Banana extends Fruit{
	
	public void m1(){
		System.out.println("This is child class Banana");
	}
}

class Grapes extends Banana{
	public void m1(){
		System.out.println("This is child class Grapes");
	}
}

public class MultilevelExample{
	public static void main(String args[]){
		Fruit f = new Grapes();
		f.m1();
	}
}
