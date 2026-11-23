package E_5_6;
/**
 * This is a class Information about the empty telephone directory
 *@author NguyenVanThai
 *ID:2611130213
 */
public class MTPhoneNum implements ITelephoneDirectory {
	/**
	 * Find the name that goes with the given phone number (an empty directory has none)
	 * @param number
	 * @return name--(String)
	 * Example:
	 * ITelephoneDirectory mt = new MTPhoneNum();
	 * mt.whoseNumber("1234567890") => ""
	 */
	@Override
	public String whoseNumber(String number) {
		return "";
	}
	/**
	 * Find the phone number that goes with the given name (an empty directory has none)
	 * @param name
	 * @return phoneNumber--(String)
	 * Example:
	 * ITelephoneDirectory mt = new MTPhoneNum();
	 * mt.phoneNumber("bin") => ""
	 */
	@Override
	public String phoneNumber(String name) {
		return "";
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof MTPhoneNum))
			return false;
		else {
			return true;
		}
	}
}