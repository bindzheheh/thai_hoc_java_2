package E_5_1;
/**
 * This is a class Information about the empty list of estates
 *@author NguyenVanThai
 *ID:2611130213
 */
public class MTEstate implements IListEstate {
	/**
	 * Check whether the given object is also an empty list of estates
	 * @param obj
	 * @return isEqual--(boolean)
	 * Example:
	 * IListEstate mt = new MTEstate();
	 * House h1 = new House("Ranch", 7, 375000.0, new Address(23, "Maple Street", "Brookline"));
	 * mt.equals(new MTEstate()) => true
	 * mt.equals(new ConsEstate(h1, mt)) => false
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof MTEstate)) 
			return false;
		else {
			return true;
		}
	}
}