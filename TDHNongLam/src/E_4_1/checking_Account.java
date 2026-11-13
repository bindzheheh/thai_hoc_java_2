
package E_4_1;
/**
 * 
* This is a class  Information about the checking bank account
*@author NguyenVanThai
*ID:2611130213
*/
public class checking_Account extends BankAccount{
	/**
	 * properties
	 */

	private double minimum_Balance;

	/**
	 * constructor
	 * @param iD
	 * @param name
	 * @param money
	 * @param minimum_Balance
	 */
	public checking_Account(int iD, String name, double money, double minimum_Balance) {
		super(iD, name, money);
		this.minimum_Balance = minimum_Balance;
	}
	
	

}
