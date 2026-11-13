package E_4_4;
/**
 * This is an abstract class Information about the common part of the shapes
 *@author NguyenVanThai
 *ID:2611130213
 */
public abstract class AShape implements IShape {
	protected CartPt location;
	/**
	 * constructor
	 */
	public AShape(CartPt location) {
		this.location = location;
	}
	/**
	 * Compute the distance of this shape to the origin
	 * @return distance--(double)
	 * Example:
	 * Square s = new Square(new CartPt(4, 3), 30);
	 * s.distanceToO() => 5.0
	 */
	public double distanceToO() {
		return this.location.distanceToO(); 
	}
	/**
	 * Compute the area of this shape (each subclass defines it)
	 * @return area--(double)
	 */
	public abstract double area();
	/**
	 * Check whether the given point is inside this shape (each subclass defines it)
	 * @param point
	 * @return isInside--(boolean)
	 */
	public abstract boolean contains(CartPt point);
	/**
	 * Compute the perimeter of this shape (each subclass defines it)
	 * @return perimeter--(double)
	 */
	public abstract double perimeter();
	/**
	 * Compute the bounding box of this shape (each subclass defines it)
	 * @return box--(Rectangle)
	 */
	public abstract Rectangle boundingBox();
}