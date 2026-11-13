package E_4_5;

/**
 * This is a class representing an image file.
 * @author NguyenVanThai
 * ID:2611130213
 */
public class Image extends AFile {
	/**
	 * contructor
	 */
	private double height;
	private double width; 
	private String quality;
	/**
	 * Constructor
	 */
	public Image(String name, double size, double height, double width, String quality) {
		super(name, size); 
		this.height = height; 
		this.width = width;
		this.quality = quality;
	}

}