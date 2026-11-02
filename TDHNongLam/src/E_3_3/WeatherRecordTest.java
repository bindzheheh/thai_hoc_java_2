package E_3_3;
/**
 * This is a test program about weather
 *@author NguyenVanThai
 *ID:2611130213
 */
import junit.framework.TestCase;

public class WeatherRecordTest extends TestCase {
	/**
	 * testing for constructor
	 */
	public void testConstructor() {
		new Date(5, 6, 2003);
		new TemperatureRange(50, 70);
		new WeatherRecord(new Date(5, 6, 2003), new TemperatureRange(50, 70), new TemperatureRange(45, 75), new TemperatureRange(20, 100), 0.5);
	}
	/**
	 * testing method
	 */
	/**
	 * testing for method of TemperatureRange 
	 */
	public void testTemperatureRangeMethod() {
		TemperatureRange t1 = new TemperatureRange(50, 70);
		TemperatureRange t2 = new TemperatureRange(45, 75);
		/**
		 * within
		 */
		assertTrue(t1.within(t2));                                    
		assertFalse(t2.within(t1));                                   
		assertFalse(new TemperatureRange(50, 80).within(t2));         // high 80 > 75
		assertFalse(new TemperatureRange(40, 70).within(t2));         // low 40 < 45
	}
	/**
	 * testing for withinRange method
	 */
	public void testWithinRange() {
		WeatherRecord w1 = new WeatherRecord(new Date(5, 6, 2003), new TemperatureRange(50, 70), new TemperatureRange(45, 75), new TemperatureRange(20, 100), 0.5);
		WeatherRecord w2 = new WeatherRecord(new Date(6, 6, 2003), new TemperatureRange(30, 110), new TemperatureRange(45, 75), new TemperatureRange(20, 100), 0.0);
		WeatherRecord w3 = new WeatherRecord(new Date(7, 6, 2003), new TemperatureRange(10, 90), new TemperatureRange(45, 75), new TemperatureRange(20, 100), 2.0);
		assertTrue(w1.withinRange());    
		assertFalse(w2.withinRange());   // 30 < 45
		assertFalse(w3.withinRange());  
	}
	/**
	 * testing for rainyDay method
	 */
	public void testRainyDay() {
		WeatherRecord w1 = new WeatherRecord(new Date(5, 6, 2003), new TemperatureRange(50, 70), new TemperatureRange(45, 75), new TemperatureRange(20, 100), 0.5);
		WeatherRecord w2 = new WeatherRecord(new Date(6, 6, 2003), new TemperatureRange(30, 110), new TemperatureRange(45, 75), new TemperatureRange(20, 100), 0.0);
		WeatherRecord w3 = new WeatherRecord(new Date(7, 6, 2003), new TemperatureRange(10, 90), new TemperatureRange(45, 75), new TemperatureRange(20, 100), 2.0);
		assertFalse(w1.rainyDay(1.0));   // 0.5 < 1.0
		assertFalse(w2.rainyDay(1.0));  
		assertTrue(w3.rainyDay(1.0));    
	}
	/**
	 * testing for recordDay method
	 */
	public void testRecordDay() {
		WeatherRecord w1 = new WeatherRecord(new Date(5, 6, 2003), new TemperatureRange(50, 70), new TemperatureRange(45, 75), new TemperatureRange(20, 100), 0.5);
		WeatherRecord w2 = new WeatherRecord(new Date(6, 6, 2003), new TemperatureRange(30, 110), new TemperatureRange(45, 75), new TemperatureRange(20, 100), 0.0);
		WeatherRecord w3 = new WeatherRecord(new Date(7, 6, 2003), new TemperatureRange(10, 90), new TemperatureRange(45, 75), new TemperatureRange(20, 100), 2.0);
		assertFalse(w1.recordDay());     // không phá
		assertTrue(w2.recordDay());      // high 110 > kỷ lục cao 100
		assertTrue(w3.recordDay());      
	}
	

}
