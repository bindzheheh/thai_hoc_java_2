package E_1_5;
/**make by :nguyen van thai
2611130213
* day la class ve thong tin nha (vi tri,so phong ,...)
*/
public class House {
	/**
	 * cau truc
	 */
	String kind;
	int numberOfRooms;
	double price;
	Address address;
	House(String kind,int numberOfRooms,double price,Address address){
		this.kind=kind;
		this.numberOfRooms=numberOfRooms;
		this.price=price;
		this.address=address;
	}

}
