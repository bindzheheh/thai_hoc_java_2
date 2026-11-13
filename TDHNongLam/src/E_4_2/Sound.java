package E_4_2;
/**
* This is a  class Information about the Sound
*@author NguyenVanThai
*ID:2611130213
*/
public class Sound extends AFile{
	/**
	 * properties
	 */
	private Time record;

	/**
	 * constructor
	 * @param name
	 * @param size
	 * @param record
	 */
	public Sound(String name, double size, Time record) {
		super(name, size);
		this.record = record;
	}
	

}
