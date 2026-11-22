package chapn1;

public class MTLSanPham implements ListOfSanPham {

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null || !(obj instanceof MTLSanPham))
			return false;
		else {
			return true;
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "het roi 😁😁😁";
	}

	@Override
	public ListOfSanPham getDanhSachBan() {
		// TODO Auto-generated method stub
		return new MTLSanPham();
	}

	@Override
	public double totalPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double phiVanChuyen() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double tongPhiVanChuyen() {
		// TODO Auto-generated method stub
		return 0;
	}

	

	
	
	

}
