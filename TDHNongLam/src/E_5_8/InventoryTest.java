package E_5_8;
/**
 * This is a test program about the inventory of toys
 *@author NguyenVanThai
 *ID:2611130213
 */
import junit.framework.TestCase;

public class InventoryTest extends TestCase {
	/**
	 * testing for constructor
	 */
	public void testConstructor() {
		/**
		 * test class Toy: doll, $17.95, 5 available
		 */
		Toy doll = new Toy("doll", 17.95, 5);
		new Toy("robot", 22.05, 3);
		new Toy("gun", 15.0, 4);
		/**
		 * test class MTInventory and ConsInventory
		 */
		Inventory mt = new MTInventory();
		Inventory l1 = new ConsInventory(doll, mt);
		new ConsInventory(new Toy("robot", 22.05, 3), l1);
	}
	/**
	 * testing for methods of the Toy class
	 */
	public void testToyMethod() {
		Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05, 3);
		Toy gun = new Toy("gun", 15.0, 4);
		/**
		 * getPrice
		 */
		assertEquals(doll.getPrice(), 17.95, 0.01);
		assertEquals(robot.getPrice(), 22.05, 0.01);
		assertEquals(gun.getPrice(), 15.0, 0.01);
		/**
		 * translateName
		 */
		assertEquals(robot.translateName(), new Toy("r2d2", 22.05, 3));     // robot đổi thành r2d2
		assertEquals(doll.translateName(), new Toy("doll", 17.95, 5));
		assertEquals(new Toy("r2d2", 1.0, 1).translateName(), new Toy("r2d2", 1.0, 1));
		/**
		 * isName
		 */
		assertTrue(robot.isName("robot"));
		assertFalse(robot.isName("doll"));
		assertFalse(robot.isName("Robot"));     // phân biệt chữ hoa chữ thường
		/**
		 * equals
		 */
		assertEquals(doll, new Toy("doll", 17.95, 5));
		assertFalse(doll.equals(new Toy("gun", 17.95, 5)));
		assertFalse(doll.equals(new Toy("doll", 15.0, 5)));
		assertFalse(doll.equals(new Toy("doll", 17.95, 4)));
	}
	/**
	 * testing for totalPrice method
	 */
	public void testTotalPrice() {
		Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05, 3);
		Toy gun = new Toy("gun", 15.0, 4);
		Inventory mt = new MTInventory();
		Inventory l1 = new ConsInventory(doll, mt);
		Inventory l2 = new ConsInventory(robot, l1);
		Inventory l3 = new ConsInventory(gun, l2);
		assertEquals(mt.totalPrice(), 0.0, 0.01);     
		assertEquals(l1.totalPrice(), 17.95, 0.01);
		assertEquals(l2.totalPrice(), 40.0, 0.01);
		assertEquals(l3.totalPrice(), 55.0, 0.01);
	}
	/**
	 * testing for howMany method
	 */
	public void testHowMany() {
		Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05, 3);
		Toy gun = new Toy("gun", 15.0, 4);
		Inventory mt = new MTInventory();
		Inventory l1 = new ConsInventory(doll, mt);
		Inventory l2 = new ConsInventory(robot, l1);
		Inventory l3 = new ConsInventory(gun, l2);
		assertEquals(mt.howMany(), 0);
		assertEquals(l1.howMany(), 1);
		assertEquals(l2.howMany(), 2);
		assertEquals(l3.howMany(), 3);
	}
	/**
	 * testing for averagePrice method
	 */
	public void testAveragePrice() {
		Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05, 3);
		Toy gun = new Toy("gun", 15.0, 4);
		Inventory mt = new MTInventory();
		Inventory l1 = new ConsInventory(doll, mt);
		Inventory l2 = new ConsInventory(robot, l1);
		Inventory l3 = new ConsInventory(gun, l2);
		assertEquals(mt.averagePrice(), 0.0, 0.01);     
		assertEquals(l1.averagePrice(), 17.95, 0.01);
		assertEquals(l2.averagePrice(), 20.0, 0.01);
		assertEquals(l3.averagePrice(), 18.33, 0.01);     // 55.0 / 3
	}
	/**
	 * testing for replaceName method
	 */
	public void testReplaceName() {
		Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05, 3);
		Toy r2d2 = new Toy("r2d2", 22.05, 3);
		Inventory mt = new MTInventory();
		Inventory l1 = new ConsInventory(doll, mt);
		Inventory l2 = new ConsInventory(robot, l1);
		Inventory two = new ConsInventory(robot, new ConsInventory(doll, new ConsInventory(robot, mt)));
		assertEquals(mt.replaceName(), new MTInventory());     // danh sách rỗng
		assertEquals(l1.replaceName(), l1);     // không có robot nên giữ nguyên
		assertEquals(l2.replaceName(), new ConsInventory(r2d2, l1));
		assertEquals(two.replaceName(), new ConsInventory(r2d2, new ConsInventory(doll, new ConsInventory(r2d2, mt))));     // đổi cả hai robot, giữ thứ tự
		assertEquals(l2, new ConsInventory(robot, l1));     // danh sách cũ không bị thay đổi
	}
	/**
	 * testing for eliminate method
	 */
	public void testEliminate() {
		Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05, 3);
		Toy gun = new Toy("gun", 15.0, 4);
		Inventory mt = new MTInventory();
		Inventory l1 = new ConsInventory(doll, mt);
		Inventory l3 = new ConsInventory(gun, new ConsInventory(robot, l1));
		Inventory two = new ConsInventory(robot, new ConsInventory(doll, new ConsInventory(robot, mt)));
		assertEquals(mt.eliminate("robot"), new MTInventory());     // danh sách rỗng
		assertEquals(l1.eliminate("robot"), l1);     // không có toy trùng tên
		assertEquals(l1.eliminate("doll"), new MTInventory());     // bỏ toy duy nhất
		assertEquals(l3.eliminate("gun"), new ConsInventory(robot, l1));     // bỏ ở đầu
		assertEquals(l3.eliminate("robot"), new ConsInventory(gun, l1));     // bỏ ở giữa
		assertEquals(l3.eliminate("doll"), new ConsInventory(gun, new ConsInventory(robot, mt)));     // bỏ ở cuối
		assertEquals(two.eliminate("robot"), new ConsInventory(doll, mt));     // bỏ tất cả toy trùng tên
	}
	/**
	 * testing for equals method
	 */
	public void testEquals() {
		Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05, 3);
		Inventory mt = new MTInventory();
		Inventory l1 = new ConsInventory(doll, mt);
		Inventory l2 = new ConsInventory(robot, l1);
		assertEquals(mt, new MTInventory());
		assertEquals(l2, new ConsInventory(new Toy("robot", 22.05, 3), new ConsInventory(new Toy("doll", 17.95, 5), new MTInventory())));
		assertFalse(mt.equals(l1));
		assertFalse(l1.equals(l2));
		assertFalse(l2.equals(new ConsInventory(doll, new ConsInventory(robot, mt))));     // đảo thứ tự
	}
}
