package chap5;

import junit.framework.TestCase;

public class ILogTest extends TestCase {
	/**
	 * testing constructor
	 */
	public void testConstructor() {
		Date d1 = new Date (23,10,2008);
		Date d2 = new Date (24,10,2008);
		Date d3 = new Date (25,10,2008);
		/**
		 * testing list
		 */
		Entry E1 = new Entry (d1,0,"vua sinh nen chua chay",0);
		Entry E2 = new Entry (d2,100,"1 ngày tuổi chạy",1);
		Entry E3 = new Entry (d3,500,"2 ngày tuổi chạy",2);
		ILog L0 = new MTLog();
		ILog L1 = new ConsLog(E1,L0);
		ILog L2 = new ConsLog(E2,L1);
		ILog L3 = new ConsLog(E3,L2);
		/**
		 * print
		 */
		System.out.println(L3);
		
		
	}
	/**
	 * test method totalDistance
	 */
	public void testTotalDistance() {
		/** ngay chan: 24, ngay le: 23, 25, 26 la ngay chan */
		Date d1 = new Date(23, 10, 2008); // ngày lẻ
		Date d2 = new Date(24, 10, 2008); // ngày chẵn
		Date d3 = new Date(25, 10, 2008); // ngày lẻ
		Entry e1 = new Entry(d1, 0, "vua sinh nen chua chay", 0); // khoảng cách 0 (giá trị biên)
		Entry e2 = new Entry(d2, 100, "1 ngay tuoi chay", 1); // khoảng cách 100
		Entry e3 = new Entry(d3, 500, "2 ngay tuoi chay", 2); // khoảng cách 500
		/** danh sach: L0 rong, L1 co e1, L2 co e2 va e1, L3 co e3, e2, e1 */
		ILog l0 = new MTLog(); // danh sách rỗng
		ILog l1 = new ConsLog(e1, l0); // 1 phần tử
		ILog l2 = new ConsLog(e2, l1); // 2 phần tử
		ILog l3 = new ConsLog(e3, l2); // 3 phần tử

		assertEquals(l0.totalDistance(), 0, 0.01); // rỗng => 0
		assertEquals(l1.totalDistance(), 0, 0.01); // 0 + 0 = 0
		assertEquals(l2.totalDistance(), 100, 0.01); // 100 + 0 = 100
		assertEquals(l3.totalDistance(), 600, 0.01); // 500 + 100 + 0 = 600
	}

	/**
	 * test method totalEvenDayDistance
	 */
	public void testTotalEvenDayDistance() {
		/** d1, d3 la ngay le (23, 25); d2, d4 la ngay chan (24, 26) */
		Date d1 = new Date(23, 10, 2008); // ngày lẻ
		Date d2 = new Date(24, 10, 2008); // ngày chẵn
		Date d3 = new Date(25, 10, 2008); // ngày lẻ
		Date d4 = new Date(26, 10, 2008); // ngày chẵn
		Entry e1 = new Entry(d1, 0, "vua sinh nen chua chay", 0); // ngày lẻ, bị bỏ qua
		Entry e2 = new Entry(d2, 100, "1 ngay tuoi chay", 1); // ngày chẵn, được tính
		Entry e3 = new Entry(d3, 500, "2 ngay tuoi chay", 2); // ngày lẻ, bị bỏ qua
		Entry e4 = new Entry(d4, 200, "3 ngay tuoi chay", 3); // ngày chẵn, được tính
		/** danh sach: L0 rong, L1 co e1, L2 co e2, e1, L3 co e3, e2, e1, L4 co e4, e3, e2, e1 */
		ILog l0 = new MTLog(); // danh sách rỗng
		ILog l1 = new ConsLog(e1, l0); // chỉ có ngày lẻ
		ILog l2 = new ConsLog(e2, l1); // thêm ngày chẵn
		ILog l3 = new ConsLog(e3, l2); // thêm ngày lẻ
		ILog l4 = new ConsLog(e4, l3); // thêm ngày chẵn
		

		assertEquals(l0.totalEvenDayDistance(), 0, 0.01); // rỗng => 0
		assertEquals(l1.totalEvenDayDistance(), 0, 0.01); // chỉ ngày lẻ => 0
		assertEquals(l2.totalEvenDayDistance(), 100, 0.01); // chỉ tính ngày 24 => 100
		assertEquals(l3.totalEvenDayDistance(), 100, 0.01); // ngày 25 lẻ không tính => vẫn 100
		assertEquals(l4.totalEvenDayDistance(), 300, 0.01); // 200 + 100 = 300
		
	}
	/**
	 * test method totalDistanceInMonth
	 */
	public void testTotalDistanceInMonth() {
		/** e1, e2, e5 thang 10/2008; e3 thang 11/2008; e4 thang 10/2009 */
		Entry e1 = new Entry(new Date(23, 10, 2008), 0, "a", 0); // tháng 10/2008, khoảng cách 0
		Entry e2 = new Entry(new Date(24, 10, 2008), 100, "b", 1); // tháng 10/2008
		Entry e3 = new Entry(new Date(25, 11, 2008), 500, "c", 2); // khác tháng
		Entry e4 = new Entry(new Date(26, 10, 2009), 200, "d", 3); // cùng tháng nhưng khác năm
		Entry e5 = new Entry(new Date(27, 10, 2008), 50, "e", 5); // tháng 10/2008
		ILog l0 = new MTLog(); // danh sách rỗng
		ILog l1 = new ConsLog(e1, l0); // chỉ e1
		ILog l2 = new ConsLog(e2, l1); // thêm e2
		ILog l3 = new ConsLog(e3, l2); // thêm e3 (khác tháng)
		ILog l4 = new ConsLog(e4, l3); // thêm e4 (khác năm)
		ILog l5 = new ConsLog(e5, l4); // thêm e5

		assertEquals(l0.totalDistanceInMonth(10, 2008), 0, 0.01); // rỗng => 0
		assertEquals(l1.totalDistanceInMonth(10, 2008), 0, 0.01); // chỉ e1 có khoảng cách 0
		assertEquals(l2.totalDistanceInMonth(10, 2008), 100, 0.01); // 100 + 0
		assertEquals(l3.totalDistanceInMonth(10, 2008), 100, 0.01); // e3 tháng 11 không tính
		assertEquals(l4.totalDistanceInMonth(10, 2008), 100, 0.01); // e4 năm 2009 không tính
		assertEquals(l5.totalDistanceInMonth(10, 2008), 150, 0.01); // 50 + 100 + 0
		assertEquals(l5.totalDistanceInMonth(12, 2008), 0, 0.01); // tháng không có entry => 0
	}

	/**
	 * test method LogHistoryComment
	 */
	public void testLogHistoryComment() {
		Entry e1 = new Entry(new Date(23, 10, 2008), 0, "a", 0); // comment "a"
		Entry e2 = new Entry(new Date(24, 10, 2008), 100, "b", 1); // comment "b"
		Entry e3 = new Entry(new Date(25, 11, 2008), 500, "c", 2); // khác tháng
		Entry e4 = new Entry(new Date(26, 10, 2009), 200, "d", 3); // khác năm
		Entry e5 = new Entry(new Date(27, 10, 2008), 50, "e", 5); // comment "e"
		ILog l0 = new MTLog(); // danh sách rỗng
		ILog l1 = new ConsLog(e1, l0); // chỉ e1
		ILog l2 = new ConsLog(e2, l1); // thêm e2
		ILog l3 = new ConsLog(e3, l2); // thêm e3
		ILog l4 = new ConsLog(e4, l3); // thêm e4
		ILog l5 = new ConsLog(e5, l4); // thêm e5

		assertEquals(l0.LogHistoryComment(10, 2008), ""); // rỗng => chuỗi rỗng
		assertEquals(l1.LogHistoryComment(10, 2008), "a"); // chỉ "a"
		assertEquals(l3.LogHistoryComment(10, 2008), "ba"); // "c" bị bỏ vì khác tháng
		assertEquals(l5.LogHistoryComment(10, 2008), "eba"); // "d" bị bỏ vì khác năm
		assertEquals(l5.LogHistoryComment(12, 2008), ""); // tháng không có entry => rỗng
	}

	/**
	 * test method LogHistory
	 */
	public void testLogHistory() {
		Entry e1 = new Entry(new Date(23, 10, 2008), 0, "a", 0); // tháng 10/2008
		Entry e2 = new Entry(new Date(24, 10, 2008), 100, "b", 1); // tháng 10/2008
		Entry e3 = new Entry(new Date(25, 11, 2008), 500, "c", 2); // khác tháng
		Entry e4 = new Entry(new Date(26, 10, 2009), 200, "d", 3); // khác năm
		Entry e5 = new Entry(new Date(27, 10, 2008), 50, "e", 5); // tháng 10/2008
		ILog l0 = new MTLog(); // danh sách rỗng
		ILog l1 = new ConsLog(e1, l0); // chỉ e1
		ILog l2 = new ConsLog(e2, l1); // thêm e2
		ILog l3 = new ConsLog(e3, l2); // thêm e3
		ILog l4 = new ConsLog(e4, l3); // thêm e4
		ILog l5 = new ConsLog(e5, l4); // thêm e5
		/** ket qua mong doi khi loc thang 10/2008: e5, e2, e1 */
		ILog x1 = new ConsLog(e1, l0); // chỉ e1
		ILog x2 = new ConsLog(e2, x1); // e2, e1
		ILog x5 = new ConsLog(e5, x2); // e5, e2, e1

		assertTrue(l0.LogHistory(10, 2008).equals(l0)); // rỗng lọc xong vẫn rỗng
		assertTrue(l1.LogHistory(10, 2008).equals(l1)); // chỉ có e1 và e1 thỏa
		assertTrue(l3.LogHistory(10, 2008).equals(x2)); // bỏ e3
		assertTrue(l5.LogHistory(10, 2008).equals(x5)); // bỏ e3 và e4
		assertTrue(l5.LogHistory(12, 2008).equals(l0)); // không entry nào thỏa => rỗng
	}

	/**
	 * test method isDuration
	 */
	public void testIsDuration() {
		Entry e1 = new Entry(new Date(23, 10, 2008), 0, "a", 0); // duration 0
		Entry e2 = new Entry(new Date(24, 10, 2008), 100, "b", 1); // duration 1
		Entry e3 = new Entry(new Date(25, 11, 2008), 500, "c", 2); // duration 2
		Entry e4 = new Entry(new Date(26, 10, 2009), 200, "d", 3); // duration 3
		Entry e5 = new Entry(new Date(27, 10, 2008), 50, "e", 5); // duration 5
		ILog l0 = new MTLog(); // danh sách rỗng
		ILog l1 = new ConsLog(e1, l0); // chỉ e1
		ILog l2 = new ConsLog(e2, l1); // thêm e2
		ILog l3 = new ConsLog(e3, l2); // thêm e3
		ILog l4 = new ConsLog(e4, l3); // thêm e4
		ILog l5 = new ConsLog(e5, l4); // thêm e5
		/** ket qua mong doi khi loc duration >= 3: e5, e4 */
		ILog y4 = new ConsLog(e4, l0); // chỉ e4
		ILog y5 = new ConsLog(e5, y4); // e5, e4

		assertTrue(l0.isDuration(3).equals(l0)); // rỗng => rỗng
		assertTrue(l5.isDuration(3).equals(y5)); // e4 có duration đúng bằng 3 (biên) vẫn được giữ
		assertTrue(l5.isDuration(0).equals(l5)); // mọi entry đều >= 0 => giữ nguyên
		assertTrue(l5.isDuration(6).equals(l0)); // không entry nào >= 6 => rỗng
	}

}
