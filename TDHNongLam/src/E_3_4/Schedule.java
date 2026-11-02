package E_3_4;
/**
* This is a class  Information about the info schedule of train
*@author NguyenVanThai
*ID:2611130213
*/
public class Schedule {
	/**
	 * properties
	 */
	private ClockTime departure;
	private ClockTime arrival;
	/**
	 * constructor
	 */
	public Schedule(ClockTime departure, ClockTime arrival) {
		this.departure=departure;
		this.arrival=arrival;
	}
	/**
	 * method
	 */
	/**
	 * 
	 * @return
	 */
	public ClockTime startTime() {      
		return this.departure;         
	}
	/**
	 * 
	 * @return
	 */
	public int duration() {
		return this.arrival.conversion()-this.departure.conversion();
	}
	/**
	 * 
	 * @return
	 */
	public ClockTime conversion() {
		int hour;
		int  minute;
		hour=this.duration()/60;
		minute=this.duration()%60;
		return new ClockTime(hour,minute);
		
	}

}
