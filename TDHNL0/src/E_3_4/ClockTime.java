package E_3_4;
/**
* This is a class  Information about the info time of schedule
*@author NguyenVanThai
*ID:2611130213
*/
public class ClockTime {
	/**
	 * properties
	 */
	private int hour;
	private int minute;
	/**
	 * constructor
	 */
	public ClockTime(int hour,int minute) {
		this.hour=hour;
		this.minute=minute;
	}
	/**
	 * method
	 */
	/**
	 * This is the method for calculating the total number of minutes.
	 * @return conversion ---(int)
	 * Example:
	 * ClockTime t1 = new ClockTime (6,0)
	 * t1.conversion() =>360
	 * ClockTime t2 = new ClockTime (11,0);
	 * t2.conversion() =>660
	 */
	public int conversion() {
		return this.hour*60+this.minute;
	}
	/**
	 * override
	 */
	public boolean equals(Object obj) {
		if ((null == obj) || !(obj instanceof ClockTime))
			return false;
		else {ClockTime that = (ClockTime) obj;
		return (this.hour==that.hour&&
				this.minute==that.minute);
		}
	}
}
