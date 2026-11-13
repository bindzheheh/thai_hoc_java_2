package E_4_3;
/**
* This is a abstract class Information about the Vehicles 
*@author NguyenVanThai
*ID:2611130213
*/
public abstract class AVehicle implements IVehicleCollection {
	/**
	 * properties
	 */
	protected String nameBrand;
	protected int numOfSeat;
	/**
	 * constructor
	 * @param nameBrand
	 * @param numOfSeat
	 */
	public AVehicle(String nameBrand, int numOfSeat) {
		this.nameBrand = nameBrand;
		this.numOfSeat = numOfSeat;
	}
	

}
