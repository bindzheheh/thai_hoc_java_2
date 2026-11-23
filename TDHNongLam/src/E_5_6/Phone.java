package E_5_6;
/**
 * This is a class Information about a phone record (a name and a phone number)
 *@author NguyenVanThai
 *ID:2611130213
 */
public class Phone {
	/**
	 * properties
	 */
	private String name;
	private String phoneNum;
	/**
	 * constructor
	 * @param name
	 * @param phoneNum
	 */
	public Phone(String name, String phoneNum) {
		this.name = name;
		this.phoneNum = phoneNum;
	}
	/**
	 * Return the name of this record if its phone number is the given number, otherwise an empty String
	 * @param number
	 * @return name--(String)
	 * Example:
	 * Phone p1 = new Phone("bin", "1234567890");
	 * p1.isName("1234567890") => "bin"
	 * p1.isName("0987654321") => ""
	 */
	public String isName(String number) {
		if (this.phoneNum.equals(number)) {
			return this.name;
		} else {
			return "";
		}
	}
	/**
	 * Return the phone number of this record if its name is the given name, otherwise an empty String
	 * @param name
	 * @return phoneNumber--(String)
	 * Example:
	 * Phone p1 = new Phone("bin", "1234567890");
	 * p1.isPhone("bin") => "1234567890"
	 * p1.isPhone("bin2") => ""
	 */
	public String isPhone(String name) {
		if (this.name.equals(name)) {
			return this.phoneNum;
		} else {
			return "";
		}
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Phone))
			return false;
		else {
			Phone that = (Phone) obj;
			return this.name.equals(that.name) &&
					this.phoneNum.equals(that.phoneNum);
		}
	}
}