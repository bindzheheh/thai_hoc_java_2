package E_4_3;
/**
* This is a  class Information about the Limo car 
*@author NguyenVanThai
*ID:2611130213
*/
public class Limo extends AVehicle{
	/**
	 * properties
	 */
	private String color;
	private String status;
	/**
	 * constructor
	 * @param nameBrand
	 * @param numOfSeat
	 * @param color
	 * @param status
	 */
	public Limo(String nameBrand, int numOfSeat, String color, String status) {
		super(nameBrand, numOfSeat);
		this.color = color;
		this.status = status;
	}
	

}
