package E_5_1;
/**
 * This is a class Information about the list of estates that has at least one house
 *@author NguyenVanThai
 *ID:2611130213
 */
public class ConsEstate implements IListEstate {
	/**
	 * properties
	 */
	private House first;
	private IListEstate rest;
	/**
	 * constructor
	 * @param first
	 * @param rest
	 */
	public ConsEstate(House first, IListEstate rest) {
		this.first = first;
		this.rest = rest;
	}
	/**
	 * Check whether the given object is a list with the same houses in the same order
	 * @param obj
	 * @return isEqual--(boolean)
	 * Example:
	 * House h1 = new House("Ranch", 7, 375000.0, new Address(23, "Maple Street", "Brookline"));
	 * House h2 = new House("Colonial", 9, 450000.0, new Address(5, "Joye Road", "Newton"));
	 * IListEstate l1 = new ConsEstate(h1, new MTEstate());
	 * l1.equals(new ConsEstate(h1, new MTEstate())) => true
	 * l1.equals(new ConsEstate(h2, new MTEstate())) => false
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof ConsEstate))
			return false;
		else {
			ConsEstate that = (ConsEstate) obj;
			return this.first.equals(that.first) && this.rest.equals(that.rest);
		}
	}
}