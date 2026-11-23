package E_5_7;
/**
 * This is a class Information about the list of brand names that has at least one name
 *@author NguyenVanThai
 *ID:2611130213
 */
public class ConsString implements ILoString {
	/**
	 * properties
	 */
	private String first;
	private ILoString rest;
	/**
	 * constructor
	 * @param first
	 * @param rest
	 */
	public ConsString(String first, ILoString rest) {
		this.first = first;
		this.rest = rest;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof ConsString))
			return false;
		else {
			ConsString that = (ConsString) obj;
			return this.first.equals(that.first) &&
					this.rest.equals(that.rest);
		}
	}
}