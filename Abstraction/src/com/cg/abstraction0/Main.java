package com.cg.abstraction0;
 
abstract class Bike{
	abstract void run();
	abstract void getBikedetail();
}
class Honda extends Bike{

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("the bike is running safety");
	}

	@Override
	void getBikedetail() {
		// TODO Auto-generated method stub
		System.out.println("the model of the bike RX100");
	}
}
public class Main{
	public static void main(String[] args) {
	   Honda h=new Honda();
	   h.run();
	   h.getBikedetail();
	   
	}
	
	}

	


