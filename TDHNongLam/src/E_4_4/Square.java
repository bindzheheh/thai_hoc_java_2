package E_4_4;
/**
 * This is a class Information about the Square
 *@author NguyenVanThai
 *ID:2611130213
 */
public class Square extends AShape {
	private int size;
	/**
	 * constructor
	 */
	public Square(CartPt location, int size) {
		super(location);
		this.size = size;
	}
	/**
	 * Compute the area of this square
	 * @return area--(double)
	 * Example:
	 * Square s = new Square(new CartPt(4, 3), 30);
	 * s.area() => 900.0
	 */
	@Override
	public double area() {
		return this.size * this.size;
	}
	/**
	 * Check whether the given point is inside this square (points on the edge count as inside)
	 * @return isInside--(boolean)
	 * Example:
	 * Square s = new Square(new CartPt(100, 200), 40);
	 * s.contains(new CartPt(120, 220)) => true
	 * s.contains(new CartPt(80, 220)) => false
	 */
	@Override
	public boolean contains(CartPt point) {
		int x = this.location.getX(); 
		int y = this.location.getY();  
		return ShapeUtils.between(point.getX(), x, x + this.size)
				&& ShapeUtils.between(point.getY(), y, y + this.size);
	}
	/**
	 * Compute the perimeter of this square
	 * @return perimeter--(double)
	 * Example:
	 * Square s = new Square(new CartPt(4, 3), 30);
	 * s.perimeter() => 120.0
	 */
	@Override
	public double perimeter() {
		return this.size * 4;
	}
	/**
	 * Compute the bounding box of this square
	 * @return box--(Rectangle)
	 * Example:
	 * Square s = new Square(new CartPt(4, 3), 30);
	 * s.boundingBox() => new Rectangle(new CartPt(4, 3), 30, 30)
	 */
	@Override
	public Rectangle boundingBox() {
		return new Rectangle(this.location, this.size, this.size);   // chính nó
	}
}