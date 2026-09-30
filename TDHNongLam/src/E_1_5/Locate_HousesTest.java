package E_1_5;
/**
 * make by :nguyen van thai
	2611130213
	day la chuong trinh chay thu gom house and address
 */
import junit.framework.TestCase;

public class Locate_HousesTest extends TestCase {
	/**
	 *data  cau truc 
	 */
	public void testConstructor() {
		new Locate_Houses("Ranch", 7,375.000,new Address( "23 Maple Street", "Brookline"));
		/**
		 * kind:Ranch
		 * numberOfRooms:7
		 * price:375.000
		 * Street name:23 Maple Street
		 * city name:Brookline
		 */
		Address address1=new Address("5 Joye Road","Newton");
		new Locate_Houses("Colonial", 9,450.000,address1);
		new Locate_Houses("Cape", 6, 236.000,new Address( "83 Winslow Road", "Waltham"));
	}

}
