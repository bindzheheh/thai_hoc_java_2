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
	public int conversion() {
		return this.hour*60+this.minute;
	}

}
