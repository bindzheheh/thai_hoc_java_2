package E_4_2;
/**
* This is a  class Information about the image
*@author NguyenVanThai
*ID:2611130213
*/
public class Image extends AFile{
	/**
	 * properties
	 */
	private double height;
	private double width;
	private String quality;
	/**
	 * constructor
	 * @param name
	 * @param size
	 * @param height
	 * @param width
	 * @param quality
	 */
	public Image(String name, double size, double height, double width, String quality) {
		super(name, size);
		this.height = height;
		this.width = width;
		this.quality = quality;
	}
	

}
