package com.cg.abstraction4;

abstract class Animal
{
	public abstract void sound();
}
 class Lion1 extends Animal
	{
		@Override
		public void sound() {
			// TODO Auto-generated method stub
			System.out.println("Roar");
		}
}

public class Main {

	public static void main(String[] args) {
		Animal obj=new Lion1();
		obj.sound();
	}
	}