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
	public String toString() {
		// TODO Auto-generated method stub
		return this.Day +"/"+this.month +"/" +this.year;
	}
	
	

}
