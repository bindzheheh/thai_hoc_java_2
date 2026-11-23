package E_5_4;
/**
 * This is a class Information about a known person and his or her father and mother
 *@author NguyenVanThai
 *ID:2611130213
 */
public class ConsPerson implements IAncestor {
	/**
	 * properties
	 */
	private String name;
	private int yearOfBirth;
	private IAncestor father;
	private IAncestor mother;
	/**
	 * constructor
	 * @param name
	 * @param yearOfBirth
	 * @param father
	 * @param mother
	 */
	public ConsPerson(String name, int yearOfBirth, IAncestor father, IAncestor mother) {
		this.name = name;
		this.yearOfBirth = yearOfBirth;
		this.father = father;
		this.mother = mother;
	}
	/**
	 * Check whether the given object is a person with the same name, year, father tree and mother tree
	 * @param obj
	 * @return isEqual--(boolean)
	 * Example:
	 * IAncestor bob = new ConsPerson("Bob", 1917, new MTPerson(), new MTPerson());
	 * IAncestor annie = new ConsPerson("Annie", 1938, bob, new MTPerson());
	 * annie.equals(new ConsPerson("Annie", 1938, new ConsPerson("Bob", 1917, new MTPerson(), new MTPerson()), new MTPerson())) => true
	 * annie.equals(new ConsPerson("Annie", 1938, new MTPerson(), bob)) => false
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof ConsPerson))
			return false;
		else {
			ConsPerson that = (ConsPerson) obj;
			return this.name.equals(that.name) &&
					this.yearOfBirth == that.yearOfBirth &&
					this.father.equals(that.father) &&
					this.mother.equals(that.mother);
		}
	}
}