package com.cg.abstractclasshavingconstuctor2;
abstract class Bike{

	public Bike() {
		super();
		System.out.println("Bike is created");
	}
	abstract void run();
	void changeGear() {
		System.out.println("gear is changed");
	}
}
class Honda extends Bike{

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("running safelly");
	}
	
}

public class Main {

	public static void main(String[] args) {
		Honda h=new Honda();
		h.run();
		h.changeGear();
		

	}

}
