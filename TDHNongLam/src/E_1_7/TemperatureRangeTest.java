package E_1_7;
/**
 * make by :nguyen van thai
	2611130213
	chuong trinh kiem tra cho pham vi nhiet do
 */
import junit.framework.TestCase;

public class TemperatureRangeTest extends TestCase {
	/**
	 *data  cau truc 
	 */
	public void testConstructor() {
		new TemperatureRange(12,42);
		new TemperatureRange(22,32);
		new TemperatureRange(44,55);
	}

}
