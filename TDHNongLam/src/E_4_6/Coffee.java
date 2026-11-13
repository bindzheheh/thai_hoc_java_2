package E_4_6;
/**
 * This is a class Information about the Coffee
 *@author NguyenVanThai
 *ID:2611130213
 */
public class Coffee extends AItem {
	/**
	 * properties
	 */
	private boolean caffein;   // true: cà phê thường (có caffeine), false: decaffeinated
	/**
	 * constructor
	 * @param nameBrand
	 * @param weight
	 * @param price
	 * @param caffein
	 */
	public Coffee(String nameBrand, double weight, double price, boolean caffein) {
		super(nameBrand, weight, price);
		this.caffein = caffein;
	}
}