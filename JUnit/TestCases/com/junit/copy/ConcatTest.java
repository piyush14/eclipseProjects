package com.junit.copy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.junit.StringOperations;

public class ConcatTest {
	
	@Parameters
	 public static Object[] data() {
	        return new Object[] { "first","second"};
	 }
	@Parameter(0)
	  public static String x;
	
	@Parameter(1)
	  public static String y;
	
	@Test
	public void concatTest(){
		assertEquals("HelloWorld", StringOperations.Concat("Hello","World"));
		assertEquals("firstsecond", StringOperations.Concat(x,y));
		assertEquals("welcomeWorld", StringOperations.Concat("welcome","World"));
	}
}
