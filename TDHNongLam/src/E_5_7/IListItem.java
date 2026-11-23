package E_5_7;
/**
 * This is an interface Information about the shopping list
 *@author NguyenVanThai
 *ID:2611130213
 */
public interface IListItem {
	/**
	 * Count the number of items in this shopping list
	 * @return number--(int)
	 */
	public int howMany();
	/**
	 * Produce the list of all brand names in this shopping list, in the same order
	 * @return brands--(ILoString)
	 */
	public ILoString brandList();    // kiểu trả về là danh sách chuỗi
	/**
	 * Find the highest unit price (price per gram) among all items in this shopping list
	 * @return highestUnitPrice--(double)
	 */
	public double highestPrice();
}