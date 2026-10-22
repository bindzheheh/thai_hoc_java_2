package chap2;
/**
 *  This is the class that defines information about  star
 */
public class Star {
	/**
	 * properties
	 */
	String firstName;
	String lastName;
	String instrument;
	double sales;
	/**
	 * constructer
	 */
	Star(String firstName,String lastName,String instrument,double sales){
		this.firstName=firstName;
		this.lastName=lastName;
		this.instrument=instrument;
		this.sales=sales;
	}
	/**
	 * methods
	 */
	/**
	 * this is the methods to Check whether one star's sales is greater than another star's sales.
	 * @param other (Star)
	 * @return biggerSales--(boolean)
	 * Example:
	 * Star_Info aStar1 = new Star_Info("Abba", "John", "vocals", 12200);
	 * Star_Info aStar2 = new Star_Info("Elton", "John", "guitar", 20000);
	 * aStar2.biggerSales(aStar1) =>true
	 */
	boolean biggerSales(Star other) {
		return (this.sales>other.sales);
	}
	/**
	 * This is a method to check whether the stars are identical.
	 * @param other
	 * @return sameStar--(boolean)
	 * Example:
	 * Star aStar1 = new Star("Abba", "John", "vocals", 12200)
	 * Star aStar2 = new Star("Abba", "John", "vocals", 12200)
	 * Star aStar3 = new Star("Elton", "John", "guitar", 20000)
	 * assertTrue(aStar1.sameStar(aStar2)) =>true
	 * assertFalse(aStar3.sameStar(aStar1)) =>false
	 */
	boolean sameStar(Star other) {
		return(this.firstName.equals(other.firstName)
				&&this.lastName.equals(other.lastName)
				&&this.instrument.equals(other.instrument)
				&&this.sales==other.sales);
	}
	/**
	 * override equals
	 * Example:
	 * Star aStar2 = new Star("Debie", "Gission", "organ", 15000)
	 * Star aStar3 = new Star("Debie", "Gission", "organ", 15000)
	 * assertEquals(aStar2, aStar3) =>true
	 * aStar2.equals(aStar3) =>true
	 */
	public boolean  equals(Object obj) {
		if ((null == obj)|| !(obj instanceof Star))	
			return false;
		else { Star that = (Star) obj;
		return (this.firstName.equals(that.firstName)
				&&this.lastName.equals(that.lastName)
				&&this.instrument.equals(that.instrument)
				&&this.sales==that.sales);		
					}
	}

}
