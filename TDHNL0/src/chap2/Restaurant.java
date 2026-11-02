package chap2;
/**
* This is a class  Information about Restaurant
*@author NguyenVanThai
*ID:2611130213
*/
public class Restaurant {
	/**
	 * properties
	 */
	private String name;
	private String food;
	private String priceRange;
	private Intersection intersection;
	/**
	 * constructor
	 * @param name
	 * @param food
	 * @param priceRange
	 * @param intersection
	 */
	public Restaurant(String name,String food,String priceRange,Intersection intersection) {
		this.name=name;
		this.food=food;
		this.priceRange=priceRange;
		this.intersection=intersection;
	}
	/**
	 * 
	 * @param that
	 * @return closeTo
	 * Example:
	 * Restaurant r1 = new Restaurant("La Crepe", "French","moderate", new Intersection(3, 3));
	 * Restaurant r2 = new Restaurant("Das Bier", "German","cheap", new Intersection(3, 2));
	 * Restaurant r3 = new Restaurant("Sun", "Chinese","cheap", new Intersection(3, 5));
	 * r1.closeTo(r2) =>true
	 * r1.closeTo(r3) =>false
	 * r2.closeTo(r3) =>false
	 */
	public boolean closeTo(Restaurant that) {
		return this.intersection.closeTo(that.intersection);
		}

}
