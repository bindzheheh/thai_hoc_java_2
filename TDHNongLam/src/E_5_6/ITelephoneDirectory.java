package E_5_6;
/**
 * This is an interface Information about the telephone directory
 *@author NguyenVanThai
 *ID:2611130213
 */
public interface ITelephoneDirectory {
	/**
	 * Find the name that goes with the given phone number (empty String if not found)
	 * @param number
	 * @return name--(String)
	 */
	public String whoseNumber(String number);
	/**
	 * Find the phone number that goes with the given name (empty String if not found)
	 * @param name
	 * @return phoneNumber--(String)
	 */
	public String phoneNumber(String name);
}