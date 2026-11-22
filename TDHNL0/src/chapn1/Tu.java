package chapn1;

public class Tu extends ASanPham {
	private boolean coGuong;

	/**
	 * @param kichthuoc
	 * @param loaiGo
	 * @param donGia
	 * @param coGuong
	 */
	public Tu(KichThuoc kichthuoc, String loaiGo, double donGia, boolean coGuong) {
		super(kichthuoc, loaiGo, donGia);
		this.coGuong = coGuong;
	}

	@Override
	public boolean isBan() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj==null || !(obj instanceof Tu))
			return false;
		else {
			Tu that =(Tu) obj;
			return this.kichthuoc.equals(that.kichthuoc)&&
					this.loaiGo.equals(that.loaiGo)&&
					this.donGia==that.donGia&&
					this.coGuong==that.coGuong;
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "tu: Kich Thuoc ("+this.kichthuoc+"),loai go :"+this .loaiGo+",Don gia:"+this.donGia+",Co guong :"+this.coGuong;
	}
	
	
	
}
