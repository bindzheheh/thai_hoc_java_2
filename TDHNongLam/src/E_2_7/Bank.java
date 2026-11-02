package E_2_7;
/**
* This is a class  Information about the transaction in bank
*@author NguyenVanThai
*ID:2611130213
*/
public class Bank {
	/**
	 * properties
	 */
	String customerName;
	private double depositeAmount;
	 int maturity;
	/**
	 * constructor
	 */
	public Bank (String customerName,double depositeAmount,int maturity) {
		this.customerName=customerName;
		this.depositeAmount=depositeAmount;
		this.maturity=maturity;
	}
	/**
	 * methods
	 */
	/**
	 * method :amount of interest that the money earns in a year
	 * (flat 4% for deposits up to $1,000; 4.5% for up to $5,000; 5% for more than $5,000)
	 * @return interest--(double)
	 * Example:
	 * Bank b1 = new Bank("An", 500, 1);
	 * Bank b2 = new Bank("Binh", 1000, 1);
	 * Bank b3 = new Bank("Chi", 3000, 1);
	 * Bank b4 = new Bank("Dung", 6000, 1);
	 * b1.interest() => 20.0
	 * b2.interest() => 40.0
	 * b3.interest() => 135.0
	 * b4.interest() => 300.0
	 */
	double interest() {
		if (this.depositeAmount <= 1000) {
			return this.depositeAmount * 0.04;
		}
		if (this.depositeAmount <= 5000) {
			return this.depositeAmount * 0.045 ;
		}
		return this.depositeAmount * 0.05 ;
	}
	/**
	 * method :compute the pay-back amount of a credit card charge
	 * @return payback--(double)
	 * Example:
	 * Bank b1 = new Bank("An", 400, 1);
	 * Bank b2 = new Bank("Chi", 1000, 1);
	 * Bank b3 = new Bank("Em", 2500, 1);
	 * b1.payback() => 1.0
	 * b2.payback() => 3.75
	 * b3.payback() => 13.75
	 */
	double payback() {
		if (this.depositeAmount <= 500) {
			return this.depositeAmount * 0.0025;
		}
		if (this.depositeAmount <= 1500) {
			return 500 * 0.0025 + (this.depositeAmount - 500)* 0.005 ;
		}
		if (this.depositeAmount <= 2500 ) {
			return 500 * 0.0025 + 1000 * 0.005 +(this.depositeAmount -1500)* 0.0075;
		}
		return 500 * 0.0025 + 1000 * 0.005 + 1000 * 0.0075 +(this.depositeAmount - 2500)* 0.01;
		

		}

}
