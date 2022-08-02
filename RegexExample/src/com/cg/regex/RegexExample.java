package com.cg.regex;

import java.util.regex.*;

public class RegexExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("+ quantifier......");
System.out.println(Pattern.matches("[amn]+","ammmmnnnn"));
System.out.println(Pattern.matches("[ann]+","ann"));
System.out.println(Pattern.matches("[amn]+","annn"));
System.out.println(Pattern.matches("[amn]","aazzte"));
	}

}
