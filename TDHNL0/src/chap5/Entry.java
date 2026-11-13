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
		if (obj == null || !(obj instanceof Entry)) {
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
	
	public double getdistance() {
		return this.distance;
	}
	public boolean isEvenDay() {
		return this.date.isEvenDay();
		
	}
	public boolean isMonth(int month,int year) {
		return this.date.isMonth(month,year);
	}

	public String getComment(int month,int year) {
		// TODO Auto-generated method stub
		if (this.date.isMonth(month, year))
			return this.commen;
		else {
			return "none";
		}
	}
	public boolean rightDuration(int numOfTime) {
		if (this.duration>=numOfTime) {
			return true;
		}
		else {
			return false;
		}
	}

	
	
	
		
	

}
