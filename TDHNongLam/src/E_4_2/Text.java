package E_4_2;
/**
* This is a  class Information about the text
*@author NguyenVanThai
*ID:2611130213
*/
public class Text extends AFile {
	/**
	 * properties
	 */
	private int numOfLine;

	/**
	 * constructor
	 * @param name
	 * @param size
	 * @param numOfLine
	 */
	public Text(String name, double size, int numOfLine) {
		super(name, size);
		this.numOfLine = numOfLine;
	}
	

}
