package E_5_1;
/**
 * This is a test program about the list of estates
 *@author NguyenVanThai
 *ID:2611130213
 */
import junit.framework.TestCase;

public class IListEstateTest extends TestCase {
	/**
	 * testing for constructor
	 */
	public void testConstructor() {
		/**
		 * test class Address: 23 Maple Street, Brookline
		 */
		Address a1 = new Address(23, "Maple Street", "Brookline");
		new Address(5, "Joye Road", "Newton");
		/**
		 * test class House: Ranch, 7 rooms, $375,000, address a1
		 */
		House h1 = new House("Ranch", 7, 375000.0, a1);
		new House("Colonial", 9, 450000.0, new Address(5, "Joye Road", "Newton"));
		/**
		 * test class MTEstate and ConsEstate
		 */
		IListEstate mt = new MTEstate();
		IListEstate l1 = new ConsEstate(h1, mt);
		new ConsEstate(h1, new MTEstate());
	}
	/**
	 * testing for equals method of Address and House
	 */
	public void testAddressHouseMethod() {
		/**
		 * test class Address: 23 Maple Street, Brookline
		 */
		Address a1 = new Address(23, "Maple Street", "Brookline");
		Address a2 = new Address(5, "Joye Road", "Newton");
		assertTrue(a1.equals(new Address(23, "Maple Street", "Brookline")));   // hai địa chỉ giống hệt nhau
		assertFalse(a1.equals(a2));
		/**
		 * test class House: Ranch, 7 rooms, $375,000, address a1
		 */
		House h1 = new House("Ranch", 7, 375000.0, a1);
		assertTrue(h1.equals(new House("Ranch", 7, 375000.0, a1)));
		assertFalse(h1.equals(new House("Cape", 6, 235000.0, a1)));
	}
	/**
	 * testing for equals method
	 */
	public void testEquals() {
		House h1 = new House("Ranch", 7, 375000.0, new Address(23, "Maple Street", "Brookline"));
		House h2 = new House("Colonial", 9, 450000.0, new Address(5, "Joye Road", "Newton"));
		House h3 = new House("Cape", 6, 235000.0, new Address(83, "Winslow Road", "Waltham"));
		IListEstate mt = new MTEstate();
		IListEstate l1 = new ConsEstate(h1, mt);
		IListEstate l2 = new ConsEstate(h2, l1);
		IListEstate l3 = new ConsEstate(h3, l2);
		IListEstate all = new ConsEstate(h3, new ConsEstate(h2, new ConsEstate(h1, new MTEstate())));
		assertTrue(mt.equals(new MTEstate()));     // rỗng so với rỗng (ca đã bắt lỗi instanceof ConsEstate)
		assertTrue(l1.equals(new ConsEstate(h1, new MTEstate())));
		assertTrue(l3.equals(all));
		assertFalse(mt.equals(l1));
		assertFalse(l1.equals(mt));
		assertFalse(l1.equals(l2));
		assertFalse(l2.equals(new ConsEstate(h1, new ConsEstate(h2, new MTEstate()))));
	}
}