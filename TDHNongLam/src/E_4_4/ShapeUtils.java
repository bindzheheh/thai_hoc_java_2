package E_4_4;
/**
 * This is a class Utilities shared by the shape classes
 *@author NguyenVanThai
 *ID:2611130213
 */
public class ShapeUtils {
	/**
	 * Check whether a value lies between low and high (both ends included)
	 * @return isBetween--(boolean)
	 * Example:
	 * ShapeUtils.between(5, 1, 10) => true
	 * ShapeUtils.between(11, 1, 10) => false
	 */
	public static boolean between(int value, int low, int high) {
		return (low <= value) && (value <= high);  
	}
}