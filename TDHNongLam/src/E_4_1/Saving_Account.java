
package E_4_1;
/**
 * 
* This is a class  Information about the Saving_Account
*@author NguyenVanThai
*ID:2611130213
*/
public class Saving_Account  extends BankAccount{
	/**
	 * properties
	 */
	private double interest_Rate;

	/**
	 * constructor
	 * @param iD
	 * @param name
	 * @param money
	 * @param interest_Rate
	 */
	public Saving_Account(int iD, String name, double money, double interest_Rate) {
		super(iD, name, money);
		this.interest_Rate = interest_Rate;
	}
	

}
