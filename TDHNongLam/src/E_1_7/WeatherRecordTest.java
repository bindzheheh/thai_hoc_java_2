package E_1_7;
/**
 * make by :nguyen van thai
	2611130213
	chuong trinh kiem tra cho WeatherRecord
 */
import junit.framework.TestCase;

public class WeatherRecordTest extends TestCase {
	/**
	 *data  cau truc 
	 */
	public void testConstructor() {
		Date d1=new Date(23,10,2008);
		Date d2=new Date(1,1,2000);
		Date d3=new Date(1,10,2026);
		TemperatureRange t1 =new TemperatureRange(20,30);
		TemperatureRange t2 =new TemperatureRange(43,50);
		TemperatureRange t3 =new TemperatureRange(29,40);
		new WeatherRecord(new Date(15,3,2026),new TemperatureRange(22,31),new TemperatureRange(21,30),new TemperatureRange(17,36),0);
		/**
		 * 15/3/2026
		 * today:thap22 cao31
		 * normal;low21 high 30
		 * record:low 17 high 36
		 * luong mua:0
		 */
		new WeatherRecord(d1,t1,t1,t2,0.5);
		new WeatherRecord(d2,t1,t2,t3,1);
		new WeatherRecord(d3,t1,t3,t2,0.3);
	}

}
