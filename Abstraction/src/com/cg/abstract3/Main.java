package com.cg.abstract3;

abstract class Animal
{
	abstract void eat();
}
 class Herbivores extends Animal
{

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("Ïam a vegetarian");
	}
}
	class Carnivores extends Animal
	{

		@Override
		void eat() {
			// TODO Auto-generated method stub
			System.out.println("I am a non-vegetarian");
		}
	}
		class Omnivores extends Animal
		{

			@Override
			void eat() {
				// TODO Auto-generated method stub
				System.out.println("I will eat both veg and non-veg");
			}
		
		}

public class Main {

	public static void main(String[] args)
	{
		Animal goat = new Herbivores();
		Animal tiger=new Carnivores();
		Animal bear=new Omnivores();
		goat.eat();
	    tiger.eat();
		bear.eat();
		}
	}