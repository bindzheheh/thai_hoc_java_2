package E_5_7;
/**
 * This is a class Information about the empty shopping list
 *@author NguyenVanThai
 *ID:2611130213
 */
public class MTItem implements IListItem {
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof MTItem))
			return false;
		else {
			return true;
		}
	}
	/**
	 * Count the number of items in this empty list
	 * @return number--(int)
	 * Example:
	 * IListItem mt = new MTItem();
	 * mt.howMany() => 0
	 */
	@Override
	public int howMany() {
		return 0;
	}
	/**
	 * Produce the list of brand names of this empty list (there is none)
	 * @return brands--(ILoString)
	 * Example:
	 * IListItem mt = new MTItem();
	 * mt.brandList() => new MTString()
	 */
	@Override
	public ILoString brandList() {
		return new MTString();
	}
	/**
	 * Find the highest unit price of this empty list (there is no item, so 0)
	 * @return highestUnitPrice--(double)
	 * Example:
	 * IListItem mt = new MTItem();
	 * mt.highestPrice() => 0.0
	 */
	@Override
	public double highestPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
}