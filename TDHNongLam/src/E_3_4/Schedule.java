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
	private Date departure1;
	private Date arrival1;
	/**
	 * constructor
	 */
	public Schedule(ClockTime departure, ClockTime arrival,Date departure1,Date arrival1) {
		this.departure=departure;
		this.arrival=arrival;
		this.departure1=departure1;
		this.arrival1=arrival1;
	}
	/**
	 * method
	 */
	/**
	 * returns the departure time
	 * @return startTime--(ClockTime)
	 * Example:
	 * Schedule s1 = new Schedule(new ClockTime(6, 0), new ClockTime(11, 0), new Date(3, 11, 2026), new Date(3, 11, 2026));
	 * s1.startTime() => ClockTime(6, 0)
	 */
	public ClockTime startTime() {      
		return this.departure;         
	}
	/**
	 * counts the number of days between departure date and arrival date
	 * (assumes every month has 30 days)
	 * @return durationDay--(int)
	 * Example:
	 * Schedule s2 = new Schedule(new ClockTime(22, 0), new ClockTime(1, 0), new Date(23, 10, 2008), new Date(24, 10, 2008));
	 * s2.durationDay() => 1
	 */

	public int durationDay() {
		return this.departure1.conversionday(this.arrival1);   
	}
	/**
	 * calculates the trip time in minutes
	 * @return duration--(int)
	 * Example:
	 * Schedule s1 = new Schedule(new ClockTime(6, 0), new ClockTime(11, 0), new Date(3, 11, 2026), new Date(3, 11, 2026));
	 * Schedule s2 = new Schedule(new ClockTime(22, 0), new ClockTime(1, 0), new Date(23, 10, 2008), new Date(24, 10, 2008));
	 * s1.duration() => 300
	 * s2.duration() => 180   (60 - 1320 + 1440)
	 */
	public int duration() {
		int total;
		total = this.arrival.conversion() - this.departure.conversion() + 1440 * this.durationDay();
		return total;
		
	}
	/**
	 * converts the trip time from minutes to hours and minutes
	 * @return conversion--(ClockTime)
	 * Example:
	 * (with s1 and s2 as above)
	 * s1.conversion() => ClockTime(5, 0)
	 * s2.conversion() => ClockTime(3, 0)
	 */
	public ClockTime conversion() {
		int hour;
		int  minute;
		hour=this.duration()/60;
		minute=this.duration()%60;
		return new ClockTime(hour,minute);
		
	}

}
