package objects.classes;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStringMain {
	
	@Test
	public void testString() {
		String_Main st = new String_Main();
		assertEquals(st.subStrExist(st.str, "f1ox"), -1);
	}
	
	@Test
	public void testStringBuilder() {
		StringBuilder_Main sb = new StringBuilder_Main();
		assertEquals(sb.subStrExist(sb.str, "dog"), 1);
	}
}
