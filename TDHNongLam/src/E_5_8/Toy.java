package E_5_8;
/**
 * This is a class Information about the toy
 *@author NguyenVanThai
 *ID:2611130213
 */
public class Toy {
	/**
	 * properties
	 */
	private String name;
	private double price;
	private int available;     // số lượng có sẵn trong kho
	/**
	 * constructor
	 * @param name
	 * @param price
	 * @param available
	 */
	public Toy(String name, double price, int available) {
		this.name = name;
		this.price = price;
		this.available = available;
	}
	/**
	 * Check whether the given object is a toy with the same name, price and available
	 * @param obj
	 * @return result--(boolean)
	 * Example:
	 * Toy doll = new Toy("doll", 17.95, 5);
	 * doll.equals(new Toy("doll", 17.95, 5)) => true
	 * doll.equals(new Toy("doll", 17.95, 4)) => false
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Toy))
			return false;
		else {
			Toy that = (Toy) obj;
			return this.name.equals(that.name) &&
					this.price == that.price &&
					this.available == that.available;
		}
	}
	/**
	 * Get the price of this toy
	 * @return price--(double)
	 * Example:
	 * Toy doll = new Toy("doll", 17.95, 5);
	 * Toy gun = new Toy("gun", 15.0, 4);
	 * doll.getPrice() => 17.95
	 * gun.getPrice() => 15.0
	 */
	public double getPrice() {
		return this.price;
	}
	/**
	 * Produce a new toy, renamed "r2d2" if this toy is named "robot", otherwise the same toy
	 * @return newToy--(Toy)
	 * Example:
	 * Toy robot = new Toy("robot", 22.05, 3);
	 * Toy doll = new Toy("doll", 17.95, 5);
	 * robot.translateName() => new Toy("r2d2", 22.05, 3)
	 * doll.translateName() => new Toy("doll", 17.95, 5)
	 */
	public Toy translateName() {
		if (this.name.equals("robot")) {
			return new Toy("r2d2", this.price, this.available);
		}
		else {
			return new Toy(this.name, this.price, this.available);
		}
	}
	/**
	 * Check whether the name of this toy is the given name
	 * @param toyOfName
	 * @return result--(boolean)
	 * Example:
	 * Toy robot = new Toy("robot", 22.05, 3);
	 * robot.isName("robot") => true
	 * robot.isName("doll") => false
	 */
	public boolean isName(String toyOfName) {
		return this.name.equals(toyOfName);
	}
}