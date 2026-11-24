package E_5_8;
/**
 * This is an interface Information about the inventory of toys
 *@author NguyenVanThai
 *ID:2611130213
 */
public interface Inventory {
	/**
	 * Compute the total price of all toys in this inventory
	 * @return totalPrice--(double)
	 */
	public double totalPrice();
	/**
	 * Count the number of toys in this inventory
	 * @return number--(int)
	 */
	public int howMany();
	/**
	 * Compute the average price of toys in this inventory (each toy counts once)
	 * @return averagePrice--(double)
	 */
	public double averagePrice();
	/**
	 * Produce a new inventory in which every toy named "robot" is renamed "r2d2"
	 * @return newInventory--(Inventory)
	 */
	public Inventory replaceName();
	/**
	 * Produce a new inventory without the toys whose name matches the given name
	 * @param toyOfName
	 * @return newInventory--(Inventory)
	 */
	public Inventory eliminate(String toyOfName);
}
