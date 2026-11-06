package chap5;

public class Rectangle extends ASingleShape{
	private int width;
	private int heigh;
	/**
	 * @param width
	 * @param heigh
	 */
	/**
	 * @param location
	 * @param width
	 * @param heigh
	 */
	public Rectangle(CartPt location, int width, int heigh) {
		super(location);
		this.width = width;
		this.heigh = heigh;
	}
	

}
