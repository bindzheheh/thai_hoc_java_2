package chap4;

import junit.framework.TestCase;

public class InventoryTest extends TestCase {
	public void testConstructor () {
		Toy t1 = new Toy ("Doll",17.95,5);
		Toy t2 = new Toy("robot", 22.05, 3);
		Toy t3 = new Toy ("gun", 15.0, 4);
		Toy t4 = new Toy ("Doll",17.95*1.05,5);
		Toy t5 = new Toy("robot", 22.05*1.05, 3);
		Toy t6 = new Toy ("gun", 15.0*1.05, 4);
		Inventory i0 = new MTInventory();
		Inventory i1 = new ConsInventory(t1,i0);
		Inventory i2 = new ConsInventory(t2,i1);
		Inventory i3 = new ConsInventory(t3,i2);
		Inventory z0 = new MTInventory();
		Inventory z1 = new ConsInventory(t4,z0);
		Inventory z2 = new ConsInventory(t5,z0);
		Inventory z3 = new ConsInventory(t6,z0);
		System.out.println(i3);
		assertFalse(i3.contains("car"));
		assertTrue(i3.contains("gun"));
		assertFalse(i3.isBelow(5));
		assertTrue(i3.isBelow(50));
		assertEquals(0, i0.howMany());
		assertEquals(2, i2.howMany());
		assertEquals(3, i3.howMany());
		
	}

}
