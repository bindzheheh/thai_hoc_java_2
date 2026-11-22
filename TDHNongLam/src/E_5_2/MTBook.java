package E_5_2;
/**
 * This is a class Information about the empty list of books
 *@author NguyenVanThai
 *ID:2611130213
 */
public class MTBook implements IListBookStore {
	/**
	 * Check whether the given object is also an empty list of books
	 * @param obj
	 * @return isEqual--(boolean)
	 * Example:
	 * IListBookStore mt = new MTBook();
	 * BookInfo b1 = new BookInfo("Robinson Crusoe", 15.5, 1719, "Daniel Defoe");
	 * mt.equals(new MTBook()) => true
	 * mt.equals(new ConsBook(b1, mt)) => false
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof MTBook))
			return false;
		else {
			return true;
		}
	}
}