package E_4_5;

/**
 * This is a class representing a text file.
 * @author NguyenVanThai
 * ID:2611130213
 */
public class Text extends AFile {
	/**
	 * proreties
	 */
	
	private int numOfLine; 

	/**
	 * Constructor: creates a text file from the name, the size and the number of lines.
	 */
	public Text(String name, double size, int numOfLine) {
		super(name, size); 
		this.numOfLine = numOfLine; 
	}

}