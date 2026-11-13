package E_4_4;
/**
 * This is a class Information about the Cartesian point
 *@author NguyenVanThai
 *ID:2611130213
 */
public class CartPt {
	private int x;
	private int y;
	/**
	 * constructor
	 */
	public CartPt(int x, int y) {
		this.x = x;
		this.y = y;
	}
	/**
	 * Compute the distance of this point to the origin
	 * @return distance--(double)
	 * Example:
	 * CartPt p = new CartPt(3, 4);
	 * p.distanceToO() => 5.0
	 */
	public double distanceToO() {
		return Math.sqrt(this.x * this.x + this.y * this.y);
	}
	/**
	 * Compute the distance between this point and another point
	 * @param point
	 * @return distance--(double)
	 * Example:
	 * CartPt p = new CartPt(6, 8);
	 * p.distanceTo(new CartPt(3, 4)) => 5.0
	 */
	public double distanceTo(CartPt point) {
		return Math.sqrt((this.x - point.x) * (this.x - point.x) + (this.y - point.y) * (this.y - point.y));
	}
	/**
	 * Create a new point by moving this point dx horizontally and dy vertically
	 * @return newPoint--(CartPt)
	 * @param dx
	 * @param dy
	 * Example:
	 * CartPt p = new CartPt(3, 4);
	 * p.translate(2, 5) => new CartPt(5, 9)
	 */
	public CartPt translate(int dx, int dy) {
		return new CartPt(this.x + dx, this.y + dy);
	}
	/**
	 * Get the x coordinate of this point
	 * @return x--(int)
	 * Example:
	 * CartPt p = new CartPt(3, 4);
	 * p.getX() => 3
	 */
	public int getX() {
		return this.x;
	}
	/**
	 * Get the y coordinate of this point
	 * @return y--(int)
	 * Example:
	 * CartPt p = new CartPt(3, 4);
	 * p.getY() => 4
	 */
	public int getY() {
		return this.y;
	}
	/**
	 * Check whether this point has the same coordinates as another object
	 * @return isEqual--(boolean)
	 * Example:
	 * CartPt p = new CartPt(3, 4);
	 * p.equals(new CartPt(3, 4)) => true
	 * p.equals(new CartPt(4, 3)) => false
	 */
	public boolean equals(Object obj) {
		if (null == obj || !(obj instanceof CartPt))
			return false;
		else {
			CartPt that = (CartPt) obj;
			return (this.x == that.x) && (this.y == that.y);  
		}
	}
}