package com.insuffbal;

public class InsufficientBalanceException extends Exception{
	String message = "";
	public InsufficientBalanceException(String message) {
		this.message = message;
	}
	//System.out.println("Inner try block");
	public void msg(){
		System.out.println("ERROR " + message);
	}
}
