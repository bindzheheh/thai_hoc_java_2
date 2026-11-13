package E_4_1;
/**
 * This is a test program about bank account
 *@author NguyenVanThai
 *ID:2611130213
 */
import junit.framework.TestCase;

public class ABankTest extends TestCase {
	/**
	 * testing for constructor
	 */
	public void testConstructor() {
		/**
		 * test class checking_Account: Earl Gray, id 1729, $1250, minimum balance $500
		 */
		ABank earl = new checking_Account(1729, "Earl Gray", 1250, 500);
		new checking_Account(1000, "An", 3000.5, 100);
		ABank annie = new Saving_Account(2992, "Annie Proulx", 800, 3.5);
		new Saving_Account(2000, "Binh", 0, 2.0);
		Date date1 = new Date(1, 6, 2005);   // ngày, tháng, năm
		ABank ima = new CD_Account(4104, "Ima Flatt", 10123, date1, 4);
		new CD_Account(3000, "Cuong", 5000.75, new Date(15, 12, 2030), 5.5);
	}
	/**
	 * testing for constructor of class Date
	 */
	public void testDateConstructor() {
		/**
		 * test class Date: June 1, 2005
		 */
		new Date(1, 6, 2005);
		new Date(31, 12, 1999);
	}

}