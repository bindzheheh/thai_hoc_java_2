package E_5_6;
/**
 * This is a class Information about the telephone directory that has at least one phone record
 *@author NguyenVanThai
 *ID:2611130213
 */
public class ConsPhoneNum implements ITelephoneDirectory {
	/**
	 * properties
	 */
	private Phone first;
	private ITelephoneDirectory rest;
	/**
	 * constructor
	 * @param first
	 * @param rest
	 */
	public ConsPhoneNum(Phone first, ITelephoneDirectory rest) {
		this.first = first;
		this.rest = rest;
	}
	/**
	 * Find the name that goes with the given phone number (the first one found, empty String if not found)
	 * @param number
	 * @return name--(String)
	 * Example:
	 * Phone p1 = new Phone("bin", "1234567890");
	 * Phone p2 = new Phone("bin2", "0987654321");
	 * ITelephoneDirectory l2 = new ConsPhoneNum(p2, new ConsPhoneNum(p1, new MTPhoneNum()));
	 * l2.whoseNumber("1234567890") => "bin"
	 * l2.whoseNumber("0000000000") => ""
	 */
	@Override
	public String whoseNumber(String number) {
		String name = this.first.isName(number);
		if (name.equals("")) {                    
			return this.rest.whoseNumber(number);
		} else {
			return name;                          
		}
	}
	/**
	 * Find the phone number that goes with the given name (the first one found, empty String if not found)
	 * @param name
	 * @return phoneNumber--(String)
	 * Example:
	 * Phone p1 = new Phone("bin", "1234567890");
	 * Phone p2 = new Phone("bin2", "0987654321");
	 * ITelephoneDirectory l2 = new ConsPhoneNum(p2, new ConsPhoneNum(p1, new MTPhoneNum()));
	 * l2.phoneNumber("bin2") => "0987654321"
	 * l2.phoneNumber("nobody") => ""
	 */
	@Override
	public String phoneNumber(String name) {
		String number = this.first.isPhone(name);
		if (number.equals("")) {
			return this.rest.phoneNumber(name);
		} else {
			return number;
		}
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof ConsPhoneNum))
			return false;
		else {
			ConsPhoneNum that = (ConsPhoneNum) obj;
			return this.first.equals(that.first) &&
					this.rest.equals(that.rest);
		}
	}
}