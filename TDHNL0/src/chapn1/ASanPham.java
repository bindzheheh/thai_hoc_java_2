package chapn1;

public abstract class ASanPham implements ISanPham {
	protected KichThuoc kichthuoc;
	protected String loaiGo;
	protected double donGia;
	/**
	 * @param kichthuoc
	 * @param loaiGo
	 * @param donGia
	 */
	public ASanPham(KichThuoc kichthuoc, String loaiGo, double donGia) {
		this.kichthuoc = kichthuoc;
		this.loaiGo = loaiGo;
		this.donGia = donGia;
	}
	@Override
	public double getDonGia() {
		// TODO Auto-generated method stub
		return this.donGia;
	}
	public double getPrice() {
		return this.donGia;
	}
	public double tinhPhiVanChuyen() {
		if (this.kichthuoc.theTich()<500)
			return 5000;
		if(this.kichthuoc.theTich()>=500 && this.kichthuoc.theTich()<=1000)
			return 10000;
		else {
			return 20000;
		}
	}
	
	
}
	
	
