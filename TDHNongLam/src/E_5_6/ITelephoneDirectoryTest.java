package E_5_6;
/**
 * This is a test program about the telephone directory
 *@author NguyenVanThai
 *ID:2611130213
 */
import junit.framework.TestCase;

public class ITelephoneDirectoryTest extends TestCase {
	/**
	 * testing for constructor
	 */
	public void testConstructor() {
		/**
		 * test class Phone: bin 1234567890, bin2 0987654321
		 */
		Phone p1 = new Phone("bin", "1234567890");
		Phone p2 = new Phone("bin2", "0987654321");
		new Phone("An", "0912345678");
		/**
		 * test class MTPhoneNum and ConsPhoneNum
		 */
		ITelephoneDirectory mt = new MTPhoneNum();
		ITelephoneDirectory l1 = new ConsPhoneNum(p1, mt);
		new ConsPhoneNum(p2, l1);
	}
	/**
	 * testing for methods of Phone
	 */
	public void testPhoneMethod() {
		Phone p1 = new Phone("bin", "1234567890");
		/**
		 * isName
		 */
		assertEquals(p1.isName("1234567890"), "bin");
		assertEquals(p1.isName("0987654321"), "");      // sai số điện thoại nên trả về ""
		/**
		 * isPhone
		 */
		assertEquals(p1.isPhone("bin"), "1234567890");
		assertEquals(p1.isPhone("bin2"), "");
		/**
		 * equals
		 */
		assertEquals(p1, new Phone("bin", "1234567890"));
		assertFalse(p1.equals(new Phone("bin", "0987654321")));
		assertFalse(p1.equals(new Phone("bin2", "1234567890")));
	}
	/**
	 * testing for whoseNumber method
	 */
	public void testWhoseNumber() {
		Phone p1 = new Phone("bin", "1234567890");
		Phone p2 = new Phone("bin2", "0987654321");
		Phone p3 = new Phone("An", "0912345678");
		ITelephoneDirectory mt = new MTPhoneNum();
		ITelephoneDirectory l1 = new ConsPhoneNum(p1, mt);
		ITelephoneDirectory l2 = new ConsPhoneNum(p2, l1);
		ITelephoneDirectory l3 = new ConsPhoneNum(p3, l2);
		assertEquals(mt.whoseNumber("1234567890"), "");     // danh bạ rỗng
		assertEquals(l2.whoseNumber("0987654321"), "bin2");
		assertEquals(l2.whoseNumber("1234567890"), "bin");
		assertEquals(l3.whoseNumber("0912345678"), "An");
		assertEquals(l3.whoseNumber("0000000000"), "");     // không có số này
		ITelephoneDirectory dup = new ConsPhoneNum(new Phone("bin3", "1234567890"), l1);
		assertEquals(dup.whoseNumber("1234567890"), "bin3");   // số trùng: trả về người đầu tiên,
	}
	/**
	 * testing for phoneNumber method
	 */
	public void testPhoneNumber() {
		Phone p1 = new Phone("bin", "1234567890");
		Phone p2 = new Phone("bin2", "0987654321");
		Phone p3 = new Phone("An", "0912345678");
		ITelephoneDirectory mt = new MTPhoneNum();
		ITelephoneDirectory l1 = new ConsPhoneNum(p1, mt);
		ITelephoneDirectory l2 = new ConsPhoneNum(p2, l1);
		ITelephoneDirectory l3 = new ConsPhoneNum(p3, l2);
		assertEquals(mt.phoneNumber("bin"), "");
		assertEquals(l2.phoneNumber("bin"), "1234567890");
		assertEquals(l2.phoneNumber("bin2"), "0987654321");
		assertEquals(l3.phoneNumber("An"), "0912345678");
		assertEquals(l3.phoneNumber("nobody"), "");
		ITelephoneDirectory dup = new ConsPhoneNum(new Phone("bin", "1111111111"), l1);
		assertEquals(dup.phoneNumber("bin"), "1111111111");   // tên trùng: trả về số đầu tiên
	}
	/**
	 * testing for equals method
	 */
	public void testEquals() {
		Phone p1 = new Phone("bin", "1234567890");
		Phone p2 = new Phone("bin2", "0987654321");
		ITelephoneDirectory mt = new MTPhoneNum();
		ITelephoneDirectory l1 = new ConsPhoneNum(p1, mt);
		ITelephoneDirectory l2 = new ConsPhoneNum(p2, l1);
		assertEquals(mt, new MTPhoneNum());
		assertEquals(l2, new ConsPhoneNum(new Phone("bin2", "0987654321"),
				new ConsPhoneNum(new Phone("bin", "1234567890"), new MTPhoneNum())));
		assertFalse(mt.equals(l1));
		assertFalse(l1.equals(l2));
		assertFalse(l2.equals(new ConsPhoneNum(p1, new ConsPhoneNum(p2, new MTPhoneNum()))));   // đảo thứ tự
	}
}