package E_4_6;
/**
 * This is a test program about grocery store items
 *@author NguyenVanThai
 *ID:2611130213
 */
import junit.framework.TestCase;

public class IStoreTest extends TestCase {
	/**
	 * testing for constructor
	 */
	public void testConstructor() {
		/**
		 * test class Coffee: Highland, 500 grams, 2500 cents, regular coffee
		 */
		IStore coffee1 = new Coffee("Highland", 500, 2500, true);
		new Coffee("Trung Nguyen", 100, 300, false);
		IStore juice1 = new Juice("Vinamilk", 1000, 12000, "orange", "bottled");
		new Juice("Tropicana", 500, 4000, "apple", "canned");
		IStore iceCream1 = new IceCream("Walls", 250, 1000, "vanilla", "regular ice cream");
		new IceCream("Kido", 300, 1500, "mango", "sorbet");
	}
	/**
	 * testing method
	 */

	/**
	 * testing for unitPrice method
	 */
	public void testUnitPrice() {
		Coffee c1 = new Coffee("Highland", 500, 2500, true);
		Juice j1 = new Juice("Vinamilk", 1000, 12000, "orange", "bottled");
		IceCream i1 = new IceCream("Walls", 250, 1000, "vanilla", "regular ice cream");
		assertEquals(c1.unitPrice(), 5.0, 0.01);
		assertEquals(j1.unitPrice(), 12.0, 0.01);
		assertEquals(i1.unitPrice(), 4.0, 0.01);
		assertEquals(new Coffee("Trung Nguyen", 100, 300, false).unitPrice(), 3.0, 0.01);
	}
	/**
	 * testing for lowerPrice method
	 */
	public void testLowerPrice() {
		Coffee c1 = new Coffee("Highland", 500, 2500, true);         
		Juice j1 = new Juice("Vinamilk", 1000, 12000, "orange", "bottled");  
		IceCream i1 = new IceCream("Walls", 250, 1000, "vanilla", "regular ice cream"); 
		assertTrue(c1.lowerPrice(6.0));
		assertFalse(c1.lowerPrice(4.0));
		assertFalse(c1.lowerPrice(5.0));                             
		assertTrue(i1.lowerPrice(4.5));
		assertFalse(j1.lowerPrice(12.0));                           
		assertTrue(j1.lowerPrice(12.5));
	}
	/**
	 * testing for cheaperThan method
	 */
	public void testCheaperThan() {
		Coffee c1 = new Coffee("Highland", 500, 2500, true);        
		Juice j1 = new Juice("Vinamilk", 1000, 12000, "orange", "bottled");  
		IceCream i2 = new IceCream("Big", 5000, 10000, "chocolate", "sorbet");  
		Coffee c4 = new Coffee("Highland 1kg", 1000, 5000, false);  
		assertTrue(c1.cheaperThan(j1));
		assertFalse(j1.cheaperThan(c1));
		assertTrue(i2.cheaperThan(c1));                              
		assertFalse(c1.cheaperThan(i2));
		assertFalse(c1.cheaperThan(c4));                            
		assertFalse(c4.cheaperThan(c1));
	}

}