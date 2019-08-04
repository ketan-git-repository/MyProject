class Child extends ModifiersCheck{
	
	public void m2(){
		
		System.out.println("This is m2 method");
	}
	
	public static void main(String args[]){
		
		
		Child ch = new Child();
		
		//Child ch1 = (Child) new ModifiersCheck();
		
		
		ModifiersCheck mc = new Child();
		
		ModifiersCheck mc1 = new ModifiersCheck();
		
		System.out.println(mc1.a);
		
		
	}
}
