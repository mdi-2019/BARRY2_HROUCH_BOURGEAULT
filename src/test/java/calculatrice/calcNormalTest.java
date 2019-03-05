package calculatrice;

import junit.framework.TestCase;

public class calcNormalTest extends TestCase {
	
	public void testAdd() {
		assertEquals(9.0, calcNormal.add(4, 5));
	}
	
	public void testMul() {
		assertEquals(25.0, calcNormal.mul(5, 5));
	}
}
