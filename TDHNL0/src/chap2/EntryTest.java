package chap2;
/**
 * This is a test program about entry and  day
 *@author NguyenVanThai
 *ID:2611130213
 */
import junit.framework.TestCase;

public class EntryTest extends TestCase {
	/**
	 * test constructor
	 */
	public void testConstructer() {
		new Entry(new Date (23,10,2008), 5.3, 27,"nice");
	}
	/**
	 * testing for pace method
	 */
	public void testPace() {
		Entry entry1 = new Entry(new Date(5, 6, 2004), 5.3, 27, "good");
		assertEquals(entry1.pace(), 5.094, 0.001);
		Entry entry2 = new Entry(new Date(6, 6, 2004), 2.8, 24, "tired");
		assertEquals(entry2.pace(), 8.571, 0.001);
	}
	/**
	 * testing Date method(earlierThan)
	 */
	public void testDate() {
		new Date (23,10,2008);
		Date date1 = new Date(30, 6, 2003);
		Date date2 = new Date(1, 1, 2004);
		Date date3 = new Date(1, 12, 2003);
		Date date4 = new Date(15, 12, 2004);
		assertTrue(date1.earlierThan(date2));
		assertFalse(date2.earlierThan(date3));
		assertTrue(date3.earlierThan(date4));
	}
	


}
