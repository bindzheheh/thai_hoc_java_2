package E_4_6;
/**
 * This is a class Information about the Juice
 *@author NguyenVanThai
 *ID:2611130213
 */
public class Juice extends AItem {
	/**
	 * properties
	 */
	private String flavors;
	private String pack;   // frozen, fresh, bottled hoặc canned
	/**
	 * constructor
	 * @param nameBrand
	 * @param weight
	 * @param price
	 * @param flavors
	 * @param pack
	 */
	public Juice(String nameBrand, double weight, double price, String flavors, String pack) {
		super(nameBrand, weight, price);
		this.flavors = flavors;
		this.pack = pack;
	}
}