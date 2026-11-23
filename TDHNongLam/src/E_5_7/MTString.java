package E_5_7;
/**
 * This is a class Information about the empty list of brand names
 *@author NguyenVanThai
 *ID:2611130213
 */
public class MTString implements ILoString {
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof MTString))
			return false;
		else {
			return true;
		}
	}
}