package E_2_6;
/**
 * This is a class about solutions the equation has
 *@author NguyenVanThai
 *ID:2611130213
 */
public class QuadraticEquation {
	/**
	 * properties
	 */
	private double a;
	private double b;
	private double c;
	/**
	 * constructor
	 */
	public QuadraticEquation(double a,double b,double c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	/**
	 * methods
	 */
	/**
	 * method:compute Delta (b^2-4ac)
	 * @return computeDelta ---(double)
	 * Example:
	 * QuadraticEquation q1 = new QuadraticEquation(1.0, 3.0, 1.0);
	 * QuadraticEquation q2 = new QuadraticEquation(1.0, 2.0, 1.0);
	 * QuadraticEquation q3 = new QuadraticEquation(1.0, 0.0, 1.0);
	 * q1.computeDelta() => 5.0
	 * q2.computeDelta() => 0.0
	 * q3.computeDelta() => -4.0
	 */
	double computeDelta() {
		return this.b * this.b - 4 * this.a * this.c;
		}
	/**
	 * method:type of quadratic equation
	 * @return whatKind---(String)
	 * Example:
	 * QuadraticEquation q1 = new QuadraticEquation(0.0, 2.0, 1.0);
	 * QuadraticEquation q2 = new QuadraticEquation(1.0, 0.0, 1.0);
	 * QuadraticEquation q3 = new QuadraticEquation(1.0, 2.0, 1.0);
	 * QuadraticEquation q4 = new QuadraticEquation(1.0, 3.0, 1.0);
	 * q1.whatKind() => "degenerate"
	 * q2.whatKind() => "none"
	 * q3.whatKind() => "one"
	 * q4.whatKind() => "two"
	 */
	String whatKind() {
		if (this.a == 0) return "degenerate";
		double delta = this.computeDelta();
		if (delta < 0) return "none";
		if (delta == 0) return "one";
		return "two";

		}

}
