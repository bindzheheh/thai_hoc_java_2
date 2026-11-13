package E_4_5;

/**
 * Test File collection
 * @author NguyenVanThai
 * ID:2611130213
 */
import junit.framework.TestCase;

public class IFileCollectionTest extends TestCase {
	/**
	 * testing constructor
	 */
	public void testTextConstructor() {
		Text text = new Text("readme.txt", 2000.0, 50); 
		Image image = new Image("photo.png", 3000.0, 600.0, 800.0, "high");
		Time record = new Time(0, 3, 30);
		Sound sound = new Sound("song.mp3", 5000.0, record);
		Time time1 = new Time(0, 3, 30);
	}
 
	/**
	 * test method
	 */
	/**
	 * test method testTimeToDownload
	 */
	public void testTimeToDownload() {
		Text text = new Text("readme.txt", 2000.0, 50);
		assertEquals(text.timeToDownload(500.0), 4.0, 0.01);
		assertEquals(text.timeToDownload(2000.0), 1.0, 0.01); 
		assertEquals(text.timeToDownload(4000.0), 0.5, 0.01); 
	}
	/**
	 * test method testSmallerThan
	 */
 

	public void testSmallerThan() {
		Text text = new Text("readme.txt", 2000.0, 50);
		assertTrue(text.smallerThan(3000.0)); 
		assertFalse(text.smallerThan(1000.0)); 
		assertFalse(text.smallerThan(2000.0));
	}
 
	/**
	 * test method testSameName
	 */
	public void testSameName() {
		Text text = new Text("readme.txt", 2000.0, 50);
		assertTrue(text.sameName("readme.txt")); 
		assertFalse(text.sameName("notes.txt")); 
	}
 
}


