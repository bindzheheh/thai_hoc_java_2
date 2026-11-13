package E_4_4;

import junit.framework.TestCase;

public class IShapeTest extends TestCase {
	/**
	 * testing for constructor
	 */
	public void testConstructor() {
		/**
		 * test class CartPt: (3, 4)
		 */
		CartPt p1 = new CartPt(3, 4);
		new CartPt(5, 12);
		new Dot(p1);
		new Dot(new CartPt(100, 200));
		new Square(p1, 30);
		new Square(new CartPt(100, 200), 40);
		new Circle(p1, 20);
		new Circle(new CartPt(0, 0), 10);
		new Rectangle(p1, 5, 12);
		new Rectangle(new CartPt(0, 0), 10, 10);
	}
	/**
	 * testing method
	 */

	/**
	 * testing for methods of CartPt
	 */
	public void testCartPtMethod() {
		CartPt p1 = new CartPt(3, 4);
		CartPt p2 = new CartPt(5, 12);
		CartPt p3 = new CartPt(3, 4);
		/**
		 * distanceToO
		 */
		assertEquals(p1.distanceToO(), 5.0, 0.01);
		assertEquals(p2.distanceToO(), 13.0, 0.01);
		/**
		 * distanceTo
		 */
		assertEquals(new CartPt(6, 8).distanceTo(p1), 5.0, 0.01);
		assertEquals(p1.distanceTo(p3), 0.0, 0.01);             
		assertEquals(new CartPt(1, 2).distanceTo(new CartPt(5, 3)), 4.12, 0.01);
		/**
		 * translate
		 */
		assertEquals(p1.translate(2, 5), new CartPt(5, 9));
		assertEquals(p1.translate(-3, -4), new CartPt(0, 0));     
		assertEquals(p1, new CartPt(3, 4));                       
		/**
		 * getX, getY
		 */
		assertEquals(p1.getX(), 3);
		assertEquals(p1.getY(), 4);
		/**
		 * equals
		 */
		assertEquals(p1, p3);
		assertFalse(p1.equals(p2));
		assertFalse(p1.equals(new CartPt(4, 3)));                 
	}
	/**
	 * testing for methods of ShapeUtils
	 */
	public void testShapeUtilsMethod() {
		/**
		 * between
		 */
		assertTrue(ShapeUtils.between(5, 1, 10));
		assertTrue(ShapeUtils.between(1, 1, 10));               
		assertTrue(ShapeUtils.between(10, 1, 10));               
		assertFalse(ShapeUtils.between(0, 1, 10));
		assertFalse(ShapeUtils.between(11, 1, 10));
	}
	/**
	 * testing for area method
	 */
	public void testArea() {
		Dot d = new Dot(new CartPt(4, 3));
		Square s = new Square(new CartPt(4, 3), 30);
		Circle c = new Circle(new CartPt(5, 5), 20);
		Rectangle r = new Rectangle(new CartPt(3, 4), 5, 12);
		assertEquals(d.area(), 0.0, 0.01);
		assertEquals(s.area(), 900.0, 0.01);
		assertEquals(c.area(), 1256.64, 0.01);
		assertEquals(r.area(), 60.0, 0.01);
	}
	/**
	 * testing for distanceToO method
	 */
	public void testDistanceToO() {
		Dot d = new Dot(new CartPt(4, 3));
		Square s = new Square(new CartPt(4, 3), 30);
		Circle c = new Circle(new CartPt(12, 5), 20);
		Rectangle r = new Rectangle(new CartPt(3, 4), 5, 12);
		assertEquals(d.distanceToO(), 5.0, 0.01);
		assertEquals(s.distanceToO(), 5.0, 0.01);
		assertEquals(c.distanceToO(), 13.0, 0.01);
		assertEquals(r.distanceToO(), 5.0, 0.01);
	}
	/**
	 * testing for contains method
	 */
	public void testContains() {
		Dot d = new Dot(new CartPt(100, 200));
		Square s = new Square(new CartPt(100, 200), 40);
		Circle c1 = new Circle(new CartPt(0, 0), 20);
		Circle c2 = new Circle(new CartPt(0, 0), 10);
		Circle c3 = new Circle(new CartPt(0, 0), 5);
		Rectangle r = new Rectangle(new CartPt(3, 4), 5, 12);
		// Dot
		assertTrue(d.contains(new CartPt(100, 200)));
		assertFalse(d.contains(new CartPt(80, 220)));
		// Square
		assertTrue(s.contains(new CartPt(120, 220)));
		assertFalse(s.contains(new CartPt(80, 220)));
		assertTrue(s.contains(new CartPt(100, 200)));             
		assertTrue(s.contains(new CartPt(140, 240)));             
		assertFalse(s.contains(new CartPt(141, 240)));            
		// Circle
		assertTrue(c1.contains(new CartPt(4, 3)));
		assertFalse(c2.contains(new CartPt(12, 5)));            
		assertTrue(c3.contains(new CartPt(3, 4)));               
		// Rectangle
		assertTrue(r.contains(new CartPt(5, 10)));
		assertFalse(r.contains(new CartPt(9, 10)));
		assertTrue(r.contains(new CartPt(3, 4)));               
		assertTrue(r.contains(new CartPt(8, 16)));              
		assertFalse(r.contains(new CartPt(8, 17)));              
	}
	/**
	 * testing for perimeter method
	 */
	public void testPerimeter() {
		Dot d = new Dot(new CartPt(4, 3));
		Square s = new Square(new CartPt(4, 3), 30);
		Circle c = new Circle(new CartPt(5, 5), 20);
		Rectangle r = new Rectangle(new CartPt(3, 4), 5, 12);
		assertEquals(d.perimeter(), 1.0, 0.01);
		assertEquals(s.perimeter(), 120.0, 0.01);
		assertEquals(c.perimeter(), 125.66, 0.01);
		assertEquals(r.perimeter(), 34.0, 0.01);
	}
	/**
	 * testing for boundingBox method
	 */
	public void testBoundingBox() {
		Dot d = new Dot(new CartPt(5, 5));
		Square s = new Square(new CartPt(4, 3), 30);
		Circle c = new Circle(new CartPt(10, 30), 20);
		Rectangle r = new Rectangle(new CartPt(3, 4), 5, 12);
		assertEquals(d.boundingBox(), new Rectangle(new CartPt(5, 5), 0, 0));
		assertEquals(s.boundingBox(), new Rectangle(new CartPt(4, 3), 30, 30));
		assertEquals(c.boundingBox(), new Rectangle(new CartPt(-10, 10), 40, 40));
		assertEquals(r.boundingBox(), new Rectangle(new CartPt(3, 4), 5, 12));
	}
}
