package E_3_1;
/**
* This is a class  Information about the info house Address 
*@author NguyenVanThai
*ID:2611130213
*/
public class Address {
	/**
	 * properties
	 */
	private String numberHouse;
	private String streetName;
	private String cityName;
	/**
	 * constructor
	 * @param numberHouse
	 * @param streetName
	 * @param cityName
	 */
	public Address(String numberHouse,String streetName,String cityName) {
		this.numberHouse=numberHouse;
		this.streetName=streetName;
		this.cityName=cityName;
	}
	/**
	 * method
	 */
	/**
	 * This is the method for two equal city names.
	 * @param cityName2
	 * @return
	 * Example:
	 * Address ad1 = new Address("23", "Mapple Street", "Brooklyn")
	 * Address ad2 = new Address("5", "Jove Road", "Newton")
	 * Address ad3 = new Address("83", "Winslow Road", "Waltham")
	 * ad1.inThisCity("Brooklyn") =>true 
	 * ad1.inThisCity("Newton") =>false
	 */
	public boolean inThisCity (String cityName2) {
		return this.cityName.equals(cityName2);
		}
	/**
	 * This is the method for two equal city
	 * @param that
	 * @return sameCity--(boolean)
	 * Address ad1 = new Address("23", "Mapple Street", "Brooklyn")
	 * Address ad2 = new Address("5", "Jove Road", "Newton")
	 * Address ad3 = new Address("83", "Winslow Road", "Brooklyn")
	 * ad1.sameCity(ad3) => true 
	 * ad1.sameCity(ad2) =>false
	 */
	public boolean sameCity(Address that) {
		return this.cityName.equals(that.cityName);
	}

}
