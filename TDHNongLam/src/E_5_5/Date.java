package E_5_5;
/**
 * This is a class Information about the date
 *@author NguyenVanThai
 *ID:2611130213
 */
public class Date {
	/**
	 * properties
	 */
	private int day;       
	private int month;
	private int year;
	/**
	 * constructor
	 * @param day
	 * @param month
	 * @param year
	 */
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	/**
	 * Check whether the given object is a date with the same day, month and year
	 * @param obj
	 * @return isEqual--(boolean)
	 * Example:
	 * Date d1 = new Date(23, 10, 2008);
	 * d1.equals(new Date(23, 10, 2008)) => true
	 * d1.equals(new Date(24, 10, 2008)) => false
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Date)) {
			return false;
		} else {
			Date that = (Date) obj;
			return this.day == that.day
					&& this.month == that.month
					&& this.year == that.year;
		}
	}
	/**
	 * Convert this date to a String day/month/year
	 * @return text--(String)
	 * Example:
	 * Date d1 = new Date(23, 10, 2008);
	 * d1.toString() => "23/10/2008"
	 */
	@Override
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}
	/**
	 * Check whether this date is in the given month and year
	 * @param month
	 * @param year
	 * @return isMonth--(boolean)
	 * Example:
	 * Date d1 = new Date(23, 10, 2008);
	 * d1.isMonth(10, 2008) => true
	 * d1.isMonth(10, 2009) => false
	 */
	public boolean isMonth(int month, int year) {
		return this.month == month && this.year == year;
	}
}