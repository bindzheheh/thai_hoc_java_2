package E_1_2;
/**
 * make by :nguyen van thai
	2611130213
 */
import junit.framework.TestCase;

public class Computer_ImagesTest extends TestCase {
	/**
	 *data  cau truc 
	 */
	public void testConstructor() {
		new Computer_Images(5, 10, "small.gif", "low");
		/**
		 * cao:5
		 * rong:10
		 * nguon:small.gif
		 * chat luong:low
		 */
		new Computer_Images(120, 200, "med.gif", "low");
		new Computer_Images(1200, 1000, "large.gif", "high");
	}

}
