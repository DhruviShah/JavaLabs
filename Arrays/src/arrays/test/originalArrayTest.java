package arrays.test;

import static org.junit.Assert.*;

import org.junit.Test;

import arrays.originalArrays;

public class originalArrayTest {
	
	@Test
	public void testOriginalArray() {
		int[] arr = {2, 4, 34, 6, 32, 11};
		
		originalArrays oa = new originalArrays(arr);
		assertEquals(oa.hasDuplicates(arr), false);
		assertEquals(oa.hasDuplicatesInsertion(arr), false);
	}
}
