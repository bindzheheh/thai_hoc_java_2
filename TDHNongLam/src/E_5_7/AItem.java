package E_5_7;
/**
 * This is an abstract class Information about the common part of the items
 *@author NguyenVanThai
 *ID:2611130213
 */
public abstract class AItem {
	/**
	 * properties
	 */
	protected String nameBrand;
	protected double weigth;     // đơn vị gram
	protected double price;
	/**
	 * constructor
	 * @param nameBrand
	 * @param weigth
	 * @param price
	 */
	public AItem(String nameBrand, double weigth, double price) {
		this.nameBrand = nameBrand;
		this.weigth = weigth;
		this.price = price;
	}
	/**
	 * Get the brand name of this item
	 * @return brand--(String)
	 * Example:
	 * Coffee c1 = new Coffee("Highland", 500, 2500, true);
	 * c1.getBrand() => "Highland"
	 */
	public String getBrand() {
		return this.nameBrand;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof AItem))
			return false;
		else {
			AItem that = (AItem) obj;
			return this.nameBrand.equals(that.nameBrand) &&
					this.weigth == that.weigth &&
					this.price == that.price;
		}
	}
	/**
	 * Compute the unit price (price per gram) of this item
	 * @return unitPrice--(double)
	 * Example:
	 * Coffee c1 = new Coffee("Highland", 500, 2500, true);
	 * Juice j1 = new Juice("Vinamilk", 1000, 12000, "orange", "bottled");
	 * c1.highPrice() => 5.0
	 * j1.highPrice() => 12.0
	 */
	public double highPrice() {
		// TODO Auto-generated method stub
		return this.price/this.weigth;
	}
}   