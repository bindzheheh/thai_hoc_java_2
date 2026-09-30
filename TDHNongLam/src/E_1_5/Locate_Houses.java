package E_1_5;
/**make by :nguyen van thai
2611130213
* day la class ve thong tin nha (vi tri,so phong ,...)
*/
public class Locate_Houses {
	/**
	 * cau truc
	 */
	String kind;
	int numberOfRooms;
	double price;
	Address address;
	Locate_Houses(String kind,int numberOfRooms,double price,Address address){
		this.kind=kind;
		this.numberOfRooms=numberOfRooms;
		this.price=price;
		this.address=address;
	}

}
