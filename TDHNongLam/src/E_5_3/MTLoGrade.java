package E_5_3;
/**
 * This is a class Information about the empty list of grade records
 *@author NguyenVanThai
 *ID:2611130213
 */
public class MTLoGrade implements ILoGrade {
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof MTLoGrade))
			return false;
		else {
			return true;
		}
	}

}