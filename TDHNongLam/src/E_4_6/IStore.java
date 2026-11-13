package E_4_6;
/**
 * This is an interface Information about the grocery store items
 *@author NguyenVanThai
 *ID:2611130213
 */
public interface IStore {
	/**
	 * Compute the unit price (cents per gram) of this item
	 * @return unitPrice--(double)
	 */
	public double unitPrice();
	/**
	 * Check whether the unit price of this item is lower than the given amount
	 * @return isLower--(boolean)
	 */
	public boolean lowerPrice(double priceOther);
	/**
	 * Check whether this item is cheaper than the other item in terms of unit price
	 * @return isCheaper--(boolean)
	 */
	public boolean cheaperThan(AItem other);
}