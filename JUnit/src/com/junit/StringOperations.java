package com.junit;

public class StringOperations {

	public static String Concat(String s1, String s2){
		return s1.concat(s2);
	}
	
	public static String getCharacter(int index){
		//System.out.println("Hello".charAt(2));
		char temp = "Hello".charAt(index);
		return Character.toString(temp);

	}
	
	public static int getLength(String x){
		return x.length();
	}
}


