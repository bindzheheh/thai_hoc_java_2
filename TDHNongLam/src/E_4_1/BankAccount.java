
package E_4_1;
/**
 * 
* This is a class  Information about the many bank account
*@author NguyenVanThai
*ID:2611130213
*/
public abstract class BankAccount implements ABank {
	/**
	 * properties
	 */
	protected int ID;
	protected String name;
	protected double money;
	/**
	 * constructor
	 * @param iD
	 * @param name
	 * @param money
	 */
	public BankAccount(int iD, String name, double money) {
		this.ID = iD;
		this.name = name;
		this.money = money;
	}
	

}
