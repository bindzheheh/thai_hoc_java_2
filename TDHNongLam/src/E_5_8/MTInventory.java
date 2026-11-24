package E_5_8;
/**
 * This is a class Information about the empty inventory
 *@author NguyenVanThai
 *ID:2611130213
 */
public class MTInventory implements Inventory {
	/**
	 * Check whether the given object is an empty inventory
	 * @param obj
	 * @return result--(boolean)
	 * Example:
	 * Inventory mt = new MTInventory();
	 * mt.equals(new MTInventory()) => true
	 * mt.equals(new ConsInventory(new Toy("doll", 17.95, 5), mt)) => false
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof MTInventory))
			return false;
		else
			return true;
	}
	/**
	 * Compute the total price of this empty inventory (there is no toy, so 0)
	 * @return totalPrice--(double)
	 * Example:
	 * Inventory mt = new MTInventory();
	 * mt.totalPrice() => 0.0
	 */
	@Override
	public double totalPrice() {
		return 0;
	}
	/**
	 * Count the number of toys in this empty inventory
	 * @return number--(int)
	 * Example:
	 * Inventory mt = new MTInventory();
	 * mt.howMany() => 0
	 */
	@Override
	public int howMany() {
		return 0;
	}
	/**
	 * Compute the average price of this empty inventory (there is no toy, so 0)
	 * @return averagePrice--(double)
	 * Example:
	 * Inventory mt = new MTInventory();
	 * mt.averagePrice() => 0.0
	 */
	@Override
	public double averagePrice() {
		return 0;
	}
	/**
	 * Produce a new empty inventory (there is no toy to rename)
	 * @return newInventory--(Inventory)
	 * Example:
	 * Inventory mt = new MTInventory();
	 * mt.replaceName() => new MTInventory()
	 */
	@Override
	public Inventory replaceName() {
		return new MTInventory();
	}
	/**
	 * Produce a new empty inventory (there is no toy to eliminate)
	 * @param toyOfName
	 * @return newInventory--(Inventory)
	 * Example:
	 * Inventory mt = new MTInventory();
	 * mt.eliminate("robot") => new MTInventory()
	 */
	@Override
	public Inventory eliminate(String toyOfName) {
		return new MTInventory();
	}
}
