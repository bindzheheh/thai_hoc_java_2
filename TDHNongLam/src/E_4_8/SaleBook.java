package E_4_8;
/**
 * This is a class Information about the Sale book
 *@author NguyenVanThai
 *ID:2611130213
 */
public class SaleBook extends ABook {
	/**
	 * constructor
	 * @param title
	 * @param nameAuthor
	 * @param price
	 * @param publishYear
	 */
	public SaleBook(String title, String nameAuthor, double price, int publishYear) {
		super(title, nameAuthor, price, publishYear);
	}
	/**
	 * Compute the sale price of this sale book (50% off)
	 * @return salePrice--(double)
	 * Example:
	 * SaleBook s1 = new SaleBook("A Little Java", "Friedman", 40.0, 1998);
	 * s1.salePrice() => 20.0
	 */
	@Override
	public double salePrice() {
		return this.price * (1 - 0.5);   
	}
}