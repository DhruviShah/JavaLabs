package arrays.test;

import static org.junit.Assert.*;

import org.junit.Test;

import arrays.createArray;

public class arrayTest {

	@Test
	public void testCreateArray() {
		createArray arr = new createArray(5);
		assertEquals(arr.getArray().length, 5);
		assertEquals(arr.getArray()[3], 3);
	}

}
