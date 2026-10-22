package E_2_3;
/**
 * This is the test program for image
 *@author NguyenVanThai
 *ID:2611130213
 */
import junit.framework.TestCase;

public class ImageTest extends TestCase {
	/**
	 * test constructer
	 */
	public void testConstructer() {
		new Image(10,5,"idk.jpg","low");
	}
	/**
	 * test method 
	 */
	/**
	 * test method isPortrait
	 */
	public void testPortrait() {
		Image i1 = new Image(10000,5000,"idk.jpg","low");
		Image i2 = new Image(7500,15000,"yes.jpg","high");
		assertFalse(i1.isPortrait());
		assertTrue(i2.isPortrait());
	}
	/**
	 * test method size
	 */
	public void testSize () {
		Image i1 = new Image(10000,5000,"idk.jpg","low");
		Image i2 = new Image(7500,15000,"yes.jpg","high");
		assertEquals(i1.size(),50000000.0,0.001);
		assertEquals(i2.size(),112500000.0,0.001);
	}
	/**
	 * test method isLarger
	 */
	public void testLarger() {
		Image i1 = new Image(10000,5000,"idk.jpg","low");
		Image i2 = new Image(7500,15000,"yes.jpg","high");
		Image i3 = new Image(6000,9000,"idk2.jpg","low");
		assertFalse(i1.isLarger(i2));
		assertFalse(i1.isLarger(i3));
		assertTrue(i2.isLarger(i3));
		
	}
	/**
	 * test method same
	 */
	public void testSame() {
		Image i1 = new Image(10000,5000,"idk.jpg","low");
		Image i2 = new Image(7500,15000,"yes.jpg","high");
		Image i3 = new Image(10000,5000,"idk.jpg","low"); 
		assertFalse(i2.same(i3));
		assertTrue(i1.same(i3));
		assertFalse(i1.same(i2));
	}
	/**
	 * test override
	 */
	public void testOverride() {
		Image i1 = new Image(10000,5000,"idk.jpg","low");
		Image i3 = new Image(10000,5000,"idk.jpg","low"); 
		assertEquals(i1,i3);	
	}
	/**
	 * test sizeString
	 */
	public void testSizeString() {
		Image i1 = new Image(10000,5000,"idk.jpg","low");
		Image i2 = new Image(10,500,"idk.jpg","low");
		Image i3 = new Image(100,5000,"idk.jpg","low"); 
		assertEquals(i1.sizeString(), "large");	
		assertEquals(i2.sizeString(), "small");	
		assertEquals(i3.sizeString(), "medium");
	}

	

}
