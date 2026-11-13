package E_4_6;
/**
 * This is a class Information about the Ice cream
 *@author NguyenVanThai
 *ID:2611130213
 */
public class IceCream extends AItem {
	/**
	 * properties
	 */
	private String flavors;
	private String kind;   // sorbet, frozen yogurt hoặc regular ice cream
	/**
	 * constructor
	 * @param nameBrand
	 * @param weight
	 * @param price
	 * @param flavors
	 * @param kind
	 */
	public IceCream(String nameBrand, double weight, double price, String flavors, String kind) {
		super(nameBrand, weight, price);
		this.flavors = flavors;
		this.kind = kind;
	}
}