package com.cg.abstraction1;

abstract class Shape{
	abstract void draw();
	
}
class Rectangle extends Shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing rectangle");
	}
}

class Circle extends Shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing circle");
	}
}
public class Main{
	public static void main(String[] args) {
		Shape h=new Rectangle();
		h.draw();
		Shape c=new Circle();
		c.draw();
	}
}