package chap2;
/**
* This is a class  Information about Day
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
	public Date(int day, int month,
	int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	/**
	 * method
	 */
	/**
	 * method: is this date early than the other date
	 * @param that
	 * @return earlierThan
	 * Example:
	 * Date date1 = new Date(30, 6, 2003);
	 * Date date2 = new Date(1, 1, 2004);
	 * Date date3 = new Date(1, 12, 2003);
	 * Date date4 = new Date(15, 12, 2004);
	 * date1.earlierThan(date2) =>true
	 * date2.earlierThan(date3) =>false
	 * date3.earlierThan(date4) =>true
	 * 
	 */
	public boolean earlierThan(Date that) {
		if (this.year<that.year) {
			return true;
		}
		else {
			if (this.year > that.year) {
				return false;
			}
			else {
				if (this.month < that.month) {
					return true;
			}
				else {
					if (this.month > that.month) {
						return false;
			}
					else { 
						if (this.day < that.day) {
							return true; }
						else {
							return false;
						}
					}
					
					
		}		
			}
		}
	}
}

