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
	 * Is this a method for precisely determining the destination?
	 * @param Destination
	 * @return sameDestination --(boolean)
	 * Example:
	 * ClockTime time1 = new ClockTime (6,0);
	 * ClockTime time2 = new ClockTime (11,0);
	 * Schedule s1 = new Schedule (time1,time2);
	 * Route r1 = new Route ("HaNoi",HaiPhong");
	 * Train t1 = new train (s1,r1,true);
	 * t1.sameDestination("HaiPhong") => true
	 * t1.sameDestination("Hue") => false
	 * ClockTime time3 = new ClockTime (1,0);
	 * ClockTime time4 = new ClockTime (17,0);
	 * Schedule s2 = new Schedule (time3,time4);
	 * Route r2 = new Route ("Hue","BenTre");
	 * Train t2 = new Train(s2, r2, false);
	 * t2.sameDestination("HaiPhong") => false
	 * t2.sameDestination("Bentre") => true
	 */
	public boolean sameDestination(String Destination) {
		return this.route.sameDestination(Destination);
	}
	/**
	 * This is the method for determining the start time.
	 * @return startTime--(ClockTime)
	 * Example:
	 * ClockTime time1 = new ClockTime (6,0);
	 * ClockTime time2 = new ClockTime (11,0);
	 * Schedule s1 = new Schedule (time1,time2);
	 * Route r1 = new Route ("HaNoi",HaiPhong");
	 * Train t1 = new train (s1,r1,true);
	 * t1.startTime() => (6,0)
	 * ClockTime time3 = new ClockTime (13,0);
	 * ClockTime time4 = new ClockTime (17,0);
	 * Schedule s2 = new Schedule (time3,time4);
	 * Route r2 = new Route ("Hue","BenTre");
	 * Train t2 = new Train(s2, r2, false);
	 * t1.startTime() => (13,0)
	 * 
	 */
	public ClockTime startTime() {
		return this.schedule.startTime();
	}
	/**
	 * This is the method for calculating travel time.
	 * @return duration --(ClockTime)
	 * Example:
	 * ClockTime time1 = new ClockTime (6,0);
	 * ClockTime time2 = new ClockTime (11,0);
	 * Schedule s1 = new Schedule (time1,time2);
	 * Route r1 = new Route ("HaNoi",HaiPhong");
	 * Train t1 = new train (s1,r1,true);
	 * t1.duration() => (5,0)
	 * ClockTime time3 = new ClockTime (13,0);
	 * ClockTime time4 = new ClockTime (17,0);
	 * Schedule s2 = new Schedule (time3,time4);
	 * Route r2 = new Route ("Hue","BenTre");
	 * Train t2 = new Train(s2, r2, false);
	 * t1.duration() => (4,0)
	 */
	public ClockTime duration() {
		return this.schedule.conversion();
	}
	
	
}
