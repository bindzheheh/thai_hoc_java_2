package E_5_7;
/**
 * This is a class Information about the juice
 *@author NguyenVanThai
 *ID:2611130213
 */
public class Juice extends AItem {
	/**
	 * properties
	 */
	private String flavors;
	private String pack;
	/**
	 * constructor
	 * @param nameBrand
	 * @param weigth
	 * @param price
	 * @param flavors
	 * @param pack
	 */
	public Juice(String nameBrand, double weigth, double price, String flavors, String pack) {
		super(nameBrand, weigth, price);
		this.flavors = flavors;
		this.pack = pack;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !(obj instanceof Juice))
			return false;
		else {
			Juice that = (Juice) obj;
			return this.nameBrand.equals(that.nameBrand)&&
					this.weigth==that.weigth&&
					this.price==that.price&&
					this.flavors.equals(that.flavors)&&
					this.pack.equals(that.pack);
		}
	}
	
	

}
