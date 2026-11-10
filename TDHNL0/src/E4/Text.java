/**
 * 
 */
package E4;

/**
 * 
 */
public class Text extends AGallery{
	private int numberOfLines;

	/**
	 * @param fileName
	 * @param fileSize
	 * @param numberOfLines
	 */
	public Text(String fileName, int fileSize, int numberOfLines) {
		super(fileName, fileSize);
		this.numberOfLines = numberOfLines;
	}
	

}
