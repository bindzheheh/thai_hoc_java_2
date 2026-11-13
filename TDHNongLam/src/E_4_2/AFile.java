package E_4_2;
/**
* This is a abstract class Information about the files
*@author NguyenVanThai
*ID:2611130213
*/
public abstract class AFile implements IFileCollection {
	/**
	 * properties
	 */
	protected String name;
	protected double size;
	/**
	 * constructor
	 * @param name
	 * @param size
	 */
	public AFile(String name, double size) {
		this.name = name;
		this.size = size;
	}
	

}
