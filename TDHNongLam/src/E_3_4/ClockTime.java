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
	 * checks whether two clock times have the same hour and minute
	 * @param obj the object to compare
	 * @return equals--(boolean)
	 * Example:
	 * new ClockTime(6, 0).equals(new ClockTime(6, 0)) => true
	 * new ClockTime(6, 0).equals(new ClockTime(6, 30)) => false
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
