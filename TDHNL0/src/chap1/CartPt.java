package chap1;
/**
 * This is the class that defines coordinate positions.
 * @author nvt
 */
public class CartPt {
	/**
	 * properties
	 */
	int x;
	int y;
	/**
	 * constructer
	 */
	CartPt(int x,int y){
		this.x=x;
		this.y=y;
	}
	/**
	 * methods
	 */
	/**
	 * This is the method used to calculate the distance from a point to the origin.
	 * @return distanceToO(double)
	 * Example:
	 * Cartpt pt1=new CartPt(5, 12)
	 *  pt1.distanceToO() =>13.0
	 */
	double distanceToO() {
		return Math.sqrt(this.x * this.x + this.y * this.y);
	}
	/**
	 * This is the method used to calculate the distance between two points on a coordinate plane.
	 * @param that
	 * @return distanceBetweenTwoPoints(double)
	 * Example:
	 * new CartPt(6, 8).distanceBetweenTwoPoints(new CartPt(3,4)) =>5
	 * CartPt pt1=new CartPt(0, 3);
	 * CartPt pt2=new CartPt(4,0));
	 * pt1.distanceBetweenTwoPoints(pt2); =>5
	 */
	double distanceBetweenTwoPoints(CartPt that) {
		return Math.sqrt((that.x - this.x)*(that.x - this.x) + (that.y - this.y)*(that.y - this.y));
	}

}
