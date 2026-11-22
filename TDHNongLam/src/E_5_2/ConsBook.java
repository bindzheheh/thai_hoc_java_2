package E_5_2;
/**
 * This is a class Information about the list of books that has at least one book
 *@author NguyenVanThai
 *ID:2611130213
 */
public class ConsBook implements IListBookStore {
	/**
	 * properties
	 */
	private BookInfo first;
	private IListBookStore rest;
	/**
	 * constructor
	 * @param first
	 * @param rest
	 */
	public ConsBook(BookInfo first, IListBookStore rest) {
		this.first = first;
		this.rest = rest;
	}
	/**
	 * Check whether the given object is a list with the same books in the same order
	 * @param obj
	 * @return isEqual--(boolean)
	 * Example:
	 * BookInfo b1 = new BookInfo("Robinson Crusoe", 15.5, 1719, "Daniel Defoe");
	 * BookInfo b2 = new BookInfo("Heart of Darkness", 12.8, 1902, "Joseph Conrad");
	 * IListBookStore l1 = new ConsBook(b1, new MTBook());
	 * l1.equals(new ConsBook(b1, new MTBook())) => true
	 * l1.equals(new ConsBook(b2, new MTBook())) => false
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof ConsBook))
			return false;
		else {
			ConsBook that = (ConsBook) obj;
			return this.first.equals(that.first) &&
					this.rest.equals(that.rest);
		}
	}
}