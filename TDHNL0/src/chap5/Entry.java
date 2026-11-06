package chap5;

public class Entry {
	/**
	 * properties
	 */
	private Date date;
	private double distance;
	private String commen;
	private int  duration;
	/**
	 * @param date
	 * @param distance
	 * @param commen
	 * @param duration
	 */
	public Entry(Date date, double distance, String commen, int duration) {
		this.date = date;
		this.distance = distance;
		this.commen = commen;
		this.duration = duration;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null || (obj instanceof Entry)) {
			return false;
		}
		else {
			Entry that = (Entry)obj;
			return (this.date.equals(that.date)
					&&this.distance==that.distance
					&&this.commen.equals(that.commen)
					&&this.duration==that.duration);
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Ngay :"+this.date.toString()+", Khoang cach :"+this.distance + ",ghi chu :"+this.commen.toString()+",Duration :"+this.duration;
	}
	
	
	

}
