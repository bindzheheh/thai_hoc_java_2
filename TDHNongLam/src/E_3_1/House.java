package E_3_1;
/**
* This is a class  Information about the info house
*@author NguyenVanThai
*ID:2611130213
*/
public class House {
	/**
	 * properties
	 */
	private String kind;
	private int numberRooms;
	private double price;
	private Address address;
	/**
	 * constructor
	 * @param kind
	 * @param numberRooms
	 * @param price
	 * @param address
	 */
	public House(String kind, int numberRooms, double price,Address address) {
			this.kind = kind;
			this.numberRooms = numberRooms;
			this.address = address;
			this.price = price;
			}
	/**
	 * method
	 */
	/**
	 * which determines whether one house has more rooms than some other house
	 * @param that
	 * @return hasMoreRooms----(boolean)
	 * Example:
	 * House house1 = new House("Ranch", 7, 375000.0,new Address("23", "Mapple Street", "Brooklyn"));
	 * House house2 = new House("Colonial", 9, 450000.0,new Address("5", "Jove Road", "Newton"));
	 * House house3 = new House("Cape", 6, 235000.0,new Address("83", "Winslow Road", "Waltham"));
	 * house2.hasMoreRooms(house3)--true
	 * house1.hasMoreRooms(house2)--false
	 */
	public boolean hasMoreRooms(House that) {
		return this.numberRooms > that.numberRooms;
	}
	/**
	 * which checks whether the advertised house is in some given city
	 * @param City
	 * @return inThisCity---(boolean)
	 * Example:
	 * House house1 = new House("Ranch", 7, 375000.0,new Address("23", "Mapple Street", "Brooklyn"));
	 * House house2 = new House("Colonial", 9, 450000.0,new Address("5", "Jove Road", "Newton"));
	 * House house3 = new House("Cape", 6, 235000.0,new Address("83", "Winslow Road", "Waltham"));
	 * house1.inThisCity("Brooklyn") =>true 
	 * house1.inThisCity("Newton") =>false
	 */
	public boolean inThisCity(String City) {
		return this.address.inThisCity(City);
	}
	/**
	 * which determines whether one house is in the same city as some other house.
	 * @param that
	 * @return sameCity--(boolean)
	 * Example :
	 * House house1 = new House("Ranch", 7, 375000.0,new Address("23", "Mapple Street", "Brooklyn"));
	 * House house2 = new House("Colonial", 9, 450000.0,new Address("5", "Jove Road", "Newton"));
	 * House house3 = new House("Cape", 6, 235000.0,new Address("83", "Winslow Road", "Brooklyn"));
	 * house1.sameCity(house3) => true 
	 * house1.sameCity(house2) =>false
	 */
	public boolean sameCity(House that) {
		return this.address.sameCity(that.address);
	}


}
