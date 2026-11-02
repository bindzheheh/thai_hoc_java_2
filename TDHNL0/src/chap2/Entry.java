package chap2;
/**
* This is a class  Information about Entry
*@author NguyenVanThai
*ID:2611130213
*/
public class Entry {
	/**
	 * properties
	 */
	private Date date;
	private double distance;
	private int duration;
	private String comment;
	/**
	 * constructor
	 * @param date
	 * @param distance
	 * @param duration
	 * @param comment
	 */
	public Entry(Date date, double distance, int duration,
			String comment) {
		this.date = date;
		this.distance = distance;
		this.duration = duration;
		this.comment = comment;
	}
	/**
	 * method
	 */
	/**
	 * method:computes the pace for a daily entry
	 * @return pace
	 * Example:
	 * Entry entry1 = new Entry(new Date(5, 6, 2004), 5.3, 27, "good");
	 * entry1.pace() => 5.094
	 * Entry entry2 = new Entry(new Date(6, 6, 2004), 2.8, 24, "tired");
	 * entry2.pace() =>8.571
	 * 
	 */
	public double pace() {
		return this.duration / this.distance;
		}

}
