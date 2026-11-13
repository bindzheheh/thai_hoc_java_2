package E_4_2;

/**
* This is a test program about file collection
*@author NguyenVanThai
*ID:2611130213
*/
import junit.framework.TestCase;

public class IFileCollectionTest extends TestCase {
	/**
	 * testing for constructor
	 */
	public void testConstructor() {
		/**
		 * test class Image: flower.gif, size 57234 bytes, width 100 pixels, height 50 pixels, quality medium
		 */
		IFileCollection flower = new Image("flower.gif", 57234, 50, 100, "medium");
		new Image("logo.gif", 1024, 20, 20, "high");
		IFileCollection welcome = new Text("welcome.txt", 5312, 830);
		new Text("note.txt", 100, 5);
		IFileCollection theme = new Sound("theme.mp3", 40960, new Time(0, 3, 20));
		new Sound("song.mp3", 51200, new Time(0, 4, 5));
	}
	/**
	 * testing for constructor of class Time
	 */
	public void testTimeConstructor() {
		/**
		 * test class Time: 3 minutes and 20 seconds
		 */
		new Time(0, 3, 20);
		new Time(1, 0, 0);
	}

}