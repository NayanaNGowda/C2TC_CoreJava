package com.cg.Interfacedemo1;

interface Bank{
	float rateOfInterest();
}
class SBI implements Bank{
	public float rateOfInterest() {
		return 9.15f;
	}
	
}
class HDFC implements Bank{
	public float rateOfInterest() {
		return 9.7f;
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                   Bank b=new SBI();
                   System.out.println("ROI: " +b.rateOfInterest());
	}

}
