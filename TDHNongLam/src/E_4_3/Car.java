package E_4_3;
/**
* This is a  class Information about the car
*@author NguyenVanThai
*ID:2611130213
*/
public class Car extends AVehicle{
	/**
	 * properties
	 */
	private String type;
	private String status;
	/**
	 * constructor
	 * @param nameBrand
	 * @param numOfSeat
	 * @param type
	 * @param status
	 */
	public Car(String nameBrand, int numOfSeat, String type, String status) {
		super(nameBrand, numOfSeat);
		this.type = type;
		this.status = status;
	}
	

}
