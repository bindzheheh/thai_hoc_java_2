package E_5_7;
/**
 * This is a class Information about the coffee
 *@author NguyenVanThai
 *ID:2611130213
 */
public class Coffee extends AItem {
	/**
	 * properties
	 */
	private boolean caffein;
	/**
	 * constructor
	 * @param nameBrand
	 * @param weigth
	 * @param price
	 * @param caffein
	 */
	public Coffee(String nameBrand, double weigth, double price, boolean caffein) {
		super(nameBrand, weigth, price);
		this.caffein = caffein;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !(obj instanceof Coffee))
			return false;
		else {
			Coffee that = (Coffee) obj;
			return this.nameBrand.equals(that.nameBrand) &&
					this.weigth == that.weigth &&
					this.price == that.price &&
					this.caffein == that.caffein;
		}
	}

}
