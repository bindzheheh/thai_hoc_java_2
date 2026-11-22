package E_5_2;
/**
 * This is a class Information about a book
 *@author NguyenVanThai
 *ID:2611130213
 */
public class BookInfo {
	/**
	 * properties
	 */
	private String title;
	private double price;        // đơn vị: $
	private int publishYear;
	private String nameAuthor;
	/**
	 * constructor
	 * @param title
	 * @param price
	 * @param publishYear
	 * @param nameAuthor
	 */
	public BookInfo(String title, double price, int publishYear, String nameAuthor) {
		this.title = title;
		this.price = price;
		this.publishYear = publishYear;
		this.nameAuthor = nameAuthor;
	}
	/**
	 * Check whether the given object is a book with the same title, price, year and author
	 * @param obj
	 * @return isEqual--(boolean)
	 * Example:
	 * BookInfo b1 = new BookInfo("Robinson Crusoe", 15.5, 1719, "Daniel Defoe");
	 * b1.equals(new BookInfo("Robinson Crusoe", 15.5, 1719, "Daniel Defoe")) => true
	 * b1.equals(new BookInfo("Beach Music", 9.5, 1996, "Pat Conroy")) => false
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof BookInfo))
			return false;
		else {
			BookInfo that = (BookInfo) obj;
			return this.title.equals(that.title) &&
					this.price == that.price &&
					this.publishYear == that.publishYear &&
					this.nameAuthor.equals(that.nameAuthor);
		}
	}
}