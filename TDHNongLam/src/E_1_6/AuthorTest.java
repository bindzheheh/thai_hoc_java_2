package E_1_6;
/**
 * make by :nguyen van thai
	2611130213
	chuong trinh kiem tra cho author
 */
import junit.framework.TestCase;

public class AuthorTest extends TestCase {
	/**
	 *data  cau truc 
	 */
	public void testConstructor() {
		new Author("Jane Austen",1775);
		/**
		 * name Jane Austen
		 * birthyear 1775
		 */
	}

}
