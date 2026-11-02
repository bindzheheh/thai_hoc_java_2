package E_3_3;
/**
* This is a class  Information about the info temperature 
*@author NguyenVanThai
*ID:2611130213
*/
public class TemperatureRange {
	/**
	 * properties
	 */
	private int low;
	private int high;
	/**
	 * constructor
	 * @param low
	 * @param high
	 */
	public TemperatureRange(int low,int high) {
		this.low=low;
		this.high=high;
	}
	/**
	 * method
	 */
	/**
	 * determines whether this temperature range lies within another range
	 * @param that 
	 * @return within--(boolean)
	 * Example:
	 * TemperatureRange t1 = new TemperatureRange(50, 70);
	 * TemperatureRange t2 = new TemperatureRange(45, 75);
	 * t1.within(t2) => true
	 * t2.within(t1) => false
	 * new TemperatureRange(50, 80).within(t2) => false   (high 80 > 75)
	 */
	public boolean within(TemperatureRange that) {
		return (this.low>=that.low)&&
				(this.high<=that.high);
	}

}
