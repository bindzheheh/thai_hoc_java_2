package E_5_4;
/**
 * This is a class Information about an unknown ancestor (the ??? in the tree)
 *@author NguyenVanThai
 *ID:2611130213
 */
public class MTPerson implements IAncestor {
	/**
	 * Check whether the given object is also an unknown ancestor
	 * @param obj
	 * @return isEqual--(boolean)
	 * Example:
	 * IAncestor mt = new MTPerson();
	 * IAncestor bob = new ConsPerson("Bob", 1917, new MTPerson(), new MTPerson());
	 * mt.equals(new MTPerson()) => true
	 * mt.equals(bob) => false
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof MTPerson))
			return false;
		else {
			return true;
		}
	}
}