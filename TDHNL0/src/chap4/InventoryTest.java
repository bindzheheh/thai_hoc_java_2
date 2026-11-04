package chap4;

import junit.framework.TestCase;

public class InventoryTest extends TestCase {
	public void testConstructor () {
		Toy t1 = new Toy ("Doll",17.95,5);
		Toy t2 = new Toy("robot", 22.05, 3);
		Toy t3 = new Toy ("gun", 15.0, 4);
		Inventory i0 = new MTInventory();
		Inventory i1 = new ConsInventory(t1,i0);
		Inventory i2 = new ConsInventory(t2,i1);
		Inventory i3 = new ConsInventory(t3,i2);
		System.out.println(i3);
		
	}

}
