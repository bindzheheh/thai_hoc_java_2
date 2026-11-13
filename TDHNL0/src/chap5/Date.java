package chap5;

public class Date {
	/**
	 * properties
	 */
	private int Day;
	private int month;
	private int year;
	/**
	 * @param day
	 * @param month
	 * @param year
	 */
	public Date(int day, int month, int year) {
		this.Day = day;
		this.month = month;
		this.year = year;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null || !(obj instanceof Date)) {
			return false;
		}
		else {
			Date that = (Date) obj;
			return (this.Day==that.Day
					&&this.month==that.month
					&&this.year==that.year);
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.Day +"/"+this.month +"/" +this.year;
	}
	public boolean isEvenDay() {
		if (this.Day%2==0)
			return true;
		return false;
		
	}
	public boolean isMonth(int month,int year) {
		return this.month==month && this.year==year;
	}
	

}
