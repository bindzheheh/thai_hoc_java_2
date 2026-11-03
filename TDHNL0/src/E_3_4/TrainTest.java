package E_3_4;
/**
 * This is a test program about House
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
		Schedule s1 = new Schedule (time1,time2);
		Route r1 = new Route ("HaNoi","HaiPhong");
		new Train(s1, r1, true);
		ClockTime time3 = new ClockTime (1,0);
		ClockTime time4 = new ClockTime (17,0);
		Schedule s2 = new Schedule (time3,time4);
		Route r2 = new Route ("Hue","BenTre");
		new Train(s2, r2, false);
	}
	/**
	 *testing  method
	 */
	/**
	 * tesing for SameDestination method in Route
	 */
	public void testSameDestination() {
		Route r1 = new Route("HaNoi","HaiPhong");
		assertTrue(r1.sameDestination("HaiPhong"));
		assertFalse(r1.sameDestination("Hue"));
	}
	/**
	 * tesing for StartTime method in schedule
	 */
	public void testStartTime() {
		ClockTime time1 = new ClockTime (6,0);
		ClockTime time2 = new ClockTime (11,0);
		Schedule s1 = new Schedule (time1,time2);
		assertEquals(s1.startTime(),time1);
	}
	
	/**
	 * tesing for SameDestination method
	 */
	public void testSameDestination1() {
		ClockTime time1 = new ClockTime (6,0);
		ClockTime time2 = new ClockTime (11,0);
		Schedule s1 = new Schedule (time1,time2);
		Route r1 = new Route ("HaNoi","HaiPhong");
		Train t1 = new Train(s1, r1, true);
		ClockTime time3 = new ClockTime (1,0);
		ClockTime time4 = new ClockTime (17,0);
		Schedule s2 = new Schedule (time3,time4);
		Route r2 = new Route ("Hue","BenTre");
		Train t2 =new Train(s2, r2, false);
		assertTrue(t1.sameDestination("HaiPhong"));
		assertFalse(t1.sameDestination("Hue"));
		assertTrue(t2.sameDestination("BenTre"));
		assertFalse(t2.sameDestination("HaNoi"));
	
	}
	/**
	 * testing for startTime method
	 */
	public void testStartTime1() {
		ClockTime time1 = new ClockTime (6,0);
		ClockTime time2 = new ClockTime (11,0);
		Schedule s1 = new Schedule (time1,time2);
		Route r1 = new Route ("HaNoi","HaiPhong");
		Train t1 = new Train(s1, r1, true);
		ClockTime time3 = new ClockTime (13,0);
		ClockTime time4 = new ClockTime (17,0);
		Schedule s2 = new Schedule (time3,time4);
		Route r2 = new Route ("Hue","BenTre");
		Train t2 =new Train(s2, r2, false);
		assertEquals(t1.startTime(),time1);
		assertEquals(t2.startTime(),time3);
	
	}
	/**
	 * testing for duration
	 */
	public void testDuration() {
		ClockTime dTime = new ClockTime (5,0);
		ClockTime dTime1 = new ClockTime (4,0);
		ClockTime time1 = new ClockTime (6,0);
		ClockTime time2 = new ClockTime (11,0);
		Schedule s1 = new Schedule (time1,time2);
		Route r1 = new Route ("HaNoi","HaiPhong");
		Train t1 = new Train(s1, r1, true);
		ClockTime time3 = new ClockTime (13,0);
		ClockTime time4 = new ClockTime (17,0);
		Schedule s2 = new Schedule (time3,time4);
		Route r2 = new Route ("Hue","BenTre");
		Train t2 =new Train(s2, r2, false);
		assertEquals(t1.duration(),dTime);
		assertEquals(t2.duration(),dTime1);
	
	}
	

}
