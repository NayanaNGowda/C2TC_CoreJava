package com.cg.Interfacedemo;

interface Bike {
	void getMileage();
}

class R15 implements Bike{

	@Override
	public void getMileage() {
		// TODO Auto-generated method stub
		System.out.println("mileage is 40kml");
	}
	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        R15 bike=new R15();
        bike.getMileage();
	}

}
