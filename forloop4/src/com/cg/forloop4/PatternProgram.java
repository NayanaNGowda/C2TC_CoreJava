package com.cg.forloop4;

public class PatternProgram {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {//rows
			for(int j=1;j<=5-i+1;j++) {//columns
				System.out.print("* ");
				
			}
			System.out.println(" ");
		}

	}

}
