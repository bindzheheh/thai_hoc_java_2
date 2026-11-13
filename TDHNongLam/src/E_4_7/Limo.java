package E_4_7;
/**
 * This is a class Information about the Limo
 *@author NguyenVanThai
 *ID:2611130213
 */
public class Limo extends AVehicle {
	/**
	 * properties
	 */
	private int minRental;
	/**
	 * constructor
	 * @param idNum
	 * @param passengers
	 * @param pricePerMile
	 * @param minRental
	 */
	public Limo(int idNum, int passengers, int pricePerMile, int minRental) {
		super(idNum, passengers, pricePerMile);
		this.minRental = minRental;
	}
	/**
	 * Compute the fare of this limo: at least the minimum rental fee, otherwise pay by the mile
	 * @param numberOfMiles
	 * @return fare--(double)
	 * Example:
	 * Limo l1 = new Limo(2, 3, 5, 100);
	 * l1.fare(10) => 100.0
	 * l1.fare(30) => 150.0
	 */
	@Override
	public double fare(double numberOfMiles) {
		if (this.pricePerMile * numberOfMiles < this.minRental) {
			return this.minRental;                      
		} else {
			return this.pricePerMile * numberOfMiles; 
		}
	}
}