package E_4_8;
/**
 * This is an interface Information about the discount bookstore
 *@author NguyenVanThai
 *ID:2611130213
 */
public interface IBookStore {
	/**
	 * Compute the sale price of this book
	 * @return salePrice--(double)
	 */
	public double salePrice();
	/**
	 * Check whether this book is cheaper than the other book (compare sale prices)
	 * @param other
	 * @return isCheaper--(boolean)
	 */
	public boolean cheaperThan(ABook other);
	/**
	 * Check whether this book was written by the same author as the other book
	 * @param other
	 * @return isSame--(boolean)
	 */
	public boolean sameAuthor(ABook other);
}