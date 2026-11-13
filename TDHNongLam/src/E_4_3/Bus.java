package E_4_3;
/**
* This is a  class Information about the Bus
*@author NguyenVanThai
*ID:2611130213
*/
public class Bus extends AVehicle {
	/**
	 * properties
	 */
	private double price;
	private String status;
	/**
	 * constructor
	 * @param nameBrand
	 * @param numOfSeat
	 * @param price
	 * @param status
	 */
	public Bus(String nameBrand, int numOfSeat, double price, String status) {
		super(nameBrand, numOfSeat);
		this.price = price;
		this.status = status;
	}
	

}
