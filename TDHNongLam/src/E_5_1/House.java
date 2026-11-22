package E_5_1;
/**
 * This is a class Information about the house
 *@author NguyenVanThai
 *ID:2611130213
 */
public class House {
	/**
	 * properties
	 */
	private String kindOfRoom;
	private int numOfRoom;
	private double price;      // đơn vị: $
	private Address address;
	/**
	 * constructor
	 * @param kindOfRoom
	 * @param numOfRoom
	 * @param price
	 * @param address
	 */
	public House(String kindOfRoom, int numOfRoom, double price, Address address) {
		this.kindOfRoom = kindOfRoom;
		this.numOfRoom = numOfRoom;
		this.price = price;
		this.address = address;
	}
	/**
	 * Check whether the given object is a house with the same kind, rooms, price and address
	 * @param obj
	 * @return isEqual--(boolean)
	 * Example:
	 * Address a1 = new Address(23, "Maple Street", "Brookline");
	 * House h1 = new House("Ranch", 7, 375000.0, a1);
	 * h1.equals(new House("Ranch", 7, 375000.0, a1)) => true
	 * h1.equals(new House("Cape", 6, 235000.0, a1)) => false
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof House))
			return false;
		else {
			House that = (House) obj;
			return this.kindOfRoom.equals(that.kindOfRoom) &&
					this.numOfRoom == that.numOfRoom &&
					this.price == that.price &&
					this.address.equals(that.address);
		}
	}
}