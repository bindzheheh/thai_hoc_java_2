package E_4_3;
/**
 * This is a test program about vehicle collection
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
		 * test class Bus: Toyota, 45 seats, price 1500000, status active
		 */
		IVehicleCollection bus1 = new Bus("Toyota", 45, 1500000, "active");
		new Bus("Hyundai", 29, 900000, "maintenance");
		IVehicleCollection limo1 = new Limo("Lincoln", 8, "black", "active");
		new Limo("Cadillac", 6, "white", "rented");
		IVehicleCollection car1 = new Car("Honda", 5, "sedan", "active");
		new Car("Mazda", 7, "SUV", "maintenance");
		Time departure = new Time(6, 30, 0);
		Time arrival = new Time(7, 15, 0);
		IVehicleCollection subway1 = new Subway("Metro Line 1", 800, departure, arrival);
		new Subway("Metro Line 2", 600, new Time(8, 0, 0), new Time(8, 45, 30));
	}
	/**
	 * testing for constructor of class Time
	 */
	public void testTimeConstructor() {
		/**
		 * test class Time: 6 hours 30 minutes 0 seconds
		 */
		new Time(6, 30, 0);
		new Time(23, 59, 59);
	}

}