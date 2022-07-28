package com.cg.Interfacedemo2;

interface In1
{
	int a=10;
	static void display()
	{
		System.out.println("Static Method");
	}

	}

public class Main implements In1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
In1.display();
	}

}
