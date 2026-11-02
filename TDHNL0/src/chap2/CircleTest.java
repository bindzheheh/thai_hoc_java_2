package chap2;

import junit.framework.TestCase;

public class CircleTest extends TestCase {
	
			public void testDistanceToO() {
			Circle c1 = new Circle(new CartPt(3, 4), 5);

			Circle c2 = new Circle(new CartPt(5, 12), 10);

			Circle c3 = new Circle(new CartPt(6, 8), 20);

			assertEquals(c1.distanceToO(), 5.0, 0.001);

			assertEquals(c2.distanceToO(), 13.0, 0.001);

			assertEquals(c3.distanceToO(), 10.0, 0.001);
			
			assertEquals(c1.perimeter(), 31.416, 0.001);

			assertEquals(c2.perimeter(), 62.832, 0.001);

			assertEquals(c3.perimeter(), 125.664, 0.001);

			assertEquals(c1.area(), 78.539, 0.001);

			assertEquals(c2.area(), 314.159, 0.001);

			assertEquals(c3.area(), 1256.637, 0.001);
			
			assertEquals(c1.area(), 78.539, 0.001);

			assertEquals(c2.area(), 314.159, 0.001);

			assertEquals(c3.area(), 1256.637, 0.001);

			assertEquals(c2.area(c1), 235.619, 0.001);

			assertEquals(c3.area(c1), 1178.097, 0.001);

			assertEquals(c3.area(c2), 942.478, 0.001);

			}
	}


