package E_1_3;
/**
 * make by :nguyen van thai
	2611130213
	chuong trinh kiem tra
 */
import junit.framework.TestCase;

public class AutomobileTest extends TestCase {
	/**
	 *data  cau truc 
	 */
	public void testConstructor() {
		new Automobile("Toyota Camry", 26420, 32.0, false);
		/**
		 * hang:Toyota Camry
		 * gia:26420
		 * cong suat:32.0
		 * da dung:false(chua)
		 */
		new Automobile("Honda Civic", 18500, 36.5, true);
		new Automobile("Ford Mustang", 30920, 25.0, false);
	}

}
