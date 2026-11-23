package E_5_7;
/**
 * This is a test program about the shopping list
 *@author NguyenVanThai
 *ID:2611130213
 */
import junit.framework.TestCase;

public class IListItemTest extends TestCase {
	/**
	 * testing for constructor
	 */
	public void testConstructor() {
		/**
		 * test class Coffee: Highland, 500 grams, 2500 cents, with caffein
		 */
		AItem c1 = new Coffee("Highland", 500, 2500, true);
		new Coffee("Trung Nguyen", 100, 300, false);
		/**
		 * test class Juice: Vinamilk, 1000 grams, 12000 cents, orange, bottled
		 */
		AItem j1 = new Juice("Vinamilk", 1000, 12000, "orange", "bottled");
		new Juice("Tropicana", 500, 4000, "apple", "canned");
		/**
		 * test class IceCream: Walls, 250 grams, 1000 cents, vanilla, regular ice cream
		 */
		AItem i1 = new IceCream("Walls", 250, 1000, "vanilla", "regular ice cream");
		new IceCream("Kido", 300, 1500, "mango", "sorbet");
		/**
		 * test class MTString and ConsString
		 */
		ILoString ms = new MTString();
		new ConsString("Highland", ms);
		/**
		 * test class MTItem and ConsItem
		 */
		IListItem mt = new MTItem();
		IListItem l1 = new ConsItem(c1, mt);
		new ConsItem(j1, l1);
	}
	/**
	 * testing for methods of the items
	 */
	public void testItemMethod() {
		Coffee c1 = new Coffee("Highland", 500, 2500, true);
		Juice j1 = new Juice("Vinamilk", 1000, 12000, "orange", "bottled");
		IceCream i1 = new IceCream("Walls", 250, 1000, "vanilla", "regular ice cream");
		/**
		 * getBrand
		 */
		assertEquals(c1.getBrand(), "Highland");
		assertEquals(j1.getBrand(), "Vinamilk");
		assertEquals(i1.getBrand(), "Walls");
		/**
		 * highPrice
		 */
		assertEquals(c1.highPrice(), 5.0, 0.01);     // 2500 / 500
		assertEquals(j1.highPrice(), 12.0, 0.01);
		assertEquals(i1.highPrice(), 4.0, 0.01);
		/**
		 * equals
		 */
		assertEquals(c1, new Coffee("Highland", 500, 2500, true));
		assertFalse(c1.equals(new Coffee("Highland", 500, 2500, false)));     // khác caffein
		assertEquals(j1, new Juice("Vinamilk", 1000, 12000, "orange", "bottled"));
		assertFalse(j1.equals(new Juice("Vinamilk", 1000, 12000, "apple", "bottled")));
		assertEquals(i1, new IceCream("Walls", 250, 1000, "vanilla", "regular ice cream"));
		assertFalse(i1.equals(c1));
	}
	/**
	 * testing for howMany method
	 */
	public void testHowMany() {
		Coffee c1 = new Coffee("Highland", 500, 2500, true);
		Juice j1 = new Juice("Vinamilk", 1000, 12000, "orange", "bottled");
		IceCream i1 = new IceCream("Walls", 250, 1000, "vanilla", "regular ice cream");
		IListItem mt = new MTItem();
		IListItem l1 = new ConsItem(c1, mt);
		IListItem l2 = new ConsItem(j1, l1);
		IListItem l3 = new ConsItem(i1, l2);
		assertEquals(mt.howMany(), 0);      // danh sách rỗng
		assertEquals(l1.howMany(), 1);
		assertEquals(l2.howMany(), 2);
		assertEquals(l3.howMany(), 3);
	}
	/**
	 * testing for brandList method
	 */
	public void testBrandList() {
		Coffee c1 = new Coffee("Highland", 500, 2500, true);
		Juice j1 = new Juice("Vinamilk", 1000, 12000, "orange", "bottled");
		IceCream i1 = new IceCream("Walls", 250, 1000, "vanilla", "regular ice cream");
		IListItem mt = new MTItem();
		IListItem l1 = new ConsItem(c1, mt);
		IListItem l3 = new ConsItem(i1, new ConsItem(j1, l1));
		assertEquals(mt.brandList(), new MTString());      // danh sách rỗng ra danh sách tên rỗng
		assertEquals(l1.brandList(), new ConsString("Highland", new MTString()));
		assertEquals(l3.brandList(), new ConsString("Walls",
				new ConsString("Vinamilk", new ConsString("Highland", new MTString()))));   // giữ nguyên thứ tự
		IListItem dup = new ConsItem(new Coffee("Highland", 100, 300, false), l1);
		assertEquals(dup.brandList(), new ConsString("Highland", new ConsString("Highland", new MTString())));   // trùng hãng vẫn giữ cả hai
	}
	/**
	 * testing for highestPrice method
	 */
	public void testHighestPrice() {
		Coffee c1 = new Coffee("Highland", 500, 2500, true);                      // 5.0
		Coffee c2 = new Coffee("Trung Nguyen", 100, 300, false);                  // 3.0
		Juice j1 = new Juice("Vinamilk", 1000, 12000, "orange", "bottled");       // 12.0
		IceCream i1 = new IceCream("Walls", 250, 1000, "vanilla", "regular ice cream");   // 4.0
		Coffee big = new Coffee("Big", 5000, 20000, true);                        // giá gốc lớn nhưng chỉ 4.0 mỗi gram
		IListItem mt = new MTItem();
		IListItem l1 = new ConsItem(c1, mt);
		assertEquals(mt.highestPrice(), 0.0, 0.01);        // danh sách rỗng
		assertEquals(l1.highestPrice(), 5.0, 0.01);        // một món
		assertEquals(new ConsItem(j1, new ConsItem(c1, mt)).highestPrice(), 12.0, 0.01);                            // cao nhất ở đầu
		assertEquals(new ConsItem(c1, new ConsItem(j1, new ConsItem(i1, mt))).highestPrice(), 12.0, 0.01);          // ở giữa
		assertEquals(new ConsItem(c2, new ConsItem(i1, new ConsItem(j1, mt))).highestPrice(), 12.0, 0.01);          // ở cuối
		assertEquals(new ConsItem(big, new ConsItem(c1, mt)).highestPrice(), 5.0, 0.01);                            // giá gốc cao nhất chưa chắc có giá đơn vị cao nhất
	}
	/**
	 * testing for equals method
	 */
	public void testEquals() {
		Coffee c1 = new Coffee("Highland", 500, 2500, true);
		Juice j1 = new Juice("Vinamilk", 1000, 12000, "orange", "bottled");
		IListItem mt = new MTItem();
		IListItem l1 = new ConsItem(c1, mt);
		IListItem l2 = new ConsItem(j1, l1);
		assertEquals(mt, new MTItem());
		assertEquals(l2, new ConsItem(new Juice("Vinamilk", 1000, 12000, "orange", "bottled"),
				new ConsItem(new Coffee("Highland", 500, 2500, true), new MTItem())));
		assertFalse(mt.equals(l1));
		assertFalse(l1.equals(l2));
		assertFalse(l2.equals(new ConsItem(c1, new ConsItem(j1, new MTItem()))));   // đảo thứ tự
		assertEquals(new MTString(), new MTString());
		assertEquals(new ConsString("a", new MTString()), new ConsString("a", new MTString()));
		assertFalse(new ConsString("a", new MTString()).equals(new MTString()));
	}
}