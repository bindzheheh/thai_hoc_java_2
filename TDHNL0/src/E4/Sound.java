/**
 * 
 */
package E4;

/**
 * 
 */
public class Sound extends AGallery{
	private int playingTime;

	/**
	 * @param fileName
	 * @param fileSize
	 * @param playingTime
	 */
	public Sound(String fileName, int fileSize, int playingTime) {
		super(fileName, fileSize);
		this.playingTime = playingTime;
	}
	

}
