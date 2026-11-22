package E_5_5;
/**
 * This is a class Information about an entry of the runner's log
 *@author NguyenVanThai
 *ID:2611130213
 */
public class Entry {
	/**
	 * properties
	 */
	private Date date;
	private double distance;     
	private String commen;
	private Time duration;
	/**
	 * constructor
	 * @param date
	 * @param distance
	 * @param commen
	 * @param duration
	 */
	public Entry(Date date, double distance, String commen, Time duration) {
		this.date = date;
		this.distance = distance;
		this.commen = commen;
		this.duration = duration;
	}
	/**
	 * Check whether the given object is an entry with the same date, distance, comment and duration
	 * @param obj
	 * @return isEqual--(boolean)
	 * Example:
	 * Entry e2 = new Entry(new Date(24, 10, 2008), 10, "b", new Time(0, 30));
	 * e2.equals(new Entry(new Date(24, 10, 2008), 10, "b", new Time(0, 30))) => true
	 * e2.equals(new Entry(new Date(24, 10, 2008), 15, "b", new Time(0, 30))) => false
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Entry)) {
			return false;
		} else {
			Entry that = (Entry) obj;
			return this.date.equals(that.date)
					&& this.distance == that.distance
					&& this.commen.equals(that.commen)
					&& this.duration.equals(that.duration);
		}
	}
	/**
	 * Convert this entry to a String (date, distance, comment, duration and speed)
	 * @return text--(String)
	 * Example:
	 * Entry e1 = new Entry(new Date(23, 10, 2008), 0, "a", new Time(1, 0));
	 * e1.toString() => "Ngay :23/10/2008, Khoang cach :0.0,ghi chu :a,Duration :(Gio chay:1,phut:0)toc do tren phut :0.0mile/phut"
	 */
	@Override
	public String toString() {
		return "Ngay :" + this.date.toString() + ", Khoang cach :" + this.distance
				+ ",ghi chu :" + this.commen + ",Duration :(" + this.duration + ")"
				+ "toc do tren phut :" + this.distance / this.duration.converMinute() + "mile/phut";
	}
	/**
	 * Get the distance of this entry
	 * @return distance--(double)
	 * Example:
	 * Entry e2 = new Entry(new Date(24, 10, 2008), 10, "b", new Time(0, 30));
	 * e2.getDistance() => 10.0
	 */
	public double getDistance() {
		return this.distance;
	}
	/**
	 * Check whether this entry is in the given month and year
	 * @param month
	 * @param year
	 * @return isMonth--(boolean)
	 * Example:
	 * Entry e2 = new Entry(new Date(24, 10, 2008), 10, "b", new Time(0, 30));
	 * e2.isMonth(10, 2008) => true
	 * e2.isMonth(11, 2008) => false
	 */
	public boolean isMonth(int month, int year) {
		return this.date.isMonth(month, year);
	}
	/**
	 * Check whether the speed (distance per minute) of this entry is larger than or equal to the other entry
	 * @param that
	 * @return isLarger--(boolean)
	 * Example:
	 * Entry e2 = new Entry(new Date(24, 10, 2008), 10, "b", new Time(0, 30));
	 * Entry e3 = new Entry(new Date(25, 10, 2008), 25, "c", new Time(0, 45));
	 * e3.hasDistanceOnMinuteLarger(e2) => true
	 * e2.hasDistanceOnMinuteLarger(e3) => false
	 */
	public boolean hasDistanceOnMinuteLarger(Entry that) {
		return this.distance / this.duration.converMinute() >= that.distance / that.duration.converMinute();
	}
}