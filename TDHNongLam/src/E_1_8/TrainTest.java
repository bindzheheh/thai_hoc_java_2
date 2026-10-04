package E_1_8;
/**
 * make by :nguyen van thai
	2611130213
	chuong trinh kiem tra chuyen tau (train)
 */
import junit.framework.TestCase;

public class TrainTest extends TestCase {
	/**
	 *kiem tra data  cau truc 
	 *bao gom:
	 *Time:di va den (gio va phut)
	 *tuyen duong:diem di va diem den
	 *local :true or false
	 */
	public void testConstructor() {
		ClockTime time1 = new ClockTime(6,30);
		ClockTime time2 = new ClockTime(8,15);
		Schedule sche1 = new Schedule(time1,time2);
		Route ro1 = new Route("ha noi", "hai phong");
		new Train(sche1,ro1,true);
		 /**
		  * tuyen duong Ha Noi --> Hai Phong
		  * Gio di:6:30
		  * gio den:8:15
		  * local:true
		  */
		new Train(new Schedule(new ClockTime(13,5),(new ClockTime(19,45))),new Route("SaiGon","Nha Trang"),false);
	}

}
