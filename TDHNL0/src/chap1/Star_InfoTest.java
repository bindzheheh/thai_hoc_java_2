package chap1;

import junit.framework.TestCase;
/**
 *  This is a test program for Star_Info
 */
public class Star_InfoTest extends TestCase {
	/**
	 * Testing constructer
	 */
	public void testConstructer() {
		new Star_Info("Elton", "John", "guitar", 20000);
		new Star_Info("Abba", "John", "vocals", 12200);
	}
	/**
	 * testing methods
	 */
	/**
	 * Testing for biggerSales
	 */
	public void testBiggerSales() {
		Star_Info aStar1 = new Star_Info("Abba", "John", "vocals", 12200);
		Star_Info aStar2 = new Star_Info("Elton", "John", "guitar", 20000);
		assertTrue(aStar2.biggerSales(aStar1));
		assertTrue(new Star_Info("Debie", "Gission", "organ", 15000).biggerSales(aStar1));
		assertFalse(aStar1.biggerSales(new Star_Info("Debie", "Gission", "organ", 15000)));
	}
	/**
	 * Testing for sameStar
	 */
	public void testSameStar() {
		Star_Info aStar1 = new Star_Info("Abba", "John", "vocals", 12200);
		Star_Info aStar2 = new Star_Info("Abba", "John", "vocals", 12200);
		Star_Info aStar3 = new Star_Info("Elton", "John", "guitar", 20000);
		assertTrue(aStar1.sameStar(aStar2));
		assertFalse(aStar3.sameStar(aStar1));
	}

}
