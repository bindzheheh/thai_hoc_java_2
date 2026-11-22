package chapn1;

public class Ghe extends ASanPham{

	/**
	 * @param kichthuoc
	 * @param loaiGo
	 * @param donGia
	 */
	public Ghe(KichThuoc kichthuoc, String loaiGo, double donGia) {
		super(kichthuoc, loaiGo, donGia);
	}

	@Override
	public boolean isBan() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj==null || !(obj instanceof Ghe))
			return false;
		else {
			Ghe that =(Ghe) obj;
			return this.kichthuoc.equals(that.kichthuoc)&&
					this.loaiGo.equals(that.loaiGo)&&
					this.donGia==that.donGia;
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "tu: Kich Thuoc ("+this.kichthuoc+"),loai go :"+this .loaiGo+",Don gia:"+this.donGia;
	}
	

}