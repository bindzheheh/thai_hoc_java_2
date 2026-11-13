
package E_4_1;
/**
 * 
* This is a class  Information about the CD_Account
*@author NguyenVanThai
*ID:2611130213
*/

public class CD_Account  extends BankAccount{
	/**
	 * properties
	 */
	private Date  maturity_Date;
	private double interest_Rate;
	/**
	 * constructor
	 * @param iD
	 * @param name
	 * @param money
	 * @param maturity_Date
	 * @param interest_Rate
	 */
	public CD_Account(int iD, String name, double money, Date maturity_Date, double interest_Rate) {
		super(iD, name, money);
		this.maturity_Date = maturity_Date;
		this.interest_Rate = interest_Rate;
	}


}
