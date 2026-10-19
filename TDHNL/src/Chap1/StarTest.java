package Chap1;


import junit.framework.TestCase;

public class StarTest extends TestCase {
	/**
	 * Testing constructer
	 */
	public void testConstructer() {
		new Star("Elton", "John", "guitar", 20000);
		new Star("Abba", "John", "vocals", 12200);
	}
	/**
	 * testing methods
	 */
	/**
	 * Testing for biggerSales
	 */
	public void testBiggerSales() {
		Star aStar1 = new Star("Abba", "John", "vocals", 12200);
		Star aStar2 = new Star("Elton", "John", "guitar", 20000);
		assertTrue(aStar2.biggerSales(aStar1));
		assertTrue(new Star("Debie", "Gission", "organ", 15000).biggerSales(aStar1));
		assertFalse(aStar1.biggerSales(new Star("Debie", "Gission", "organ", 15000)));
	}
	/**
	 * Testing for sameStar
	 */
	public void testSameStar() {
		Star aStar1 = new Star("Abba", "John", "vocals", 12200);
		Star aStar2 = new Star("Abba", "John", "vocals", 12200);
		Star aStar3 = new Star("Elton", "John", "guitar", 20000);
		assertTrue(aStar1.sameStar(aStar2));
		assertFalse(aStar3.sameStar(aStar1));
	}
	public void testEquals() {
		assertEquals(new Star("Abba", "John", "vocals", 12200),
		new Star("Abba", "John", "vocals", 12200));
		Star aStar1 = new Star("Elton", "John", "guitar", 20000);
		assertEquals(aStar1,
		new Star("Elton", "John", "guitar", 20000));
		Star aStar2 = new Star("Debie", "Gission", "organ", 15000);
		Star aStar3 = new Star("Debie", "Gission", "organ", 15000);
		assertEquals(aStar2, aStar3);

		}

}