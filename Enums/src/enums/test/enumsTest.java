package enums.test;

import static org.junit.Assert.*;

import org.junit.Test;

import enums.Membership;

public class enumsTest {

	@Test
	public void testEnum() {
		Membership m = Membership.StandardMember;
		assertEquals(m.borrowLimit(), 6);
		assertEquals(m.canBorrow(), true);
	}
}
