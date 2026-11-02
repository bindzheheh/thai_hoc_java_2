package E_2_5;
/**
 * This is a test program about selling JetFuel.
 * *@author NguyenVanThai
 *ID:2611130213
 */
import junit.framework.TestCase;

public class JetFuelTest extends TestCase {
	/**
	 * test constructor
	 */
	public void testConstructer() {
		new JetFuel(50000,"jet A", 300);
	}
	/**
	 * testing for totalCost method
	 */
	public void testTotalCost() {
			JetFuel j1 = new JetFuel(50000, "Jet A", 300);   
			JetFuel j2 = new JetFuel(200000, "Jet A1", 250);
			assertEquals(j1.totalCost(), 15000000.0, 0.01);
			assertEquals(j2.totalCost(), 50000000.0, 0.01);
		}
	/**
	 * test discountPrice (giảm 10% khi MUA HƠN 100000 gallon)
	 */
	public void testDiscountPrice() {
		JetFuel j1 = new JetFuel(50000, "Jet A", 300);   
		JetFuel j2 = new JetFuel(100000, "Jet A", 300);  
		JetFuel j3 = new JetFuel(100001, "Jet A", 300);  
		JetFuel j4 = new JetFuel(200000, "Jet A1", 250);  
		assertEquals(j1.discountPrice(), 15000000.0, 0.01);
		assertEquals(j2.discountPrice(), 30000000.0, 0.01);
		assertEquals(j3.discountPrice(), 27000270.0, 0.01); 
		assertEquals(j4.discountPrice(), 45000000.0, 0.01); 
	}


}
