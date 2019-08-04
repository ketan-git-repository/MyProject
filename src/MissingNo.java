
 class A {
	
public void m1(){
	System.out.println("m1 of A");
}

public void m2(){
	System.out.println("m2 of A");
}


}

 public class MissingNo extends A{
	
	 
	 public void m1(){
			System.out.println("m1 of missingno");
		}
	 
	 public void m2(){
		 System.out.println("m2 of missingno");
	 }
	
	 public static void main(String args[]){
		
 		A obj =  new MissingNo();
		obj.m1();
		
	}
}