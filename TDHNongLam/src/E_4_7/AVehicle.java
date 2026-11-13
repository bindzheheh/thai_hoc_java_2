package E_4_7;
/**
 * This is an abstract class Information about the common part of the vehicles
 *@author NguyenVanThai
 *ID:2611130213
 */
public abstract class AVehicle implements IVehicleCollection {
	/**
	 * properties
	 */
	protected int idNum;
	protected int passengers;
	protected int pricePerMile;
	/**
	 * constructor
	 * @param idNum
	 * @param passengers
	 * @param pricePerMile
	 */
	public AVehicle(int idNum, int passengers, int pricePerMile) {
		this.idNum = idNum;
		this.passengers = passengers;
		this.pricePerMile = pricePerMile;
	}
	/**
	 * Compute the fare for the given number of miles (each subclass defines it)
	 * @param numberOfMiles
	 * @return fare--(double)
	 */
	public abstract double fare(double numberOfMiles);
	/**
	 * Check whether the fare for the given number of miles is lower than the given amount
	 * @param numberOfMiles
	 * @param amount
	 * @return isLower--(boolean)
	 * Example:
	 * Car c1 = new Car(1, 2, 3);
	 * c1.lowerPrice(10, 40.0) => true
	 * c1.lowerPrice(10, 30.0) => false
	 */
	public boolean lowerPrice(double numberOfMiles, double amount) {
		return this.fare(numberOfMiles) < amount;  
	}
	/**
	 * Check whether the fare of this vehicle is lower than the fare of the other vehicle for the same number of miles
	 * @param numberOfMiles
	 * @param other
	 * @return isCheaper--(boolean)
	 * Example:
	 * Car c1 = new Car(1, 2, 3);
	 * Van v1 = new Van(3, 4, 2, true);
	 * c1.cheaperThan(10, v1) => false
	 * v1.cheaperThan(10, c1) => true
	 */
	public boolean cheaperThan(double numberOfMiles, AVehicle other) {
		return this.fare(numberOfMiles) < other.fare(numberOfMiles);   
	}
}