package E_1_4;
/**
 * make by :nguyen van thai
	2611130213
	chuong trinh kiem tra
 */
import junit.framework.TestCase;

public class TimeTest extends TestCase {
	/**
	 *data  cau truc 
	 */
	public void testConstructor() {
		new Time(1,2,30);// 1hour 2 minutes 30 seconds
		new Time(23,10,23.5);
	}

}
