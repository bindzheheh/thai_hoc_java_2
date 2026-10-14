package Chap1;

import junit.framework.TestCase;

public class CoffeeTest extends TestCase {
	public void testConstructor() {
		assertEquals(
				new Coffee("Hawaiian Kona", 15.95, 100).cost(), 1595.0);
		Coffee c2 = new Coffee("Ethiopian", 8.0, 1000);
		assertEquals(c2.cost(), 8000.0);
		Coffee c3 = new Coffee("Colombian Supreme ", 9.5, 1700);
		assertEquals(c3.cost(), 16150.0);
		assertEquals(
				new Coffee("bin Kona", 1000, 100).cost(),100000.0);
		assertTrue(c2.priceOver(3));
	}

}
