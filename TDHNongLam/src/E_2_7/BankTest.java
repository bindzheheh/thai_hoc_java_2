package E_2_7;
/**
 * This is a test program about Bank
 *@author NguyenVanThai
 *ID:2611130213
 */
import junit.framework.TestCase;

public class BankTest extends TestCase {
	/**
	 * test constructor
	 */
	public void testConstructer() {
		new Bank("An", 500, 1);
		new Bank("Binh", 6000, 2);
	}
	/**
	 * testing method
	 */
	/**
	 * test interest
	 */
	public void testInterest() {
		assertEquals(new Bank("An", 500, 1).interest(), 20.0, 0.01);     
		assertEquals(new Bank("Binh", 1000, 1).interest(), 40.0, 0.01);  
		Bank b3 = new Bank("Chi", 6000, 1); 
		assertEquals(b3.interest(), 300.0, 0.01);
		assertEquals(new Bank("Dung", 3000, 1).interest(), 135.0, 0.01); 
		assertEquals(new Bank("Em", 5000, 1).interest(), 225.0, 0.01);   
		assertEquals(new Bank("Phuc", 6000, 1).interest(), 300.0, 0.01); 
	}
	/**
	 * test payback
	 */
	public void testPayback() {
		assertEquals(new Bank("An", 400, 1).payback(), 1.0, 0.01);     
		assertEquals(new Bank("Binh", 500, 1).payback(), 1.25, 0.01);  
		Bank b3 = new Bank("Chi", 3500, 1); 
		assertEquals(b3.payback(), 23.75, 0.01);
		assertEquals(new Bank("Dung", 1500, 1).payback(), 6.25, 0.01); 
		assertEquals(new Bank("Em", 2500, 1).payback(), 13.75, 0.01);  
		assertEquals(new Bank("Phuc", 3500, 1).payback(), 23.75, 0.01);
	}

}