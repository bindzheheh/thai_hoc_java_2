package E_3_3;
/**
* This is a class  Information about the info weather
*@author NguyenVanThai
*ID:2611130213
*/
public class WeatherRecord {
	/**
	 * properties
	 */
	private Date date;
	private TemperatureRange today;
	private TemperatureRange normal;
	private TemperatureRange record;
	private double precipitation;
	/**
	 * constructor
	 */
	public WeatherRecord(Date date,
			TemperatureRange today,
			TemperatureRange normal,
			TemperatureRange record,
			double precipitation) {
		this.date=date;
		this.today=today;
		this.normal=normal;
		this.record=record;
		this.precipitation=precipitation;
	}
	/**
	 * method
	 */
	/**
	 * determines whether today's high and low were within the normal range
	 * @return withinRange--(boolean)
	 * Example:
	 * WeatherRecord w1 = new WeatherRecord(new Date(5, 6, 2003), new TemperatureRange(50, 70), new TemperatureRange(45, 75), new TemperatureRange(20, 100), 0.5);
	 * WeatherRecord w2 = new WeatherRecord(new Date(6, 6, 2003), new TemperatureRange(30, 110), new TemperatureRange(45, 75), new TemperatureRange(20, 100), 0.0);
	 * w1.withinRange() => true
	 * w2.withinRange() => false
	 */

	public boolean withinRange() {
		return this.today.within(this.normal);
		
	}
	/**
	 * determines whether the precipitation is higher than some given value
	 * @param thatPrecipitation the value to compare with
	 * @return rainyDay--(boolean)
	 * Example:
	 * WeatherRecord w1 = new WeatherRecord(new Date(5, 6, 2003), new TemperatureRange(50, 70), new TemperatureRange(45, 75), new TemperatureRange(20, 100), 0.5);
	 * WeatherRecord w3 = new WeatherRecord(new Date(7, 6, 2003), new TemperatureRange(10, 90), new TemperatureRange(45, 75), new TemperatureRange(20, 100), 2.0);
	 * w1.rainyDay(1.0) => false
	 * w3.rainyDay(1.0) => true
	 */
	public boolean rainyDay(double thatPrecipitation) {
		return this.precipitation >= thatPrecipitation;
		}
	/**
	 * determines whether the temperature today broke either the high or the low record
	 * @return recordDay--(boolean)
	 * Example:
	 * WeatherRecord w1 = new WeatherRecord(new Date(5, 6, 2003), new TemperatureRange(50, 70), new TemperatureRange(45, 75), new TemperatureRange(20, 100), 0.5);
	 * WeatherRecord w2 = new WeatherRecord(new Date(6, 6, 2003), new TemperatureRange(30, 110), new TemperatureRange(45, 75), new TemperatureRange(20, 100), 0.0);
	 * WeatherRecord w3 = new WeatherRecord(new Date(7, 6, 2003), new TemperatureRange(10, 90), new TemperatureRange(45, 75), new TemperatureRange(20, 100), 2.0);
	 * w1.recordDay() => false
	 * w2.recordDay() => true   (high 110 > record high 100)
	 * w3.recordDay() => true   (low 10 < record low 20)
	 */
	public boolean recordDay() {
		return !this.today.within(this.record);
		}

}
