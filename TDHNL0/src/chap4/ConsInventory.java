package chap4;

public class ConsInventory implements Inventory {
	private Toy first;
	private Inventory rest;
	/**
	 * @param first
	 * @param rest
	 */
	public ConsInventory(Toy first, Inventory rest) {
		this.first = first;
		this.rest = rest;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "|"+this.first.toString() +"|\n" +this.rest.toString() +"";
	}
	

}
