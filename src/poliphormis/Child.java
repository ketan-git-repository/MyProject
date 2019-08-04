package poliphormis;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Child extends Parent{
	
	
	
	//public int ab = 20;
	/*
	{
		System.out.println(a);
	}
	{
		System.out.println("This is child initialization block");
	}
	
	static {
		System.out.println("This is child static block");
	}
	
	Child(){
		System.out.println("This is child constructor.");
	}*/
	
	public  void m1(int a){
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("This is child " + a);
		
	}
	
	public void newDisplay(){
		System.out.println("new display of child class");
	}
	 
	 public static void main(String args[])  {
			//Parent p = new Parent();
			Child ch = new Child();
			//p.m1();
			//ch.m1();
			
			Parent p1 = new Child();
			
			//Child ch1 = (Child)ch;
			//p1.m1();
			//p1.display();
			//ch1.newDisplay();
			System.out.println(p1.ab);
			p1.m1(1000);
			
			
			
		}

	
}
