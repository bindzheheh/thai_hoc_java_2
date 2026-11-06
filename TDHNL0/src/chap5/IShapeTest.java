package chap5;

import junit.framework.TestCase;

public class IShapeTest extends TestCase {
	/**
	 * testing
	 */
	public void test () {
		CartPt cart1 = new CartPt(10, 10);
		Circle c1 =new Circle(cart1,10);
		CartPt cart2 = new CartPt(20, 20);
		Square S1 = new Square(cart2, 10);
		new CompositeShape(c1,S1);
	}

}
