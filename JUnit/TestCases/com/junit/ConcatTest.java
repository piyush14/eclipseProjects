package com.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConcatTest {
	@Test
	public void concatTest(){
		assertEquals("HelloWorld", StringOperations.Concat("Hello","World"));
		assertEquals("HelloPune", StringOperations.Concat("Hello","Pune"));
		assertEquals("welcomeWorld", StringOperations.Concat("welcome","World"));
	}
}
