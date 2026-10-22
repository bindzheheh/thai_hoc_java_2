package E_2_2;
/**
 * This is the test program for MovieTheater
 *@author NguyenVanThai
 *ID:2611130213
 */
import junit.framework.TestCase;

public class MovieTheaterTest extends TestCase {
	/**
	 * test constructer
	 */
	public void testConstructer() {
		new MovieTheater(5,20,0.5);
	}
	/**
	 * test method
	 */
	/**
	 * test method (revenue:doanh thu) 
	 */
	public void testRevenue() {
		MovieTheater mt1 = new MovieTheater(5,20,0.5);
		MovieTheater mt2 = new MovieTheater(10,50,1);
		assertEquals(mt1.revenue(40),200.0,0.01);
		assertEquals(mt2.revenue(35),350.0,0.01);
	}
	/**
	 * test method (cost:chi phi)
	 */
	public void testCost() {
		MovieTheater mt1 = new MovieTheater(5,20,0.5);
		MovieTheater mt2 = new MovieTheater(10,50,1);
		assertEquals(mt1.cost(40),40.0,0.01);
		assertEquals(mt2.cost(35),85.0,0.01);
	}
	public void testProfit() {
		MovieTheater mt1 = new MovieTheater(5,20,0.5);
		MovieTheater mt2 = new MovieTheater(10,50,1);
		assertEquals(mt1.totalProfit(0),-20.0,0.01);
		assertEquals(mt1.totalProfit(40),160.0,0.01);
		assertEquals(mt2.totalProfit(35),265.0,0.01);
	}
}
