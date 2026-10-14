package chap1;

import junit.framework.TestCase;
/**
 * This is a test program about selling coffee.
 */
public class CoffeeTest extends TestCase {
	/**
	 * Testing for constructor
	 */
	public void testConstructor() {
		new Coffee("Hawaiian Kona", 15.95, 100);
		new Coffee("Ethiopian", 8.0, 1000);
		new Coffee("Colombian Supreme ", 9.5, 1700);
		}
	/**
	 * Testing for cost method
	 */
	public void testCost() {
		Coffee c2 = new Coffee("Ethiopian", 8.0, 1000);
		assertEquals(c2.cost(), 8000.0);
		assertEquals(new Coffee("Hawaiian Kona", 15.95, 100).cost(),1595.0);
		Coffee c3 = new Coffee("Colombian Supreme ", 9.5, 1700);
		assertEquals(c3.cost(), 16150,0.01);
	}
	/**
	 * Testing for priceOver method
	 */
	public void testpriceOver() {
		assertTrue(new Coffee("Colombian Supreme ", 9.5, 1700).priceOver(8));
		Coffee c2 = new Coffee("Ethiopian", 8.0, 1000);
		assertTrue(c2.priceOver(3));
	}

}
