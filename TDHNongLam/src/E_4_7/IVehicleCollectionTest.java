package E_4_7;
/**
 * This is a test program about vehicles collection
 *@author NguyenVanThai
 *ID:2611130213
 */
import junit.framework.TestCase;

public class IVehicleCollectionTest extends TestCase {
	/**
	 * testing for constructor
	 */
	public void testConstructor() {
		/**
		 * test class Car: id 1, 2 passengers, 3 dollars per mile
		 */
		IVehicleCollection car1 = new Car(1, 2, 3);
		new Car(4, 1, 5);
		IVehicleCollection limo1 = new Limo(2, 3, 5, 100);
		new Limo(5, 6, 8, 200);
		IVehicleCollection van1 = new Van(3, 4, 2, true);
		new Van(6, 8, 3, false);
	}
	/**
	 * testing method
	 */

	/**
	 * testing for fare method
	 */
	public void testFare() {
		Car c1 = new Car(1, 2, 3);
		Limo l1 = new Limo(2, 3, 5, 100);
		Van v1 = new Van(3, 4, 2, true);
		// Car: trả phí cố định mỗi dặm
		assertEquals(c1.fare(10), 30.0, 0.01);
		assertEquals(c1.fare(2.5), 7.5, 0.01);
		assertEquals(c1.fare(0), 0.0, 0.01);                      // biên: chưa đi dặm nào
		// Limo: ít nhất bằng phí thuê tối thiểu, còn lại trả theo dặm
		assertEquals(l1.fare(10), 100.0, 0.01);                  
		assertEquals(l1.fare(30), 150.0, 0.01);                 
		assertEquals(l1.fare(20), 100.0, 0.01);                   
		assertEquals(l1.fare(0), 100.0, 0.01);                   
		// Van: trả theo dặm cộng 1 đô mỗi hành khách
		assertEquals(v1.fare(10), 24.0, 0.01);                  
		assertEquals(v1.fare(0), 4.0, 0.01);                      
	}
	/**
	 * testing for lowerPrice method
	 */
	public void testLowerPrice() {
		Car c1 = new Car(1, 2, 3);                                // fare(10) = 30.0
		Limo l1 = new Limo(2, 3, 5, 100);                     
		Van v1 = new Van(3, 4, 2, true);                         
		assertTrue(c1.lowerPrice(10, 40.0));
		assertFalse(c1.lowerPrice(10, 20.0));
		assertFalse(c1.lowerPrice(10, 30.0));                    
		assertFalse(l1.lowerPrice(10, 100.0));                    
		assertTrue(l1.lowerPrice(10, 101.0));
		assertTrue(v1.lowerPrice(10, 25.0));
		assertFalse(v1.lowerPrice(10, 24.0));                  
	}
	/**
	 * testing for cheaperThan method
	 */
	public void testCheaperThan() {
		Car c1 = new Car(1, 2, 3);                               
		Limo l1 = new Limo(2, 3, 5, 100);                        
		Van v1 = new Van(3, 4, 2, true);                          
		Car c2 = new Car(4, 1, 5);                              
		assertFalse(c1.cheaperThan(10, v1));                      // 30 không rẻ hơn 24
		assertTrue(v1.cheaperThan(10, c1));
		assertTrue(c1.cheaperThan(10, l1));
		assertFalse(l1.cheaperThan(10, c1));
		assertTrue(v1.cheaperThan(10, l1));
		assertFalse(l1.cheaperThan(20, c2));                     
		assertFalse(c2.cheaperThan(20, l1));
		assertTrue(v1.cheaperThan(100, c1));                      
	}

}