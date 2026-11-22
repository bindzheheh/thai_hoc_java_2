package E_5_1;
/**
 * This is a class Information about the address of a house
 *@author NguyenVanThai
 *ID:2611130213
 */
public class Address {
	/**
	 * properties
	 */
	private int numOfHouse;
	private String street;     
	private String cityName;
	/**
	 * constructor
	 * @param numOfHouse
	 * @param street
	 * @param cityName
	 */
	public Address(int numOfHouse, String street, String cityName) {
		this.numOfHouse = numOfHouse;
		this.street = street;  
		this.cityName = cityName;
	}
	/**
	 * Check whether the given object is an address with the same number, street and city
	 * @param obj
	 * @return isEqual--(boolean)
	 * Example:
	 * Address a1 = new Address(23, "Maple Street", "Brookline");
	 * a1.equals(new Address(23, "Maple Street", "Brookline")) => true
	 * a1.equals(new Address(5, "Joye Road", "Newton")) => false
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Address))
			return false;
		else {
			Address that = (Address) obj;
			return this.numOfHouse == that.numOfHouse &&
					this.street.equals(that.street) &&
					this.cityName.equals(that.cityName);
		}
	}
}