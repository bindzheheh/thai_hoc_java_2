package chap2;

public class Intersection {
	/**
	 * properties
	 */
	private int avenue;
	private int street;
	/**
	 * constructor
	 * @param avenue
	 * @param street
	 */
	public Intersection(int avenue,int street) {
		this.avenue=avenue;
		this.street=street;
		
	}
	/**
	 * method
	 */
	/**
	 * This is the method for determining the nearest point.
	 * @param that
	 * @return closeTo
	 * example:
	 * Intersection i1 = new Intersection(3, 3);
	 * Intersection i2 = new Intersection(3, 2);
	 * Intersection i3 = new Intersection(3, 5);
	 * i1.closeTo(i2) =>true
	 * i1.closeTo(i3) =>false
	 */
	public boolean closeTo(Intersection that) {
		return (Math.abs(this.avenue - that.avenue) <= 1) &&
		(Math.abs(this.street - that.street) <= 1);
		}

}
