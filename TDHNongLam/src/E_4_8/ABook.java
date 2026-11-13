package E_4_8;
/**
 * This is an abstract class Information about the common part of the books
 *@author NguyenVanThai
 *ID:2611130213
 */
public abstract class ABook implements IBookStore {
	/**
	 * properties
	 */
	protected String title;
	protected String nameAuthor;
	protected double price;      // giá gốc
	protected int publishYear;
	/**
	 * constructor
	 * @param title
	 * @param nameAuthor
	 * @param price
	 * @param publishYear
	 */
	public ABook(String title, String nameAuthor, double price, int publishYear) {
		this.title = title;
		this.nameAuthor = nameAuthor;
		this.price = price;
		this.publishYear = publishYear;
	}
	/**
	 * Compute the sale price of this book (each subclass defines it)
	 * @return salePrice--(double)
	 */
	public abstract double salePrice();
	/**
	 * Check whether this book is cheaper than the other book (compare sale prices)
	 * @param other
	 * @return isCheaper--(boolean)
	 * Example:
	 * Paperback p1 = new Paperback("Java Basics", "Felleisen", 30.0, 2005);
	 * SaleBook s1 = new SaleBook("A Little Java", "Friedman", 40.0, 1998);
	 * s1.cheaperThan(p1) => true
	 * p1.cheaperThan(s1) => false
	 */
	public boolean cheaperThan(ABook other) {
		return this.salePrice() < other.salePrice();  
	}
	/**
	 * Check whether this book was written by the same author as the other book
	 * @param other
	 * @return isSame--(boolean)
	 * Example:
	 * Paperback p1 = new Paperback("Java Basics", "Felleisen", 30.0, 2005);
	 * HardcoverBook h1 = new HardcoverBook("How to Design Programs", "Felleisen", 100.0, 2001);
	 * p1.sameAuthor(h1) => true
	 * p1.sameAuthor(new SaleBook("A Little Java", "Friedman", 40.0, 1998)) => false
	 */
	public boolean sameAuthor(ABook other) {
		return this.nameAuthor.equals(other.nameAuthor);   
	}
}