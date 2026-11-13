package E_4_4;
/**
 * This is a class Information about the Rectangle
 *@author NguyenVanThai
 *ID:2611130213
 */
public class Rectangle extends AShape {
	private int width;
	private int height;
	/**
	 * constructor
	 */
	public Rectangle(CartPt location, int width, int height) {
		super(location);
		this.width = width;
		this.height = height;
	}
	/**
	 * Compute the area of this rectangle
	 * @return area--(double)
	 * Example:
	 * Rectangle r = new Rectangle(new CartPt(3, 4), 5, 12);
	 * r.area() => 60.0
	 */
	@Override
	public double area() {
		return this.width * this.height;
	}
	/**
	 * Check whether the given point is inside this rectangle (points on the edge count as inside)
	 * @return isInside--(boolean)
	 * Example:
	 * Rectangle r = new Rectangle(new CartPt(3, 4), 5, 12);
	 * r.contains(new CartPt(5, 10)) => true
	 * r.contains(new CartPt(9, 10)) => false
	 */
	
	@Override
	public boolean contains(CartPt point) {
		int thisX = this.location.getX();   
		int thisY = this.location.getY();   
		return ShapeUtils.between(point.getX(), thisX, thisX + this.width)
				&& ShapeUtils.between(point.getY(), thisY, thisY + this.height);
	}
	/**
	 * Compute the perimeter of this rectangle
	 * @return perimeter--(double)
	 * Example:
	 * Rectangle r = new Rectangle(new CartPt(3, 4), 5, 12);
	 * r.perimeter() => 34.0
	 */
	@Override
	public double perimeter() {
		return this.width * 2 + this.height * 2;
	}
	/**
	 * Compute the bounding box of this rectangle
	 * @return box--(Rectangle)
	 * Example:
	 * Rectangle r = new Rectangle(new CartPt(3, 4), 5, 12);
	 * r.boundingBox() => new Rectangle(new CartPt(3, 4), 5, 12)
	 */
	@Override
	public Rectangle boundingBox() {
		return new Rectangle(this.location, this.width, this.height);   //  chính nó
	}
	/**
	 * Check whether this rectangle is the same as another object
	 * @return isEqual--(boolean)
	 * Example:
	 * Rectangle r = new Rectangle(new CartPt(3, 4), 5, 12);
	 * r.equals(new Rectangle(new CartPt(3, 4), 5, 12)) => true
	 * r.equals(new Rectangle(new CartPt(3, 4), 5, 10)) => false
	 */
	public boolean equals(Object obj) {
		if (null == obj || !(obj instanceof Rectangle))
			return false;
		else {
			Rectangle that = (Rectangle) obj;
			return this.location.equals(that.location)   
					&& this.width == that.width
					&& this.height == that.height;
		}
	}
}