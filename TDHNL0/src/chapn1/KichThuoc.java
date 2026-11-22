package chapn1;

public class KichThuoc {
	private double dai;
	private double rong;
	private double cao;
	/**
	 * @param dai
	 * @param rong
	 * @param cao
	 * Example:
	 * KichThuoc kt1 = new KichThuoc(120, 60, 75);
	 * KichThuoc kt2 = new KichThuoc(45, 45, 90);
	 * KichThuoc kt3 = new KichThuoc(180, 60, 200);
	 */
	public KichThuoc(double dai, double rong, double cao) {
		this.dai = dai;
		this.rong = rong;
		this.cao = cao;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj==null || !(obj instanceof KichThuoc))
			return false;
		else {
			KichThuoc that =(KichThuoc) obj;
			return this.dai==that.dai&&
					this.rong==that.rong&&
					this.cao==that.cao;
		}
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "dai:"+this.dai+",rong:"+this.rong+",cao:"+this.cao;
	}
	public double theTich() {
		// TODO Auto-generated method stub
		return this.dai*this.rong*this.cao;
	}
	
	
	
}
