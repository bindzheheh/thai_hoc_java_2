package E_5_3;
/**
 * This is a class Information about the list of grade records that has at least one record
 *@author NguyenVanThai
 *ID:2611130213
 */
public class ConsLoGrade implements ILoGrade {
	/**
	 * properties
	 */
	private GradeRecord first;
	private ILoGrade rest;
	/**
	 * constructor
	 * @param first
	 * @param rest
	 */
	public ConsLoGrade(GradeRecord first, ILoGrade rest) {
		this.first = first;
		this.rest = rest;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof ConsLoGrade))
			return false;
		else {
			ConsLoGrade that = (ConsLoGrade) obj;
			return this.first.equals(that.first) &&
					this.rest.equals(that.rest);
		}
	}
}