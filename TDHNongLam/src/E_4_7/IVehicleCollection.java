package E_4_7;
/**
 * This is an interface Information about the vehicles collection
 *@author NguyenVanThai
 *ID:2611130213
 */
public interface IVehicleCollection {
	/**
	 * Compute the fare for the given number of miles
	 * @param numberOfMiles
	 * @return fare--(double)
	 */
	public double fare(double numberOfMiles);
	/**
	 * Check whether the fare for the given number of miles is lower than the given amount
	 * @param numberOfMiles
	 * @param amount
	 * @return isLower--(boolean)
	 */
	public boolean lowerPrice(double numberOfMiles, double amount);
	/**
	 * Check whether the fare of this vehicle is lower than the fare of the other vehicle for the same number of miles
	 * @param numberOfMiles
	 * @param other
	 * @return isCheaper--(boolean)
	 */
	public boolean cheaperThan(double numberOfMiles, AVehicle other);
}