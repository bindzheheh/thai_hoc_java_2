package E_3_4;
/**
* This is a class  Information about the info route of train
*@author NguyenVanThai
*ID:2611130213
*/
public class Route {
	/**
	 * properties
	 */
	private String origin;
	private String destination;
	/**
	 * constructor
	 */
	public Route(String origin,String destination) {
		this.origin=origin;
		this.destination=destination;
	}
	/**
	 * method 
	 */
	/**
	 * checks whether the given station is the destination of this route
	 * @param sDes the station name to compare (case-sensitive)
	 * @return sameDestination--(boolean)
	 * Example:
	 * Route r1 = new Route("HaNoi", "HaiPhong");
	 * r1.sameDestination("HaiPhong") => true
	 * r1.sameDestination("Hue") => false
	 */
	public boolean sameDestination(String sDes) {
		return this.destination.equals(sDes);
		
	}

}
