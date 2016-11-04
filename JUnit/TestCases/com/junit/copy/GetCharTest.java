package com.junit.copy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.junit.StringOperations;

public class GetCharTest {
	
	@Parameters
	 public static Object[] data() {
	        return new Object[] {2,1,3};
	 }
	@Parameter(0)
	  public static int  x;
	@Test
	public void getCharacterTest(){
		assertEquals("l", StringOperations.getCharacter(2));
		assertEquals("e", StringOperations.getCharacter(x));

		assertEquals("l", StringOperations.getCharacter(x));

	}
}
