package chap2;

import junit.framework.TestCase;

public class RectangleTest extends TestCase {
	public  void test() {
		CartPt p = new CartPt(3, 4);
		
		Rectangle r = new Rectangle(p, 5, 17);
		Rectangle e = new Rectangle(p, 6, 8);
		assertEquals(p.distanceToO(), 5, 0.001);
		assertEquals(r.distanceToO(), 5, 0.001);
		assertEquals(e.distanceToO2(), 10, 0.001);
		
	}

}
