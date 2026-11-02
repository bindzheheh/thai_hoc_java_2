package E_3_2;
/**
* This is a class  Information about the info book
*@author NguyenVanThai
*ID:2611130213
*/
public class Book_Info {
	/**
	 * properties
	 */
	private String title;
	private double price;
	private int pYear;
	private Author author;
	/**
	 * constructor
	 * @param title
	 * @param price
	 * @param pYear
	 * @param author
	 */
	public Book_Info (String title,double price,int pYear,Author author) {
		this.title=title;
		this.price=price;
		this.pYear=pYear;
		this.author=author;
	}
	/**
	 * method
	 */
	/**
	 * currentBook that checks whether the book was published in 2004 or 2003
	 * @return currentBook--(boolean)
	 * Example:
	 * Book_Info htdch = new Book_Info("How to Design Class Hierarchies", 0.0, 2004,new Author("Matthias Felleisen", 1960));
	 * htdch.currentBook() =>true
	 * Book_Info aljafp = new Book_Info("A Little Java, A Few Pattern", 25.9, 1998,new Author("Daniel P. Friedman", 1939));
	 * aljafp.currentBook() =>false
	 */
	public boolean currentBook () {
		return (this.pYear==2003) || (this.pYear==2004);
	}
	/**
	 * checks whether the author of this book was born in 1940 or later
	 * @return currentAuthor--(boolean)
	 * Example:
	 * Book_Info b1 = new Book_Info("How to Design Class Hierarchies", 0.0, 2004, new Author("Matthias Felleisen", 1960));
	 * Book_Info b2 = new Book_Info("A Little Java, A Few Pattern", 25.9, 1998, new Author("Daniel P. Friedman", 1939));
	 * b1.currentAuthor() => true
	 * b2.currentAuthor() => false
	 */
	public boolean currentAuthor() {
		return this.author.currentAuthor();
	}
	/**
	 * checks whether this book was written by the specified author
	 * @param that the author to compare with
	 * @return thisAuthor--(boolean)
	 * Example:
	 * Author a1 = new Author("Matthias Felleisen", 1960);
	 * Book_Info b1 = new Book_Info("How to Design Class Hierarchies", 0.0, 2004, a1);
	 * b1.thisAuthor(new Author("Matthias Felleisen", 1960)) => true
	 * b1.thisAuthor(new Author("Daniel P. Friedman", 1939)) => false
	 */
	public boolean thisAuthor (Author that) {
		return this.author.same(that);
	}
	/**
	 * checks whether this book and another book were written by the same author
	 * @param that the other book
	 * @return sameAuthor--(boolean)
	 * Example:
	 * Author a1 = new Author("Matthias Felleisen", 1960);
	 * Book_Info b1 = new Book_Info("How to Design Class Hierarchies", 0.0, 2004, a1);
	 * Book_Info b2 = new Book_Info("Another Book", 30.0, 2003, new Author("Matthias Felleisen", 1960));
	 * Book_Info b3 = new Book_Info("A Little Java, A Few Pattern", 25.9, 1998, new Author("Daniel P. Friedman", 1939));
	 * b1.sameAuthor(b2) => true
	 * b1.sameAuthor(b3) => false
	 */
	public boolean sameAuthor(Book_Info that) {
		return this.author.same(that.author);
	}
	/**
	 * checks whether the two authors were born within 10 years of each other
	 * @param that the other book
	 * @return sameGeneration--(boolean)
	 * Example:
	 * Book_Info b1 = new Book_Info("How to Design Class Hierarchies", 0.0, 2004, new Author("Matthias Felleisen", 1960));
	 * Book_Info b2 = new Book_Info("Some Book", 20.0, 2001, new Author("Nguyen Van A", 1965));
	 * Book_Info b3 = new Book_Info("A Little Java, A Few Pattern", 25.9, 1998, new Author("Daniel P. Friedman", 1939));
	 * b1.sameGeneration(b2) => true   (1965 - 1960 = 5)
	 * b1.sameGeneration(b3) => false  (1960 - 1939 = 21)
	 */
	public boolean sameGeneration(Book_Info that) {
		return this.author.sameGeneration(that.author);
	}
}
