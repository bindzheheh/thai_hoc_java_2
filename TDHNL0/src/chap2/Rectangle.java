package chap2;

public class Rectangle {
	private CartPt location;
	private int width;
	private int height;
	public Rectangle(CartPt location, int width, int height) {
		this.location=location;
		this.width=width;
		this.height=height;
	}
	public double distanceToO() {
		return this.location.distanceToO();
	}
	public double distanceToO2() {
		return this.center().distanceToO();
	}
	private CartPt center() {
		return this.location.translate(this.width/2, this.height/2);
		}

}
