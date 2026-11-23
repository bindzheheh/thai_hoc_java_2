package E_5_7;
/**
 * This is a class Information about the ice cream
 *@author NguyenVanThai
 *ID:2611130213
 */
public class IceCream extends AItem {
	/**
	 * properties
	 */
	private String flavors;
	private String kind;
	/**
	 * constructor
	 * @param nameBrand
	 * @param weigth
	 * @param price
	 * @param flavors
	 * @param kind
	 */
	public IceCream(String nameBrand, double weigth, double price, String flavors, String kind) {
		super(nameBrand, weigth, price);
		this.flavors = flavors;
		this.kind = kind;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !(obj instanceof IceCream))
			return false;
		else {
			IceCream that = (IceCream) obj;
			return this.nameBrand.equals(that.nameBrand)&&
					this.weigth==that.weigth&&
					this.price==that.price&&
					this.flavors.equals(that.flavors)&&
					this.kind.equals(that.kind);
		}
	}

}
