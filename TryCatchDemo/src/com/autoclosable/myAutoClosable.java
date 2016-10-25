package com.autoclosable;

public class myAutoClosable implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println(" AUTOCLOSABLE CLOSED");
		
	}
	public void open(){
		System.out.println("AUTOCLOSABLE OPEN");
	}
}
