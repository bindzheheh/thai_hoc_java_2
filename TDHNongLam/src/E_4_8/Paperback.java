package E_4_8;
/**
 * This is a class Information about the Paperback book
 *@author NguyenVanThai
 *ID:2611130213
 */
public class Paperback extends ABook {
	/**
	 * constructor
	 * @param title
	 * @param nameAuthor
	 * @param price
	 * @param publishYear
	 */
	public Paperback(String title, String nameAuthor, double price, int publishYear) {
		super(title, nameAuthor, price, publishYear);
	}
	/**
	 * Compute the sale price of this paperback (sold at the list price)
	 * @return salePrice--(double)
	 * Example:
	 * Paperback p1 = new Paperback("Java Basics", "Felleisen", 30.0, 2005);
	 * p1.salePrice() => 30.0
	 */
	@Override
	public double salePrice() {
		return this.price;   
	}
}