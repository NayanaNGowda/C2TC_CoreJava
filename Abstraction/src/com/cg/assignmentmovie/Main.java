package com.cg.assignmentmovie;

abstract class Movie{
	abstract String setTitle(String name);
}
class mymovie extends Movie{

	@Override
	String setTitle(String name) {
		// TODO Auto-generated method stub
		return name;
	}
	
}
public class Main{
	public static void main(String[] args) {
		Movie m=new mymovie();
		System.out.println(m.setTitle("The Title is :HARRY POTTER"));
			
	}
}