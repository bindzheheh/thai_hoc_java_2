package chap4;

public interface Inventory {
	/**
	 * ...
	 * @param nameOfToy
	 * @return
	 */
	public boolean contains(String nameOfToy);
	public boolean isBelow(double priceOfToy);
	public int howMany();
	public ConsInventory raisePrice(double percent);
	

}
