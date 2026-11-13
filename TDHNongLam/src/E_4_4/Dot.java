package E_4_4;
/**
 * This is a class Information about the Dot
 *@author NguyenVanThai
 *ID:2611130213
 */
public class Dot extends AShape {
	/**
	 * constructor
	 */
	public Dot(CartPt location) {
		super(location);
	}
	/**
	 * Compute the area of this dot
	 * @return area--(double)
	 * Example:
	 * Dot d = new Dot(new CartPt(4, 3));
	 * d.area() => 0.0
	 */
	@Override
	public double area() {
		return 0;
	}
	/**
	 * Check whether the given point is the same point as this dot
	 * @return isInside--(boolean)
	 * Example:
	 * Dot d = new Dot(new CartPt(100, 200));
	 * d.contains(new CartPt(100, 200)) => true
	 * d.contains(new CartPt(80, 220)) => false
	 */
	@Override
	public boolean contains(CartPt point) {
		return this.location.distanceTo(point) == 0.0;   // khoảng cách bằng 0 
	}
	/**
	 * Compute the perimeter of this dot
	 * @return perimeter--(double)
	 * Example:
	 * Dot d = new Dot(new CartPt(4, 3));
	 * d.perimeter() => 1.0
	 */
	@Override
	public double perimeter() {
		return 1;
	}
	/**
	 * Compute the bounding box of this dot
	 * @return box--(Rectangle)
	 * Example:
	 * Dot d = new Dot(new CartPt(5, 5));
	 * d.boundingBox() => new Rectangle(new CartPt(5, 5), 0, 0)
	 */
	@Override
	public Rectangle boundingBox() {
		return new Rectangle(this.location, 0, 0); 
	}
}