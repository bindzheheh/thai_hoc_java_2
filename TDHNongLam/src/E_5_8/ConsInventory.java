package E_5_8;
/**
 * This is a class Information about the inventory that has at least one toy
 *@author NguyenVanThai
 *ID:2611130213
 */
public class ConsInventory implements Inventory {
	/**
	 * properties
	 */
	private Toy first;
	private Inventory rest;
	/**
	 * constructor
	 * @param first
	 * @param rest
	 */
	public ConsInventory(Toy first, Inventory rest) {
		this.first = first;
		this.rest = rest;
	}
	/**
	 * Check whether the given object is an inventory with the same toys in the same order
	 * @param obj
	 * @return result--(boolean)
	 * Example:
	 * Toy doll = new Toy("doll", 17.95, 5);
	 * Inventory l1 = new ConsInventory(doll, new MTInventory());
	 * l1.equals(new ConsInventory(new Toy("doll", 17.95, 5), new MTInventory())) => true
	 * l1.equals(new MTInventory()) => false
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof ConsInventory))
			return false;
		else {
			ConsInventory that = (ConsInventory) obj;
			return this.first.equals(that.first) &&
					this.rest.equals(that.rest);
		}
	}
	/**
	 * Compute the total price of all toys in this inventory
	 * @return totalPrice--(double)
	 * Example:
	 * Toy doll = new Toy("doll", 17.95, 5);
	 * Toy robot = new Toy("robot", 22.05, 3);
	 * Inventory l1 = new ConsInventory(doll, new MTInventory());
	 * Inventory l2 = new ConsInventory(robot, l1);
	 * l1.totalPrice() => 17.95
	 * l2.totalPrice() => 40.0
	 */
	@Override
	public double totalPrice() {
		return this.first.getPrice() + this.rest.totalPrice();
	}
	/**
	 * Count the number of toys in this inventory
	 * @return number--(int)
	 * Example:
	 * Toy doll = new Toy("doll", 17.95, 5);
	 * Toy robot = new Toy("robot", 22.05, 3);
	 * Inventory l1 = new ConsInventory(doll, new MTInventory());
	 * Inventory l2 = new ConsInventory(robot, l1);
	 * l1.howMany() => 1
	 * l2.howMany() => 2
	 */
	@Override
	public int howMany() {
		return 1 + this.rest.howMany();
	}
	/**
	 * Compute the average price of toys in this inventory (each toy counts once)
	 * @return averagePrice--(double)
	 * Example:
	 * Toy doll = new Toy("doll", 17.95, 5);
	 * Toy robot = new Toy("robot", 22.05, 3);
	 * Inventory l1 = new ConsInventory(doll, new MTInventory());
	 * Inventory l2 = new ConsInventory(robot, l1);
	 * l1.averagePrice() => 17.95
	 * l2.averagePrice() => 20.0
	 */
	@Override
	public double averagePrice() {
		return this.totalPrice() / this.howMany();
	}
	/**
	 * Produce a new inventory in which every toy named "robot" is renamed "r2d2"
	 * @return newInventory--(Inventory)
	 * Example:
	 * Toy doll = new Toy("doll", 17.95, 5);
	 * Toy robot = new Toy("robot", 22.05, 3);
	 * Inventory l2 = new ConsInventory(robot, new ConsInventory(doll, new MTInventory()));
	 * l2.replaceName() => new ConsInventory(new Toy("r2d2", 22.05, 3), new ConsInventory(doll, new MTInventory()))
	 */
	@Override
	public Inventory replaceName() {
		return new ConsInventory(this.first.translateName(), this.rest.replaceName());
	}
	/**
	 * Produce a new inventory without the toys whose name matches the given name
	 * @param toyOfName
	 * @return newInventory--(Inventory)
	 * Example:
	 * Toy doll = new Toy("doll", 17.95, 5);
	 * Toy robot = new Toy("robot", 22.05, 3);
	 * Inventory l2 = new ConsInventory(robot, new ConsInventory(doll, new MTInventory()));
	 * l2.eliminate("robot") => new ConsInventory(doll, new MTInventory())
	 * l2.eliminate("car") => l2
	 */
	@Override
	public Inventory eliminate(String toyOfName) {
		if (this.first.isName(toyOfName)) {
			return this.rest.eliminate(toyOfName);   // bỏ toy đầu
		}
		else {
			return new ConsInventory(this.first, this.rest.eliminate(toyOfName));
		}
	}
}
