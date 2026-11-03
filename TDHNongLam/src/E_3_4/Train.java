package E_3_4;
/**
* This is a class  Information about the info train 
*@author NguyenVanThai
*ID:2611130213
*/
public class Train {
	/**
	 * properties
	 */
	private Schedule schedule;
	private Route route;
	private boolean local;
	/**
	 * constructor
	 */
	public Train(Schedule schedule,Route route,boolean local) {
		this.schedule=schedule;
		this.route=route;
		this.local=local;
	}
	/**
	 * method
	 */
	/**
	 * checks whether the given station is the destination of this train
	 * @param destination the station name to compare (case-sensitive)
	 * @return sameDestination--(boolean)
	 * Example:
	 * Schedule s1 = new Schedule(new ClockTime(6, 0), new ClockTime(11, 0), new Date(3, 11, 2026), new Date(3, 11, 2026));
	 * Train t1 = new Train(s1, new Route("HaNoi", "HaiPhong"), true);
	 * t1.sameDestination("HaiPhong") => true
	 * t1.sameDestination("Hue") => false
	 */
	public boolean sameDestination(String Destination) {
		return this.route.sameDestination(Destination);
	}
	/**
	 * returns the time this train departs
	 * @return startTime--(ClockTime)
	 * Example:
	 * Schedule s1 = new Schedule(new ClockTime(6, 0), new ClockTime(11, 0), new Date(3, 11, 2026), new Date(3, 11, 2026));
	 * Train t1 = new Train(s1, new Route("HaNoi", "HaiPhong"), true);
	 * t1.startTime() => ClockTime(6, 0)
	 */
	public ClockTime startTime() {
		return this.schedule.startTime();
	}
	/**
	 * calculates how long the trip takes (hours and minutes, may exceed 24 hours)
	 * @return duration--(ClockTime)
	 * Example:
	 * Schedule s1 = new Schedule(new ClockTime(6, 0), new ClockTime(11, 0), new Date(3, 11, 2026), new Date(3, 11, 2026));
	 * Schedule s2 = new Schedule(new ClockTime(22, 0), new ClockTime(1, 0), new Date(23, 10, 2008), new Date(24, 10, 2008));
	 * new Train(s1, new Route("HaNoi", "HaiPhong"), true).duration() => ClockTime(5, 0)
	 * new Train(s2, new Route("Hue", "BenTre"), false).duration() => ClockTime(3, 0)
	 */
	public ClockTime duration() {
		return this.schedule.conversion();
	}
	
	
}
