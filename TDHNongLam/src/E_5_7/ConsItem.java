package E_5_7;
/**
 * This is a class Information about the shopping list that has at least one item
 *@author NguyenVanThai
 *ID:2611130213
 */
public class ConsItem implements IListItem {
	/**
	 * properties
	 */
	private AItem first;
	private IListItem rest;
	/**
	 * constructor
	 * @param first
	 * @param rest
	 */
	public ConsItem(AItem first, IListItem rest) {
		this.first = first;
		this.rest = rest;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof ConsItem))
			return false;
		else {
			ConsItem that = (ConsItem) obj;
			return this.first.equals(that.first) &&
					this.rest.equals(that.rest);
		}
	}
	/**
	 * Count the number of items in this list
	 * @return number--(int)
	 * Example:
	 * Coffee c1 = new Coffee("Highland", 500, 2500, true);
	 * Juice j1 = new Juice("Vinamilk", 1000, 12000, "orange", "bottled");
	 * IListItem l1 = new ConsItem(c1, new MTItem());
	 * IListItem l2 = new ConsItem(j1, l1);
	 * l1.howMany() => 1
	 * l2.howMany() => 2
	 */
	@Override
	public int howMany() {
		return 1 + this.rest.howMany();
	}
	/**
	 * Produce the list of all brand names in this list, in the same order
	 * @return brands--(ILoString)
	 * Example:
	 * Coffee c1 = new Coffee("Highland", 500, 2500, true);
	 * Juice j1 = new Juice("Vinamilk", 1000, 12000, "orange", "bottled");
	 * IListItem l2 = new ConsItem(j1, new ConsItem(c1, new MTItem()));
	 * l2.brandList() => new ConsString("Vinamilk", new ConsString("Highland", new MTString()))
	 */
	@Override
	public ILoString brandList() {
		return new ConsString(this.first.getBrand(), this.rest.brandList());  
	}
	/**
	 * Find the highest unit price (price per gram) among all items in this list
	 * @return highestUnitPrice--(double)
	 * Example:
	 * Coffee c1 = new Coffee("Highland", 500, 2500, true);
	 * Juice j1 = new Juice("Vinamilk", 1000, 12000, "orange", "bottled");
	 * IListItem l1 = new ConsItem(c1, new MTItem());
	 * IListItem l2 = new ConsItem(j1, l1);
	 * l1.highestPrice() => 5.0
	 * l2.highestPrice() => 12.0
	 */
	@Override
	public double highestPrice() {
		// TODO Auto-generated method stub
		return Math.max(this.first.highPrice(), this.rest.highestPrice());
	}
}