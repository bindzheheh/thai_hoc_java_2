package E_2_5;
/**
 * This is a class about selling JetFuel.
 *@author NguyenVanThai
 *ID:2611130213
 */
public class JetFuel {
	/**
	 * properties
	 */
	private int quantitySold;
	String qualityLevel;
	private int price;
	/**
	 * constructor
	 */
	public JetFuel (int quantitySold,String qualityLevel,int price) {
		this.quantitySold=quantitySold;
		this.qualityLevel=qualityLevel;
		this.price=price;
		
	}
	/**
	 * method
	 */
	/**
	 * method:which computes the cost of the sale
	 * @return totalCost --(double)
	 * Example:
	 *JetFuel j1 = new JetFuel(50000, "Jet A", 300);   
	 *JetFuel j2 = new JetFuel(200000, "Jet A1", 250);
	 *j1.totalCost() => 15000000.0
	 *j2.totalCost() => 50000000.0
	 */
	double totalCost() {
		return this.quantitySold*this.price;
	}
	/**
	 * method:which computes the discounted price.
	 * The buyer gets a 10% discount if the sale is for morethan 100,000 gallons
	 * @return discountPrice ---(double)
	 * Example:
	 * JetFuel j1 = new JetFuel(50000, "Jet A", 300);
	 * JetFuel j2 = new JetFuel(100000, "Jet A", 300);
	 * JetFuel j3 = new JetFuel(100001, "Jet A", 300); 
	 * JetFuel j4 = new JetFuel(200000, "Jet A1", 250); 
	 * j1.discountPrice() => 15000000.0
	 * j2.discountPrice() => 30000000.0
	 * j3.discountPrice() => 27000270.0
	 * j4.discountPrice() => 45000000.0
	 */
	double discountPrice() {
		if(this.quantitySold>100000) {
			return this.totalCost()*0.9;
		}
		else {
			return this.totalCost();
		}
	}

}
