package E_5_2;
/**
 * This is a test program about the list of books
 *@author NguyenVanThai
 *ID:2611130213
 */
import junit.framework.TestCase;

public class IListBookStoreTest extends TestCase {
	/**
	 * testing for constructor
	 */
	public void testConstructor() {
		/**
		 * test class BookInfo: Robinson Crusoe, $15.5, 1719, Daniel Defoe
		 */
		BookInfo b1 = new BookInfo("Robinson Crusoe", 15.5, 1719, "Daniel Defoe");
		new BookInfo("Heart of Darkness", 12.8, 1902, "Joseph Conrad");
		/**
		 * test class MTBook and ConsBook
		 */
		IListBookStore mt = new MTBook();
		IListBookStore l1 = new ConsBook(b1, mt);
		new ConsBook(b1, new MTBook());
	}
	/**
	 * testing for equals method of BookInfo
	 */
	public void testBookInfoMethod() {
		/**
		 * test class BookInfo: Robinson Crusoe, $15.5, 1719, Daniel Defoe
		 */
		BookInfo b1 = new BookInfo("Robinson Crusoe", 15.5, 1719, "Daniel Defoe");
		assertTrue(b1.equals(new BookInfo("Robinson Crusoe", 15.5, 1719, "Daniel Defoe")));   // hai cuốn giống hệt nhau
		assertFalse(b1.equals(new BookInfo("Beach Music", 9.5, 1996, "Pat Conroy")));
		assertFalse(b1.equals(new BookInfo("Robinson Crusoe", 20.0, 1719, "Daniel Defoe")));  // khác giá
	}
	/**
	 * testing for equals method
	 */
	public void testEquals() {
		BookInfo b1 = new BookInfo("Robinson Crusoe", 15.5, 1719, "Daniel Defoe");
		BookInfo b2 = new BookInfo("Heart of Darkness", 12.8, 1902, "Joseph Conrad");
		BookInfo b3 = new BookInfo("Beach Music", 9.5, 1996, "Pat Conroy");
		BookInfo f1 = new BookInfo("The Little Prince", 9.99, 1943, "Antoine de Saint-Exupery");
		BookInfo f2 = new BookInfo("De Men Phieu Luu Ky", 5.0, 1941, "To Hoai");
		/** list 1: the three books of the exercise */
		IListBookStore list1 = new ConsBook(b1, new ConsBook(b2, new ConsBook(b3, new MTBook())));
		/** list 2: my favorite books, contains b1 and two favorite books */
		IListBookStore list2 = new ConsBook(f1, new ConsBook(f2, new ConsBook(b1, new MTBook())));
		IListBookStore mt = new MTBook();
		IListBookStore l1 = new ConsBook(b1, mt);
		assertTrue(mt.equals(new MTBook()));      // rỗng so với rỗng
		assertTrue(l1.equals(new ConsBook(b1, new MTBook())));
		assertTrue(list1.equals(new ConsBook(b1, new ConsBook(b2, new ConsBook(b3, new MTBook())))));
		assertTrue(list2.equals(list2));
		assertFalse(mt.equals(l1));               // rỗng so với không rỗng
		assertFalse(l1.equals(mt));
		assertFalse(list1.equals(list2));
		assertFalse(list1.equals(new ConsBook(b3, new ConsBook(b2, new ConsBook(b1, new MTBook())))));  // cùng sách nhưng khác thứ tự
	}
}