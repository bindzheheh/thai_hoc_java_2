package E_3_4;
/**
 * This is a test program about Train
 *@author NguyenVanThai
 *ID:2611130213
 */
import junit.framework.TestCase;

public class TrainTest extends TestCase {
	/**
	 * Test Constructor
	 */
	public void testConstructor() {
		ClockTime time1 = new ClockTime (6,0);
		ClockTime time2 = new ClockTime (11,0);
		Date d1 = new Date (3,11,2026);
		Date d2 = new Date (4,11,2026);
		Schedule s1 = new Schedule (time1,time2,d1,d2);
		Route r1 = new Route ("HaNoi","HaiPhong");
		new Train(s1, r1, true);
		ClockTime time3 = new ClockTime (1,0);
		ClockTime time4 = new ClockTime (17,0);
		Date d3 = new Date (23,10,2008);
		Date d4 = new Date (25,10,2008);
		Schedule s2 = new Schedule (time3,time4,d3,d4);
		Route r2 = new Route ("Hue","BenTre");
		new Train(s2, r2, false);
	}
	/**
	 *testing  method
	 */
	/**
	 * testing for methods of ClockTime 
	 */
	public void testClockTimeMethod() {
		ClockTime c1 = new ClockTime (6,0);
		ClockTime c2 = new ClockTime (11,0);
		ClockTime c3 = new ClockTime (1,30);
		ClockTime c4 = new ClockTime (6,0);
		/**
		 * conversion
		 */
		assertEquals(c1.conversion(),360);
		assertEquals(c2.conversion(),660);
		assertEquals(c3.conversion(),90);
		/**
		 * equals
		 */
		assertEquals(c1,c4);
		assertFalse(c1.equals(c2));
	}
	/**
	 * testing for methods of Route 
	 */
	public void testRouteMethod() {
		Route r1 = new Route ("HaNoi","HaiPhong");
		Route r2 = new Route ("Hue","BenTre");
		/**
		 * sameDestination
		 */
		assertTrue(r1.sameDestination("HaiPhong"));
		assertFalse(r1.sameDestination("Hue"));
		assertTrue(r2.sameDestination("BenTre"));
	}
	/**
	 * testing for methods of Date 
	 */
	public void testDateMethod() {
		Date d1 = new Date (3,11,2026);
		Date d2 = new Date (4,11,2026);
		Date d3 = new Date (10,5,2026);
		Date d4 = new Date (12,5,2026);
		/**
		 * conversionday
		 */
		assertEquals(d1.conversionday(d2),1);
		assertEquals(d1.conversionday(d1),0);
		assertEquals(d3.conversionday(d4),2);
	}
	/**
	 * testing for methods of Schedule 
	 */
	public void testScheduleMethod() {
		ClockTime time1 = new ClockTime (6,0);
		ClockTime time2 = new ClockTime (11,0);
		Date d1 = new Date (3,11,2026);
		Date d2 = new Date (3,11,2026);
		Schedule s1 = new Schedule (time1,time2,d1,d2);
		ClockTime time3 = new ClockTime (22,0);
		ClockTime time4 = new ClockTime (1,0);
		Date d3 = new Date (23,10,2008);
		Date d4 = new Date (24,10,2008);
		Schedule s2 = new Schedule (time3,time4,d3,d4);
		/**
		 * startTime
		 */
		assertEquals(s1.startTime(),time1);
		assertEquals(s2.startTime(),time3);
		/**
		 * durationDay
		 */
		assertEquals(s1.durationDay(),0);
		assertEquals(s2.durationDay(),1);
		/**
		 * duration
		 */
		assertEquals(s1.duration(),300);
		assertEquals(s2.duration(),180);
		/**
		 * conversion
		 */
		assertEquals(s1.conversion(),new ClockTime (5,0));
		assertEquals(s2.conversion(),new ClockTime (3,0));
	}
	/**
	 * testing for sameDestination method of Train
	 */
	public void testSameDestination() {
		ClockTime time1 = new ClockTime (6,0);
		ClockTime time2 = new ClockTime (11,0);
		Date d1 = new Date (3,11,2026);
		Date d2 = new Date (4,11,2026);
		Schedule s1 = new Schedule (time1,time2,d1,d2);
		Route r1 = new Route ("HaNoi","HaiPhong");
		Train t1 = new Train(s1, r1, true);
		ClockTime time3 = new ClockTime (1,0);
		ClockTime time4 = new ClockTime (17,0);
		Date d3 = new Date (23,10,2008);
		Date d4 = new Date (25,10,2008);
		Schedule s2 = new Schedule (time3,time4,d3,d4);
		Route r2 = new Route ("Hue","BenTre");
		Train t2 =new Train(s2, r2, false);
		assertTrue(t1.sameDestination("HaiPhong"));
		assertFalse(t1.sameDestination("Hue"));
		assertTrue(t2.sameDestination("BenTre"));
		assertFalse(t2.sameDestination("HaNoi"));
		assertFalse(t2.sameDestination("Bentre"));   
	}
	/**
	 * testing for startTime method of Train
	 */
	public void testStartTime() {
		ClockTime time1 = new ClockTime (6,0);
		ClockTime time2 = new ClockTime (11,0);
		Date d1 = new Date (3,11,2026);
		Date d2 = new Date (4,11,2026);
		Schedule s1 = new Schedule (time1,time2,d1,d2);
		Route r1 = new Route ("HaNoi","HaiPhong");
		Train t1 = new Train(s1, r1, true);
		ClockTime time3 = new ClockTime (1,0);
		ClockTime time4 = new ClockTime (17,0);
		Date d3 = new Date (23,10,2008);
		Date d4 = new Date (25,10,2008);
		Schedule s2 = new Schedule (time3,time4,d3,d4);
		Route r2 = new Route ("Hue","BenTre");
		Train t2 =new Train(s2, r2, false);
		assertEquals(t1.startTime(),time1);
		assertEquals(t2.startTime(),time3);
	}
	/**
	 * testing for duration method of Train
	 */
	public void testDuration() {
		ClockTime dTime = new ClockTime (1,0);
		ClockTime dTime1 = new ClockTime (3,0);
		ClockTime dTime2 = new ClockTime (36,30);
		ClockTime time1 = new ClockTime (22,0);
		ClockTime time2 = new ClockTime (23,0);
		Date d1 = new Date (3,11,2026);
		Date d2 = new Date (3,11,2026);
		Schedule s1 = new Schedule (time1,time2,d1,d2);
		Route r1 = new Route ("HaNoi","HaiPhong");
		Train t1 = new Train(s1, r1, true);
		ClockTime time3 = new ClockTime (22,0);
		ClockTime time4 = new ClockTime (1,0);
		Date d3 = new Date (23,10,2008);
		Date d4 = new Date (24,10,2008);
		Schedule s2 = new Schedule (time3,time4,d3,d4);
		Route r2 = new Route ("Hue","BenTre");
		Train t2 =new Train(s2, r2, true);
		ClockTime time5 = new ClockTime (20,0);
		ClockTime time6 = new ClockTime (8,30);
		Date d5 = new Date (10,5,2026);
		Date d6 = new Date (12,5,2026);
		Schedule s3 = new Schedule (time5,time6,d5,d6);
		Route r3 = new Route ("DaNang","SaiGon");
		Train t3 = new Train(s3, r3, true);
		assertEquals(t1.duration(),dTime);     
		assertEquals(t2.duration(),dTime1);   
		assertEquals(t3.duration(),dTime2);    //tàu chạy 2 ngày
	}
	

}