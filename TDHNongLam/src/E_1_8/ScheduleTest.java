package E_1_8;
/**
 * make by :nguyen van thai
	2611130213
	chuong trinh kiem tra cho lich trinh (schedule) gom thoi gian(time)
 */
import junit.framework.TestCase;

public class ScheduleTest extends TestCase {
	/**
	 *kiem tra data  cau truc 
	 */
	public void testConstructor() {
		ClockTime time =new ClockTime(2,3);
		ClockTime time2 =new ClockTime(5,30);
		new Schedule(time,time2);
		/**
		 * gio khoi hanh :2h3p
		 * gio den:5h30p
		 */
	}

}
