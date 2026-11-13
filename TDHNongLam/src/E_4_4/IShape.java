package E_4_4;
/**
 * This is an interface Information about the shapes
 *@author NguyenVanThai
 *ID:2611130213
 */
public interface IShape {
	/**
	 * Compute the area of this shape
	 * @return area--(double)
	 */
	public double area();
	/**
	 * Compute the distance of this shape to the origin
	 * @return distance--(double)
	 */
	public double distanceToO();
	/**
	 * Check whether the given point is inside this shape
	 * @return isInside--(boolean)
	 */
	public boolean contains(CartPt point);
	/**
	 * Compute the perimeter of this shape
	 * @return perimeter--(double)
	 */
	public double perimeter();
	/**
	 * Compute the bounding box (smallest rectangle that surrounds) of this shape
	 * @return box--(Rectangle)
	 */
	public Rectangle boundingBox();
}