package chap2;

public class Entry {
	private Date date;
	private double distance;
	private int duration;
	private String comment;
	/**
	 * @param date
	 * @param distance
	 * @param duration
	 * @param comment
	 */
	public Entry(Date date, double distance, int duration, String comment) {
		this.date = date;
		this.distance = distance;
		this.duration = duration;
		this.comment = comment;
	}
	public double total() {
		return 0;
	}

}
