package E_4_8;
/**
 * This is a test program about discount bookstore
 *@author NguyenVanThai
 *ID:2611130213
 */
import junit.framework.TestCase;

public class IBookStoreTest extends TestCase {
	/**
	 * testing for constructor
	 */
	public void testConstructor() {
		/**
		 * test class HardcoverBook: How to Design Programs, Felleisen, price 100.0, published 2001
		 */
		IBookStore h1 = new HardcoverBook("How to Design Programs", "Felleisen", 100.0, 2001);
		new HardcoverBook("Effective Java", "Bloch", 80.5, 2018);
		IBookStore s1 = new SaleBook("A Little Java", "Friedman", 40.0, 1998);
		new SaleBook("Old Algorithms", "Knuth", 60.0, 1990);
		IBookStore p1 = new Paperback("Java Basics", "Felleisen", 30.0, 2005);
		new Paperback("Learn Python", "Lutz", 25.0, 2013);
	}
	/**
	 * testing method
	 */

	/**
	 * testing for salePrice method
	 */
	public void testSalePrice() {
		HardcoverBook h1 = new HardcoverBook("How to Design Programs", "Felleisen", 100.0, 2001);
		SaleBook s1 = new SaleBook("A Little Java", "Friedman", 40.0, 1998);
		Paperback p1 = new Paperback("Java Basics", "Felleisen", 30.0, 2005);
		assertEquals(h1.salePrice(), 80.0, 0.01);                 // giảm 20%
		assertEquals(s1.salePrice(), 20.0, 0.01);                
		assertEquals(p1.salePrice(), 30.0, 0.01);                 
		assertEquals(new HardcoverBook("Effective Java", "Bloch", 80.5, 2018).salePrice(), 64.4, 0.01);
		assertEquals(new SaleBook("Free Sample", "Anonymous", 0.0, 2000).salePrice(), 0.0, 0.01);   
	}
	/**
	 * testing for cheaperThan method
	 */
	public void testCheaperThan() {
		HardcoverBook h1 = new HardcoverBook("How to Design Programs", "Felleisen", 100.0, 2001);   
		SaleBook s1 = new SaleBook("A Little Java", "Friedman", 40.0, 1998);                        
		Paperback p1 = new Paperback("Java Basics", "Felleisen", 30.0, 2005);                       
		SaleBook s2 = new SaleBook("Old Algorithms", "Knuth", 60.0, 1990);                          
		assertTrue(s1.cheaperThan(p1));                           // giá gốc 40 > 30 nhưng giá bán 20 < 30
		assertFalse(p1.cheaperThan(s1));
		assertTrue(p1.cheaperThan(h1));
		assertFalse(h1.cheaperThan(p1));
		assertTrue(s1.cheaperThan(h1));
		assertFalse(p1.cheaperThan(s2));                        
		assertFalse(s2.cheaperThan(p1));
		assertFalse(s1.cheaperThan(s1));                          
	}
	/**
	 * testing for sameAuthor method
	 */
	public void testSameAuthor() {
		HardcoverBook h1 = new HardcoverBook("How to Design Programs", "Felleisen", 100.0, 2001);
		SaleBook s1 = new SaleBook("A Little Java", "Friedman", 40.0, 1998);
		Paperback p1 = new Paperback("Java Basics", "Felleisen", 30.0, 2005);
		assertTrue(p1.sameAuthor(h1));
		assertTrue(h1.sameAuthor(p1));
		assertFalse(p1.sameAuthor(s1));
		assertFalse(s1.sameAuthor(h1));
		assertTrue(s1.sameAuthor(s1));                           
		assertTrue(h1.sameAuthor(new Paperback("Another Book", "Felleisen", 10.0, 2010)));
	}

}