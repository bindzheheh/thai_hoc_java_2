package chapn1;

public interface ISanPham {
	/**
	 * KichThuoc kt1 = new KichThuoc(120, 60, 75);
	 * KichThuoc kt2 = new KichThuoc(45, 45, 90);
	 * KichThuoc kt3 = new KichThuoc(180, 60, 200);
	 * ISanPham sp1 = new Ban(kt1, "Thong", 2500000, true);
	 * ISanPham sp2 = new Ghe(kt2, "Soi", 1200000);
	 * ISanPham sp3 = new Tu(kt3, "Thong", 6500000, true);
	 * sp1.getDonGia() => 2500000
	 * sp2.getDonGia() => 1200000
	 * sp3.getDonGia() => 6500000
	 */
	
	public double getDonGia();
	
	/**
	 * KichThuoc kt1 = new KichThuoc(120, 60, 75);
	 * KichThuoc kt2 = new KichThuoc(45, 45, 90);
	 * KichThuoc kt3 = new KichThuoc(180, 60, 200);
	 * ISanPham sp1 = new Ban(kt1, "Thong", 2500000, true);
	 * ISanPham sp2 = new Ghe(kt2, "Soi", 1200000);
	 * ISanPham sp3 = new Tu(kt3, "Thong", 6500000, true);
	 * sp1.isBan() => true
	 * sp2.isBan() => false
	 * sp3.isBan() => false
	 */
	public boolean isBan();

	public double getPrice();
	public double tinhPhiVanChuyen();
	
}
