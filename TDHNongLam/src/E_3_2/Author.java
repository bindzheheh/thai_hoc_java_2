package E_3_2;
/**
* This is a class  Information about the info Author
*@author NguyenVanThai
*ID:2611130213
*/
public class Author {
	/**
	 * properties
	 */
	private String name;
	private int bYear;
	/**
	 * constructor
	 * @param name
	 * @param bYear
	 */
	public Author(String name,int bYear) {
		this.name=name;
		this.bYear=bYear;
	}
	/**
	 * 
	 * methods
	 */
	/**
	 * checks whether the author was born in 1940 or later
	 * @return currentAuthor--(boolean)
	 * Example:
	 * new Author("Matthias Felleisen", 1960).currentAuthor() => true
	 * new Author("Daniel P. Friedman", 1939).currentAuthor() => false
	 */
	public boolean currentAuthor () {
		return this.bYear>=1940;
	}
	/**
	 * checks whether two authors have the same name and birth year
	 * @param that the other author
	 * @return same--(boolean)
	 * Example:
	 * Author a1 = new Author("Matthias Felleisen", 1960);
	 * a1.same(new Author("Matthias Felleisen", 1960)) => true
	 * a1.same(new Author("Matthias Felleisen", 1961)) => false
	 */
	public boolean same(Author that) {
		return (this.name.equals(that.name)) && (this.bYear==that.bYear);
	}
	/**
	 * checks whether the two authors were born within 10 years of each other
	 * @param that the other author
	 * @return sameGeneration--(boolean)
	 * Example:
	 * Author a1 = new Author("Matthias Felleisen", 1960);
	 * a1.sameGeneration(new Author("Nguyen Van A", 1965)) => true
	 * a1.sameGeneration(new Author("Daniel P. Friedman", 1939)) => false
	 */
	public boolean sameGeneration(Author that) {
		return Math.abs(this.bYear-that.bYear) <=10;
	}
	/**
	 * Override
	 */
	public boolean  equals(Object obj) {
		if ((null == obj) || !(obj instanceof Author))
			return false;
		else {Author that = (Author) obj;
		return (this.name.equals(that.name)
				&&this.bYear==that.bYear);
		}
	}

}
