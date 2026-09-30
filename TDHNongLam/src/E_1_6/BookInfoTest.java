package E_1_6;
/**
 * make by :nguyen van thai
	2611130213
	chuong trinh kiem tra cho bookinfo gom author va book
 */
import junit.framework.TestCase;

public class BookInfoTest extends TestCase {
	/**
	 *data  cau truc 
	 */
	public void testConstructor() {
		new BookInfo("Pride and Prejudice",9.99,1813,new Author("Jane Austen",1775));
		/**
		 * title:Pride and Prejudice
		 * price:9.99
		 * yearpulish:1813
		 * nameAuthor:Jane Austen
		 * birthyear:1775
		 */
		Author authorzzz=new Author("George Orwell",1903);
		new BookInfo("Nineteen Eighty-Four",14.50,1949,authorzzz);
	}

}
