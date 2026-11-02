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
	public boolean sameDestination(String sDes) {
		return this.destination.equals(sDes);
		
	}

}
