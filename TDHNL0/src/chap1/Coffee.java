package chap1;
/**
 * This is a class about selling coffee.
 * @author nvt
 */
public class Coffee {
	/**
	 * properties
	 */
	String kindOfCoffee;
	double price;
	double weight;
	/**
	 * constructer
	 */
	Coffee(String kindOfCoffee,double price,double weight){
		this.kindOfCoffee=kindOfCoffee;
		this.price=price;
		this.weight=weight;
	}
	/**
	 * methods
	 */
	/**
	 * this is the method which used to compute the cost of selling coffe
	 * @return the cost(double)
	 * Example:
	 * Coffee c2 = new Coffee("Ethiopian", 8.0, 1000);
	 * c2.cost() => 8000.0
	 */
	double cost() {
		return this.price * this.weight;
	/**
	 * This is the method used to check the amount value.
	 * @return priceOver(boolean)
	 * @param amount
	 * Example:
	 *  Coffee c2 = new Coffee("Ethiopian", 8.0, 1000);
	 *  c2.priceOver(7) =>true
	 */
	}
	boolean priceOver(double amount) {
		return this.price > amount;
	}
	
}
