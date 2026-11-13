package E_4_3;
/**
* This is a  class Information about the subway
*@author NguyenVanThai
*ID:2611130213
*/
public class Subway extends AVehicle{
	/**
	 * properties
	 */
	private Time departure;
	private Time arrival;
	/**
	 * constructor
	 * @param nameBrand
	 * @param numOfSeat
	 * @param departure
	 * @param arrival
	 */
	public Subway(String nameBrand, int numOfSeat, Time departure, Time arrival) {
		super(nameBrand, numOfSeat);
		this.departure = departure;
		this.arrival = arrival;
	}
	

}
