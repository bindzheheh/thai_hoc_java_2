package chapn1;

public class Ban extends ASanPham {
	private boolean coHocTu;

	/**
	 * @param kichthuoc
	 * @param loaiGo
	 * @param donGia
	 * @param coHocTu
	 */
	public Ban(KichThuoc kichthuoc, String loaiGo, double donGia, boolean coHocTu) {
		super(kichthuoc, loaiGo, donGia);
		this.coHocTu = coHocTu;
	}

	@Override
	public boolean isBan() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj==null || !(obj instanceof Ban))
			return false;
		else {
			Ban that =(Ban) obj;
			return this.kichthuoc.equals(that.kichthuoc)&&
					this.loaiGo.equals(that.loaiGo)&&
					this.donGia==that.donGia&&
					this.coHocTu==that.coHocTu;
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Ban: Kich Thuoc ("+this.kichthuoc+"),loai go :"+this .loaiGo+",Don gia:"+this.donGia+",co hoc tu:"+this.coHocTu;
	}
	
}
