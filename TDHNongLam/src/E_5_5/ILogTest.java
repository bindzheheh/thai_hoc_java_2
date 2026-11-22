package E_5_5;
/**
 * This is a test program about the runner's log
 *@author NguyenVanThai
 *ID:2611130213
 */
import junit.framework.TestCase;

public class ILogTest extends TestCase {
	/**
	 * testing for constructor
	 */
	public void testConstructor() {
		Time t1 = new Time(1, 0);
		Time t2 = new Time(0, 30);
		Time t3 = new Time(0, 45);

		Date d1 = new Date(23, 10, 2008);
		Date d2 = new Date(24, 10, 2008);
		Date d3 = new Date(25, 10, 2008);
		Date d4 = new Date(26, 10, 2008);
		Entry e1 = new Entry(d1, 0, "vua sinh nen chua chay", t1);
		Entry e2 = new Entry(d2, 10, "1 ngay tuoi chay", t2);
		Entry e3 = new Entry(d3, 25, "2 ngay tuoi chay", t3);
		Entry e4 = new Entry(d4, 15, "3 ngay tuoi chay", t2);

		ILog l0 = new MTLog();
		ILog l1 = new ConsLog(e1, l0);
		ILog l2 = new ConsLog(e2, l1);
		ILog l3 = new ConsLog(e3, l2);
		ILog l4 = new ConsLog(e4, l3);
		System.out.println(l4);
	}
	/**
	 * testing for methods of Time, Date and Entry
	 */
	public void testTimeDateEntryMethod() {
		/**
		 * test class Time: 1h0, 0h30
		 */
		Time t1 = new Time(1, 0);
		Time t2 = new Time(0, 30);
		assertEquals(t1.converMinute(), 60, 0.01);   
		assertEquals(t2.converMinute(), 30, 0.01);
		assertTrue(t2.equals(new Time(0, 30)));
		assertFalse(t1.equals(t2));
		/**
		 * test class Date: 23/10/2008
		 */
		Date d1 = new Date(23, 10, 2008);
		assertTrue(d1.isMonth(10, 2008));
		assertFalse(d1.isMonth(11, 2008));
		assertTrue(d1.equals(new Date(23, 10, 2008)));
		assertFalse(d1.equals(new Date(24, 10, 2008)));
		/**
		 * test class Entry: 24/10/2008, 10 kilo, 0h30 and 25/10/2008,25kilo , 0h45
		 */
		Entry e2 = new Entry(new Date(24, 10, 2008), 10, "1 ngay tuoi chay", new Time(0, 30));
		Entry e3 = new Entry(new Date(25, 10, 2008), 25, "2 ngay tuoi chay", new Time(0, 45));
		assertEquals(e2.getDistance(), 10, 0.01);
		assertTrue(e2.isMonth(10, 2008));
		assertTrue(e2.equals(new Entry(new Date(24, 10, 2008), 10, "1 ngay tuoi chay", new Time(0, 30)))); // Time tạo riêng, bắt lỗi dùng ==
		assertFalse(e2.equals(e3));
		assertTrue(e3.hasDistanceOnMinuteLarger(e2));
		assertFalse(e2.hasDistanceOnMinuteLarger(e3));
	}
	/**
	 * testing for totalDistance method
	 */
	public void testTotalDistance() {
		Entry e1 = new Entry(new Date(23, 10, 2008), 0, "vua sinh nen chua chay", new Time(1, 0));
		Entry e2 = new Entry(new Date(24, 10, 2008), 10, "1 ngay tuoi chay", new Time(0, 30));
		Entry e3 = new Entry(new Date(25, 10, 2008), 25, "2 ngay tuoi chay", new Time(0, 45));
		Entry e4 = new Entry(new Date(26, 10, 2008), 15, "3 ngay tuoi chay", new Time(0, 30));
		ILog l0 = new MTLog();
		ILog l1 = new ConsLog(e1, l0);
		ILog l2 = new ConsLog(e2, l1);
		ILog l3 = new ConsLog(e3, l2);
		ILog l4 = new ConsLog(e4, l3);
		assertEquals(l3.totalDistance(10, 2008), 35, 0.01);   
		assertEquals(l0.totalDistance(10, 2008), 0, 0.01);
		assertEquals(l3.totalDistance(11, 2008), 0, 0.01);
		assertEquals(l4.totalDistance(10, 2008), 50, 0.01);
	}
	/**
	 * testing for maxDistance method
	 */
	public void testMaxDistance() {
		Entry e1 = new Entry(new Date(23, 10, 2008), 0, "vua sinh nen chua chay", new Time(1, 0));
		Entry e2 = new Entry(new Date(24, 10, 2008), 10, "1 ngay tuoi chay", new Time(0, 30));
		Entry e3 = new Entry(new Date(25, 10, 2008), 25, "2 ngay tuoi chay", new Time(0, 45));
		Entry e4 = new Entry(new Date(26, 10, 2008), 15, "3 ngay tuoi chay", new Time(0, 30));
		ILog l0 = new MTLog();
		ILog l1 = new ConsLog(e1, l0);
		ILog l2 = new ConsLog(e2, l1);
		ILog l3 = new ConsLog(e3, l2);
		ILog l4 = new ConsLog(e4, l3);
		assertEquals(l0.maxDistance(), 0, 0.01);  
		assertEquals(l1.maxDistance(), 0, 0.01);
		assertEquals(l2.maxDistance(), 10, 0.01);
		assertEquals(l3.maxDistance(), 25, 0.01);
		assertEquals(l4.maxDistance(), 25, 0.01);
	}
	/**
	 * testing for sortByDistanceOnMinute method
	 */
	public void testSortByDistanceOnMinute() {
		Entry e1 = new Entry(new Date(23, 10, 2008), 0, "vua sinh nen chua chay", new Time(1, 0));
		Entry e2 = new Entry(new Date(24, 10, 2008), 10, "1 ngay tuoi chay", new Time(0, 30));
		Entry e3 = new Entry(new Date(25, 10, 2008), 25, "2 ngay tuoi chay", new Time(0, 45));
		Entry e4 = new Entry(new Date(26, 10, 2008), 15, "3 ngay tuoi chay", new Time(0, 30));
		ILog l0 = new MTLog();
		ILog l1 = new ConsLog(e1, l0);
		ILog l2 = new ConsLog(e2, l1);
		ILog l3 = new ConsLog(e3, l2);
		ILog l4 = new ConsLog(e4, l3);
		ILog sorted = new ConsLog(e3, new ConsLog(e4, new ConsLog(e2, new ConsLog(e1, new MTLog()))));
		ILog unsorted = new ConsLog(e1, new ConsLog(e2, new ConsLog(e3, new ConsLog(e4, new MTLog()))));
		assertTrue(l4.sortByDistanceOnMinute().equals(sorted));      // nhanh nhất → chậm nhất: e3, e4, e2, e1
		assertTrue(unsorted.sortByDistanceOnMinute().equals(sorted));
		assertTrue(l0.sortByDistanceOnMinute().equals(new MTLog()));
		assertTrue(l1.sortByDistanceOnMinute().equals(l1));
	}
	/**
	 * testing for insertInDistanceOrderOnMinute method
	 */
	public void testInsertInDistanceOrderOnMinute() {
		Entry e1 = new Entry(new Date(23, 10, 2008), 0, "vua sinh nen chua chay", new Time(1, 0));
		Entry e2 = new Entry(new Date(24, 10, 2008), 10, "1 ngay tuoi chay", new Time(0, 30));
		Entry e3 = new Entry(new Date(25, 10, 2008), 25, "2 ngay tuoi chay", new Time(0, 45));
		Entry e4 = new Entry(new Date(26, 10, 2008), 15, "3 ngay tuoi chay", new Time(0, 30));
		ILog l0 = new MTLog();
		ILog l1 = new ConsLog(e1, l0);
		ILog l3 = new ConsLog(e3, new ConsLog(e2, l1));    // đã sắp xếp: e3, e2, e1
		ILog l9 = new ConsLog(e3, new ConsLog(e4, new ConsLog(e2, new ConsLog(e1, new MTLog()))));
		assertTrue(l3.insertInDistanceOrderOnMinute(e4).equals(l9));  
		assertTrue(l0.insertInDistanceOrderOnMinute(e1).equals(l1));   
		assertTrue(l1.insertInDistanceOrderOnMinute(e3).equals(new ConsLog(e3, l1))); 
	}
}