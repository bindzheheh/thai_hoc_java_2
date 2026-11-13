package E_4_7;
/**
 * This is a class Information about the Van
 *@author NguyenVanThai
 *ID:2611130213
 */
public class Van extends AVehicle {
	/**
	 * properties
	 */
	private boolean access;
	/**
	 * constructor
	 * @param idNum
	 * @param passengers
	 * @param pricePerMile
	 * @param access
	 */
	public Van(int idNum, int passengers, int pricePerMile, boolean access) {
		super(idNum, passengers, pricePerMile);
		this.access = access;
	}
	/**
	 * Compute the fare of this van: pay by the mile, plus $1.00 for each passenger
	 * @param numberOfMiles
	 * @return fare--(double)
	 * Example:
	 * Van v1 = new Van(3, 4, 2, true);
	 * v1.fare(10) => 24.0
	 */
	@Override
	public double fare(double numberOfMiles) {
		return this.pricePerMile * numberOfMiles + this.passengers;   
	}
}