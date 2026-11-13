package E_4_4;
/**
 * This is a class Information about the Circle
 *@author NguyenVanThai
 *ID:2611130213
 */
public class Circle extends AShape {
	private int radius;
	/**
	 * constructor
	 */
	public Circle(CartPt location, int radius) {
		super(location);
		this.radius = radius;
	}
	/**
	 * Compute the area of this circle
	 * @return area--(double)
	 * Example:
	 * Circle c = new Circle(new CartPt(5, 5), 20);
	 * c.area() => 1256.64
	 */
	@Override
	public double area() {
		return Math.PI * Math.pow(this.radius, 2);
	}
	/**
	 * Check whether the given point is inside this circle (points on the edge count as inside)
	 * @return isInside--(boolean)
	 * Example:
	 * Circle c = new Circle(new CartPt(0, 0), 20);
	 * c.contains(new CartPt(4, 3)) => true
	 * c.contains(new CartPt(30, 0)) => false
	 */
	@Override
	public boolean contains(CartPt point) {
		return this.location.distanceTo(point) <= this.radius;  
	}
	/**
	 * Compute the perimeter of this circle
	 * @return perimeter--(double)
	 * Example:
	 * Circle c = new Circle(new CartPt(5, 5), 20);
	 * c.perimeter() => 125.66
	 */
	@Override
	public double perimeter() {
		return 2 * Math.PI * this.radius;
	}
	/**
	 * Compute the bounding box of this circle
	 * @return box--(Rectangle)
	 * Example:
	 * Circle c = new Circle(new CartPt(10, 30), 20);
	 * c.boundingBox() => new Rectangle(new CartPt(-10, 10), 40, 40)
	 */
	@Override
	public Rectangle boundingBox() {
		
		return new Rectangle(this.location.translate(-this.radius, -this.radius),
				this.radius * 2, this.radius * 2);
	}
}