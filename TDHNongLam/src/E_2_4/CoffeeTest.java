package E_2_4;

import junit.framework.TestCase;
/**
 * This is a test program about selling coffee.
 * *@author NguyenVanThai
 *ID:2611130213
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
	 * testing for discount method
	 */
	public void testDiscount () {
		Coffee c1 =new Coffee("Hawaiian Kona", 15.95, 1000);
		Coffee c2 =new Coffee("Ethiopian", 8.0, 5000);
		Coffee c3 =new Coffee("Colombian Supreme ", 9.5, 25000);
		Coffee c4 =new Coffee("Ethiopian", 8.0, 4999);
		assertEquals(c1.discount(),0.0,0.01);
		assertEquals(c2.discount(),0.1,0.01);
		assertEquals(c3.discount(),0.25,0.01);
		assertEquals(c4.discount(),0.0,0.01);
	}
	/**
	 * Testing for cost method
	 */
	public void testCost() {
		Coffee c1 =new Coffee("Hawaiian Kona", 15.95, 1000);
		Coffee c2 =new Coffee("Ethiopian", 8.0, 5000);
		Coffee c3 =new Coffee("Colombian Supreme ", 9.5, 25000);
		assertEquals(c1.cost(),15950.0,0.01);
        assertEquals(c2.cost(),36000.0,0.01);
        assertEquals(c3.cost(),178125.0,0.01);
	}
	

}
