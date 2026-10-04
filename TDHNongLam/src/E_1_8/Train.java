package E_1_8;
/**make by :nguyen van thai
2611130213
* day la class de luu thong tin chuyến tàu (train)
*/
public class Train {
	/**
	 * cau truc
	 */
	Schedule schedule;
	Route route;
	boolean local;
	Train(Schedule schedule,Route route,boolean local){
		this.schedule=schedule;
		this.route=route;
		this.local=local;
	}

}
