package chapn1;

import junit.framework.TestCase;

public class ListOfSanPhamTest extends TestCase {
	public void testConstructor() {
	 KichThuoc kt1 = new KichThuoc(120, 60, 75);
	 KichThuoc kt2 = new KichThuoc(45, 45, 90);
	 KichThuoc kt3 = new KichThuoc(180, 60, 200);
	 ISanPham sp1 = new Ban(kt1, "Thong", 2500000, true);
	 ISanPham sp2 = new Ghe(kt2, "Soi", 1200000);
	 ISanPham sp3 = new Tu(kt3, "Thong", 6500000, true);
	
	MTLSanPham m1 = new MTLSanPham();
	ConsSanPham c1 = new ConsSanPham(sp1, m1);
	ConsSanPham c2 = new ConsSanPham(sp2, c1);
	ConsSanPham c3 = new ConsSanPham(sp3, c2);
	System.out.println(c3);
	}
	public void testMethod() {
		 KichThuoc kt1 = new KichThuoc(120, 60, 75);
		 KichThuoc kt2 = new KichThuoc(45, 45, 90);
		 KichThuoc kt3 = new KichThuoc(180, 60, 200);
		 ISanPham sp1 = new Ban(kt1, "Thong", 2500000, true);
		 ISanPham sp2 = new Ghe(kt2, "Soi", 1200000);
		 ISanPham sp3 = new Tu(kt3, "Thong", 6500000, true);
		 ISanPham sp4 = new Ban(kt3, "soi", 65000, false);
		 ISanPham sp5 = new Ban(kt2, "soi", 500000, false);
		
		MTLSanPham m1 = new MTLSanPham();
		ConsSanPham c1 = new ConsSanPham(sp1, m1);
		ConsSanPham c2 = new ConsSanPham(sp2, c1);
		ConsSanPham c3 = new ConsSanPham(sp3, c2);
		ConsSanPham c4 = new ConsSanPham(sp4, c3);
		ConsSanPham c5 = new ConsSanPham(sp5, c4);
		
		ConsSanPham c6 = new ConsSanPham(sp1, m1);
		ConsSanPham c7 = new ConsSanPham(sp4, c6);
		ConsSanPham c8 = new ConsSanPham(sp5, c7);
		
		
		assertEquals(c5.getDanhSachBan(), c8);
		assertEquals(c8.totalPrice(),2500000.0+ 65000.0+500000.0,0.01);
		assertEquals(c1.phiVanChuyen(), 20000.0,0.01);
		assertEquals(c2.tongPhiVanChuyen(), 40000.0,0.01);
		assertEquals(c1.phiVanChuyen(), 20000.0,0.01);
		assertEquals(c5.tongPhiVanChuyen(), 100000.0,0.01);
		System.out.println(c5);
		System.out.println("Tong phi van chuyen"+c5.tongPhiVanChuyen());
		}
}
