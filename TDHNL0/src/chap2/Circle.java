package chap2;

public class Circle {
	private CartPt center;
	private int radius;
	public Circle(CartPt center,int radius) {
		this.center=center;
		this.radius=radius;
	}
	public double distanceToO() {
		return this.center.distanceToO();
	}
	public double perimeter() {

		return 2 * Math.PI * this.radius;

		}
	public double area() {

		return Math.PI * this.radius * this.radius;

		}
	public double area(Circle that) {

		return Math.abs(this.area() - that.area());

		}
}
