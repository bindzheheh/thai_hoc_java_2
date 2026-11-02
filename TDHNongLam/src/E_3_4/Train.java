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
	public boolean sameDestination(String Destination) {
		return this.route.sameDestination(Destination);
	}
	public ClockTime startTime() {
		return this.schedule.startTime();
	}
	public ClockTime duration() {
		return this.schedule.conversion();
	}
}
