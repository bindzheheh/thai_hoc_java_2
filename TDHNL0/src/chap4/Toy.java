package chap4;

public class Toy {
	private String name;
	private double price;
	private int available;
	/**
	 * @param name
	 * @param price
	 * @param available
	 */
	public Toy(String name, double price, int available) {
		this.name = name;
		this.price = price;
		this.available = available;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: "+this.name+",Price :"+this.price+",Available :"+this.available;
	}
	

}
