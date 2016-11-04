package com.junit.copy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.junit.StringOperations;


@RunWith(Parameterized.class)
public class GetLenTest {
	
	@Parameters
	 public static Object[] data() {
	        return new Object[] { "first"};
	 }
	@Parameter(0)
	  public static String x;
	@Test
	public void getLengthTest(){
		assertEquals(5, StringOperations.getLength(x));
		//assertEquals(3, StringOperations.getLength(y));

	}
}
