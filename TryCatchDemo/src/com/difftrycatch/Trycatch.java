package com.difftrycatch;

public class Trycatch {
	
	public void test(){
		int [] a = new int [3];
		try{
			
			int ans = 5 /2;
			try{
				a[4]=10;
			}catch(Exception e){
				System.out.println("Inner try block");
				
			}
		}catch(ArithmeticException e){
			System.out.println("Outer try block");
		}finally{
			System.out.println("IN FINALLY BLOCK");
		}
		
	}

}
