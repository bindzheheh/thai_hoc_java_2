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
	public boolean contains(String nameOfToy) {
		return this.first.nameEqual(nameOfToy) ||
				this.rest.contains(nameOfToy);
				
	}
	@Override
	public boolean isBelow(double priceOfToy) {
		return this.first.priceBelow(priceOfToy) ||
				this.rest.isBelow(priceOfToy);
	}
	@Override
	public int howMany() {
		// TODO Auto-generated method stub
		return 1+this.rest.howMany();
	}
	@Override
	public ConsInventory raisePrice(double percent) {
		// TODO Auto-generated method stub
		return new ConsInventory( this.first.raise(percent), this.rest.raisePrice(percent)) ;
				
	}
	
	
	

}
