package E_5_5;
/**
 * This is a class Information about the duration of a run
 *@author NguyenVanThai
 *ID:2611130213
 */
public class Time {
	/**
	 * properties
	 */
	private int hour;
	private int minute;
	/**
	 * constructor
	 * @param hour
	 * @param minute
	 */
	public Time(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}
	/**
	 * Check whether the given object is a time with the same hour and minute
	 * @param obj
	 * @return isEqual--(boolean)
	 * Example:
	 * Time t1 = new Time(1, 0);
	 * t1.equals(new Time(1, 0)) => true
	 * t1.equals(new Time(0, 30)) => false
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Time))
			return false;
		else {
			Time that = (Time) obj;
			return this.hour == that.hour &&
					this.minute == that.minute;
		}
	}
	/**
	 * Convert this time to a String
	 * @return text--(String)
	 * Example:
	 * Time t1 = new Time(1, 0);
	 * t1.toString() => "Gio chay:1,phut:0"
	 */
	@Override
	public String toString() {
		return "Gio chay:" + this.hour + ",phut:" + this.minute;
	}
	/**
	 * Convert this time to the total number of minutes
	 * @return minutes--(double)
	 * Example:
	 * Time t1 = new Time(1, 0);
	 * Time t2 = new Time(0, 30);
	 * t1.converMinute() => 60.0
	 * t2.converMinute() => 30.0
	 */
	public double converMinute() {
		return this.hour * 60 + this.minute;
	}
}