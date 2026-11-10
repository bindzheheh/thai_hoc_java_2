/**
 * 
 */
package E4;

/**
 * 
 */
public class Image extends AGallery{
	/**
	 * properties
	 */
	private int height;
	private int width;
	private String quality;

	/**
	 * constructor
	 * @param fileName
	 * @param fileSize
	 * @param height
	 * @param width
	 * @param quality
	 */
	public Image(String fileName, int fileSize, int height, int width, String quality) {
		super(fileName, fileSize);
		this.height = height;
		this.width = width;
		this.quality = quality;
	}
	

}
