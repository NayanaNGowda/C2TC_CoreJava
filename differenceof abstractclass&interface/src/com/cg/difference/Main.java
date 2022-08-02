//A simple example where we are using interface and abstract class both.


//Creating interface that has 4 methods
package com.cg.difference;

interface A{
	void a();//by-default, public and abstract
	void b();
	void c();
	void d();
}

//Creating abstract class that provides the implementation of one method of A interface
abstract class B implements A{
	public void c() {
		System.out.println("I am C");
	}
}

//Creating subclass of abstract class,now we need to provide the implementation of rest of the methods
	class m extends B{

		@Override
		public void a() {
			// TODO Auto-generated method stub
			System.out.println("I am a");
		}
        
		@Override
		public void b() {
			// TODO Auto-generated method stub
		System.out.println("I am b");	
		}

		@Override
		public void d() {
			// TODO Auto-generated method stub
			System.out.println("I am d");
		}
		
	}	
	
//Creating a test class that calls the method of A interface	
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
A a=new m();
a.a();
a.b();
a.c();
a.d();
	}
}


