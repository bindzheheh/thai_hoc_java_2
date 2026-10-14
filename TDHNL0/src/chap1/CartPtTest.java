package chap1;

import junit.framework.TestCase;
/**
 * This is a test program for CartPt
 */
public class CartPtTest extends TestCase {
	/**
	 * Testing for constructor
	 */
	public void testConstructer() {
		new CartPt(30,20);
		new CartPt(23,10);
	}
	/**
	 * Test methods
	 */
	/**
	 * Testing for distanceToO
	 */
	public void testdistanceToO() {
		new CartPt(5, 12).distanceToO();
		CartPt pt1 =new CartPt(5, 12);
		assertEquals(pt1.distanceToO(), 13.0);
		assertEquals(new CartPt(0, 3).distanceToO(), 3,0.01);
		CartPt pt2 = new CartPt(4, 7);
		assertEquals(pt2.distanceToO(), 8.062,0.1);
	}
	/**
	 * Testing for distanceBetweenTwoPoints
	 */
	public void testdistanceBetweenTwoPoints() {
		new CartPt(6, 8).distanceBetweenTwoPoints(new CartPt(3,4));
		CartPt pt1=new CartPt(0, 3);
		CartPt pt2=new CartPt(4,0);
		assertEquals(pt1.distanceBetweenTwoPoints(pt2),5.0);
		assertEquals(new CartPt(1, 2).distanceBetweenTwoPoints(new CartPt(5,3)),4.123,0.1);
	}
}
