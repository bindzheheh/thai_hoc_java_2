package E_3_4;
/**
* This is a class about a date (day, month, year)
*@author NguyenVanThai
*ID:2611130213
*/
public class Date {
	private int day;
	private int month;
	private int year;
	public Date(int day,int month,int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	/**
	 * counts the number of days from this date to the given date
	 * (assumes every month has 30 days and every year has 365 days)
	 * @param that the later date
	 * @return conversionday--(int)
	 * Example:
	 * new Date(3, 11, 2026).conversionday(new Date(4, 11, 2026)) => 1
	 * new Date(10, 5, 2026).conversionday(new Date(12, 5, 2026)) => 2
	 */
	public int conversionday(Date that) {
		int daytotal;
		daytotal = that.day-this.day+(that.month-this.month)*30+(that.year-this.year)*365;
		return  daytotal;
	}

}
