package Chap1;

public class Coffee {
		String kind;
		double price;
		double weight;
		Coffee(String kind, double price, double weight) {
			this.kind = kind;
			this.price = price;
			this.weight = weight;
		}
	
		double cost() {
		return this.price * this.weight;
		}
		boolean priceOver(double amount) {
			return this.price > amount;
			}

}


