package E_4_7;
/**
 * This is a class Information about the Car (cab)
 *@author NguyenVanThai
 *ID:2611130213
 */
public class Car extends AVehicle {
	/**
	 * constructor
	 * @param idNum
	 * @param passengers
	 * @param pricePerMile
	 */
	public Car(int idNum, int passengers, int pricePerMile) {
		super(idNum, passengers, pricePerMile);
	}
	/**
	 * Compute the fare of this car: a flat fee per mile
	 * @param numberOfMiles
	 * @return fare--(double)
	 * Example:
	 * Car c1 = new Car(1, 2, 3);
	 * c1.fare(10) => 30.0
	 */
	@Override
	public double fare(double numberOfMiles) {
		return this.pricePerMile * numberOfMiles;
	}
}