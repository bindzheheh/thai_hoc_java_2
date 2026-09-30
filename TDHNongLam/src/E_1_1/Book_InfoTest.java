package E_1_1;
/**
 * make by :nguyen van thai
2611130213
chuong trinh chay thu
 */
import junit.framework.TestCase;

public class Book_InfoTest extends TestCase {
	public void testConstructor() {
		/**
		 * data cau truc
		 */
		new Book_Info("Daniel Defoe", "Robinson Crusoe", 15.50 , 1719);
		/**
		 * title:Daniel Defoe
		 * author:Robinson Crusoe
		 * price:15.5
		 * year:1719
		 */
		new Book_Info("Joseph Conrad", "Heart of Darkness", 12.80, 1902);
		new Book_Info("Pat Conroy"," Beach Music", 9.50, 1996);
	}

}
