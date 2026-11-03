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
	 * This is the method that returns the departure time.
	 * @return startTime --(ClockTime)
	 * Example:
	 * ClockTime time1 = new ClockTime (6,0);
	 * ClockTime time2 = new ClockTime (11,0);
	 * Schedule s1 = new Schedule (time1,time2);
	 * s1.startTime() => (6.0)
	 * ClockTime time3 = new ClockTime (1,0);
	 * ClockTime time4 = new ClockTime (17,0);
	 * Schedule s2 = new Schedule (time3,time4);
	 * s2.startTime() => (1,0)
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
