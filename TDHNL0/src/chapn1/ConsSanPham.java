package chapn1;

public class ConsSanPham implements ListOfSanPham {
	private ISanPham first;
	private ListOfSanPham rest;
	/**
	 * @param first
	 * @param rest
	 */
	public ConsSanPham(ISanPham first, ListOfSanPham rest) {
		this.first = first;
		this.rest = rest;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !(obj instanceof ConsSanPham))
			return false;
		else {
			ConsSanPham that =(ConsSanPham) obj;
			return this.first.equals(that.first)&&
					this.rest.equals(that.rest);
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "San pham:"+this.first+ ",Phi Van chuyen:"+this.first.tinhPhiVanChuyen()  + "\n"+this.rest ;
	}
	@Override
	public ListOfSanPham getDanhSachBan() {
		// TODO Auto-generated method stub
		if (this.first.isBan())
			return new ConsSanPham(this.first,this.rest.getDanhSachBan());
		else {
			return this.rest.getDanhSachBan();
		}
	}
	@Override
	public double totalPrice() {
		// TODO Auto-generated method stub
		return this.first.getPrice()+this.rest.totalPrice();
	}
	
	
	@Override
	public double phiVanChuyen() {
		return this.first.tinhPhiVanChuyen() ;
			
	}
	@Override
	public double tongPhiVanChuyen() {
		// TODO Auto-generated method stub
		return this.first.tinhPhiVanChuyen()+this.rest.tongPhiVanChuyen();
	}
	

}
