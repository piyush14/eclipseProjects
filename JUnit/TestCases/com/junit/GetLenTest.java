package com.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GetLenTest {
	@Test
	public void getLengthTest(){
		assertEquals(5, StringOperations.getLength("hello"));

	}
}
