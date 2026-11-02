package E_3_2;
/**
 * This is a test program about Book info
 *@author NguyenVanThai
 *ID:2611130213
 */
import junit.framework.TestCase;

public class Book_InfoTest extends TestCase {
	/**
	 * testing for constructor
	 */
	public void testConstrutor() {
		Author felleisen =new Author("Matthias Felleisen", 1960);
		new Book_Info ("How to Design Class Hierarchies",1.0 , 2004,felleisen );
		new Book_Info("A Little Java, A Few Pattern", 25.9, 1998,new Author("Daniel P. Friedman", 1939));
	}
	/**
	 * testing method
	 */
	
	/**
	 * testing for methods of Author
	 */
	public void testAuthorMethod() {
		Author a1 = new Author("Matthias Felleisen", 1960);
		Author a2 = new Author("Daniel P. Friedman", 1939);
		Author a3 = new Author("Nguyen Van A", 1965);
		Author a4 = new Author("Matthias Felleisen", 1960);
		/**
		 * currentAuthor
		 */
		assertTrue(a1.currentAuthor());
		assertFalse(a2.currentAuthor());
		/**
		 * same
		 */
		assertTrue(a1.same(a4));
		assertFalse(a1.same(a2));
		/**
		 * sameGeneration
		 */
		assertTrue(a1.sameGeneration(a3));
		assertFalse(a1.sameGeneration(a2));
		/**
		 * equals
		 */
		assertEquals(a1, a4);
		assertFalse(a1.equals(a2));
	}
	/**
	 * testing book info method
	 */
	/**
	 * testing for currentBook method
	 */
	public void testCurrentBook() {
		Author felleisen =new Author("Matthias Felleisen", 1960);
		Book_Info htdch =  new Book_Info ("How to Design Class Hierarchies",1.0 , 2004,felleisen );
		Book_Info aljafp =  new Book_Info("A Little Java, A Few Pattern", 25.9, 1998,new Author("Daniel P. Friedman", 1939));
		assertTrue(htdch.currentBook());
		assertFalse(aljafp.currentBook());
	}
	/**
	 * testing for currentAuthor method
	 */
	public void testCurrentAuthor() {
		Book_Info b1 = new Book_Info("How to Design Class Hierarchies", 1.0, 2004, new Author("Matthias Felleisen", 1960));
		Book_Info b2 = new Book_Info("A Little Java, A Few Pattern", 25.9, 1998, new Author("Daniel P. Friedman", 1939));
		Book_Info b3 = new Book_Info("Some Book", 20.0, 2001, new Author("Nguyen Van A", 1965));
		assertTrue(b1.currentAuthor());
		assertFalse(b2.currentAuthor());
		assertTrue(b3.currentAuthor());
	}
	/**
	 * testing for thisAuthor method
	 */
	public void testThisAuthor() {
		Book_Info b1 = new Book_Info("How to Design Class Hierarchies", 1.0, 2004, new Author("Matthias Felleisen", 1960));
		assertTrue(b1.thisAuthor(new Author("Matthias Felleisen", 1960)));  
		assertFalse(b1.thisAuthor(new Author("Daniel P. Friedman", 1939)));  
		assertFalse(b1.thisAuthor(new Author("Matthias Felleisen", 1961)));  
	}
	/**
	 * testing for sameAuthor method
	 */
	public void testSameAuthor() {
		Book_Info b1 = new Book_Info("How to Design Class Hierarchies", 1.0, 2004, new Author("Matthias Felleisen", 1960));
		Book_Info b2 = new Book_Info("Another Book", 30.0, 2003, new Author("Matthias Felleisen", 1960));
		Book_Info b3 = new Book_Info("A Little Java, A Few Pattern", 25.9, 1998, new Author("Daniel P. Friedman", 1939));
		assertTrue(b1.sameAuthor(b2));    
		assertFalse(b1.sameAuthor(b3));
		assertFalse(b3.sameAuthor(b2));
	}
	/**
	 * testing for sameGeneration method
	 */
	public void testSameGeneration() {
		Book_Info b1 = new Book_Info("How to Design Class Hierarchies", 1.0, 2004, new Author("Matthias Felleisen", 1960));
		Book_Info b2 = new Book_Info("Some Book", 20.0, 2001, new Author("Nguyen Van A", 1965));
		Book_Info b3 = new Book_Info("A Little Java, A Few Pattern", 25.9, 1998, new Author("Daniel P. Friedman", 1939));
		assertTrue(b1.sameGeneration(b2));  
		assertFalse(b1.sameGeneration(b3));  
		assertFalse(b2.sameGeneration(b3)); 
	}

}
