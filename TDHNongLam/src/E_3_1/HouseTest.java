package E_3_1;
/**
 * This is a test program about House
 *@author NguyenVanThai
 *ID:2611130213
 */
import junit.framework.TestCase;

public class HouseTest extends TestCase {
	/**
	 * test constructor
	 */
	public void testHouseConstructer() {
		new House("Ranch", 7, 375000,new Address("23", "Mapple Street", "Brooklyn"));
	}
	public void testAddressConstructer() {
		new Address("23", "Mapple Street", "Brooklyn");
	}
	/**
	 * test method
	 */
	/**
	 * test method of Address
	 */
	/**
	 *testing inThisCity
	 */
	public void testAddressMethod() {
		
		Address ad1 = new Address("23", "Mapple Street", "Brooklyn");
		Address ad2 = new Address("5", "Jove Road", "Newton");
		Address ad3 = new Address("83", "Winslow Road", "Brooklyn");
		assertTrue(ad1.inThisCity("Brooklyn"));
		assertFalse(ad3.inThisCity("Newton"));
		assertTrue(ad2.inThisCity("Newton"));
		
	}
	/**
	 * testing sameCity
	 */
	public void testAddressMethod1() {
		
		Address ad1 = new Address("23", "Mapple Street", "Brooklyn");
		Address ad2 = new Address("5", "Jove Road", "Newton");
		Address ad3 = new Address("83", "Winslow Road", "Brooklyn");
	
		assertTrue(ad1.sameCity(ad3));
		assertFalse(ad1.sameCity(ad2));
	}
	/**
	 * test method of House
	 */
	/**
	 * testing hasMoreRooms
	 */
	public void testHouseMethodHasMoreRooms() {
		
		 House house1 = new House("Ranch", 7, 375000,new Address("23", "Mapple Street", "Brooklyn"));
		 House house2 = new House("Colonial", 9, 450000.0,new Address("5", "Jove Road", "Newton"));
		 House house3 = new House("Cape", 6, 235000.0,new Address("83", "Winslow Road", "Brooklyn"));
		 assertFalse(house1.hasMoreRooms(house2));
		 assertTrue(house2.hasMoreRooms(house3));
	}
	 /**
	  * inThisCity
	  */
	public void testHouseMethodInThisCity() {
		
		 House house1 = new House("Ranch", 7, 375000,new Address("23", "Mapple Street", "Brooklyn"));
		 House house2 = new House("Colonial", 9, 450000.0,new Address("5", "Jove Road", "Newton"));
		 House house3 = new House("Cape", 6, 235000.0,new Address("83", "Winslow Road", "Brooklyn"));
		 assertTrue(house1.inThisCity("Brooklyn"));
		 assertFalse(house3.inThisCity("Newton"));
		 assertTrue(house2.inThisCity("Newton"));
	}
	 /**
	  * sameCity
	  */
	public void testHouseMethodSameCity() {
		
		 House house1 = new House("Ranch", 7, 375000,new Address("23", "Mapple Street", "Brooklyn"));
		 House house2 = new House("Colonial", 9, 450000.0,new Address("5", "Jove Road", "Newton"));
		 House house3 = new House("Cape", 6, 235000.0,new Address("83", "Winslow Road", "Brooklyn"));
		 assertTrue(house1.sameCity(house3));
		 assertFalse(house1.sameCity(house2));
	}

}
