package E_4_6;
/**
 * This is an abstract class Information about the common part of the items
 *@author NguyenVanThai
 *ID:2611130213
 */
public abstract class AItem implements IStore {
	/**
	 * properties
	 */
	private String nameBrand;
	private double weight;   // đơn vị gram
	private double price;    
	/**
	 * constructor
	 * @param nameBrand
	 * @param weight
	 * @param price
	 */
	public AItem(String nameBrand, double weight, double price) {
		this.nameBrand = nameBrand;
		this.weight = weight;
		this.price = price;
	}
	/**
	 * Compute the unit price (cents per gram) of this item
	 * @return unitPrice--(double)
	 * Example:
	 * Coffee c1 = new Coffee("Highland", 500, 2500, true);
	 * c1.unitPrice() => 5.0
	 */
	public double unitPrice() {
		return this.price / this.weight;  
	}
	/**
	 * Check whether the unit price of this item is lower than the given amount
	 * @return isLower--(boolean)
	 * Example:
	 * Coffee c1 = new Coffee("Highland", 500, 2500, true);
	 * c1.lowerPrice(6.0) => true
	 * c1.lowerPrice(5.0) => false
	 */
	public boolean lowerPrice(double priceOther) {
		return this.unitPrice() < priceOther;  
	}
	/**
	 * Check whether this item is cheaper than the other item in terms of unit price
	 * @return isCheaper--(boolean)
	 * Example:
	 * Coffee c1 = new Coffee("Highland", 500, 2500, true);
	 * Juice j1 = new Juice("Vinamilk", 1000, 12000, "orange", "bottled");
	 * c1.cheaperThan(j1) => true
	 * j1.cheaperThan(c1) => false
	 */
	public boolean cheaperThan(AItem other) {
		return this.unitPrice() < other.unitPrice();  
	}
}