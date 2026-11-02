package E_2_6;
/**
 * This is a test program about check QuadraticEquation.
 * *@author NguyenVanThai
 *ID:2611130213
 */
import junit.framework.TestCase;

public class QuadraticEquationTest extends TestCase {
	/**
	 * test constructor
	 */
	public void testConstructer() {
		new QuadraticEquation(0.0, 1.0, 2.0);
		new QuadraticEquation(2.0, 1.0, 2.0);
	}
	/**
	 * testing method
	 */
	/**
	 * test computeDelta (b^2 - 4ac)
	 */
	public void testComputeDelta() {
		assertEquals(new QuadraticEquation(1.0, 3.0, 1.0).computeDelta(), 5.0, 0.01);   // 9 - 4 = 5
		assertEquals(new QuadraticEquation(1.0, 2.0, 1.0).computeDelta(), 0.0, 0.01);  
		assertEquals(new QuadraticEquation(1.0, 0.0, 1.0).computeDelta(), -4.0, 0.01);  
	}
	/**
	 * test whatKind
	 */
	public void testWhatKind() {
		assertEquals(new QuadraticEquation(0.0, 2.0, 1.0).whatKind(), "degenerate");  // a = 0
		assertEquals(new QuadraticEquation(0.0, 0.0, 0.0).whatKind(), "degenerate");  
		assertEquals(new QuadraticEquation(1.0, 0.0, 1.0).whatKind(), "none");        // delta = -4
		assertEquals(new QuadraticEquation(1.0, 2.0, 1.0).whatKind(), "one");         // delta = 0
		assertEquals(new QuadraticEquation(2.0, 1.0, 2.0).whatKind(), "none");       
		assertEquals(new QuadraticEquation(1.0, 3.0, 1.0).whatKind(), "two");         // delta = 5
		assertEquals(new QuadraticEquation(1.0, -5.0, 6.0).whatKind(), "two");       
	}

}
