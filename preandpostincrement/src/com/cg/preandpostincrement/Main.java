package com.cg.preandpostincrement;

public class Main {

	public static void main(String arg[] ) {
		{
			int a=5;
			int b=2;
			int c;
			int d;
			c=++b;
			d=a++;
			c++;
			System.out.println("a="+a+"b="+b+"c="+c+"d="+d);
		}
	}
	
}
