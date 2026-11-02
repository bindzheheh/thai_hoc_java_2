package E_2_4;
/**
 * This is a class about selling coffee.
 *@author NguyenVanThai
 *ID:2611130213
 */
public class Coffee {
	/**
	 * properties
	 */
	String kindOfCoffee;
	private double price;
	private double weight;
	/**
	 * constructer
	 */
	public Coffee(String kindOfCoffee,double price,double weight){
		this.kindOfCoffee=kindOfCoffee;
		this.price=price;
		this.weight=weight;
	}
	/**
	 * methods
	 */
	/**
	 * This is the method used to calculate the discount.
	 * @return discount()
	 * Example:
	 * Coffee c1 =new Coffee("Hawaiian Kona", 15.95, 1000);
	 * Coffee c2 =new Coffee("Ethiopian", 8.0, 5000);
	 * Coffee c3 =new Coffee("Colombian Supreme ", 9.5, 25000);
	 * c1.discount() => 0.0
	 * c2.discount() => 0.1
	 * c3.discount() => 0.25
	 */
	double discount() {
		if (this.weight<5000) {
			return 0;
		}
		else {
			if(this.weight<=20000) {
				return 0.1;
			}
			else {
				return 0.25;
			}
		}
	}

	  /**
     * This is the method used to calculate amount after discount
     * @return cost---(double)
     * Example:
     * Coffee c1 =new Coffee("Hawaiian Kona", 15.95, 1000);
     * Coffee c2 =new Coffee("Ethiopian", 8.0, 5000);
     * Coffee c3 =new Coffee("Colombian Supreme ", 9.5, 25000);
     * c1.cost() => 15950
     * c2.cost() => 36000
     * c3.cost() => 178125
     *
     */
	double cost() {
		return (this.price * this.weight)*(1-this.discount());
	}

	
	
}