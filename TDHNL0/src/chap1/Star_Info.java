package chap1;
/**
 * This is the class that defines information about  star
 * @author nvt23
 */
public class Star_Info {
	/**
	 * properties
	 */
	String firstName;
	String lastName;
	String instrument;
	int sales;
	/**
	 * constructer
	 */
	Star_Info(String firstName,String lastName,String instrument,int sales){
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
	 * return biggerSales(boolean)
	 * Example:
	 * Star_Info aStar1 = new Star_Info("Abba", "John", "vocals", 12200);
	 * Star_Info aStar2 = new Star_Info("Elton", "John", "guitar", 20000);
	 * aStar2.biggerSales(aStar1) =>true
	 */
	boolean biggerSales(Star_Info other) {
		return (this.sales>other.sales);
	}
	/**
	 * This is a method to check whether the stars are identical.
	 * @param other
	 * @return sameStar(boolean)
	 */
	boolean sameStar(Star_Info other) {
		return (this.firstName.equals(other.firstName)
				&& this.lastName.equals(other.lastName)
				&& this.instrument.equals(other.instrument)
				&& this.sales == other.sales);
	}

}
