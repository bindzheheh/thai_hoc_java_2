package E_4_8;
/**
 * This is a class Information about the Hardcover book
 *@author NguyenVanThai
 *ID:2611130213
 */
public class HardcoverBook extends ABook {
	/**
	 * constructor
	 * @param title
	 * @param nameAuthor
	 * @param price
	 * @param publishYear
	 */
	public HardcoverBook(String title, String nameAuthor, double price, int publishYear) {
		super(title, nameAuthor, price, publishYear);
	}
	/**
	 * Compute the sale price of this hardcover book (20% off)
	 * @return salePrice--(double)
	 * Example:
	 * HardcoverBook h1 = new HardcoverBook("How to Design Programs", "Felleisen", 100.0, 2001);
	 * h1.salePrice() => 80.0
	 */
	@Override
	public double salePrice() {
		return this.price * (1 - 0.2);   
	}
}