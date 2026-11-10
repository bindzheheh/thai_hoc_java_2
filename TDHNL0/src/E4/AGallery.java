/**
 * 
 */
package E4;

/**
 * 
 */
public abstract class AGallery {
	/**
	 * properties
	 */
	protected String fileName;
	protected int fileSize;
	/**
	 * constructor
	 * @param fileName
	 * @param fileSize
	 */
	public AGallery(String fileName, int fileSize) {
		this.fileName = fileName;
		this.fileSize = fileSize;
	}
	/**
	 * method
	 */
	/**
	 * 
	 * @param networkSpeed
	 * @return timeToDownLoad
	 */
	public double timeToDownLoad(double networkSpeed) {
		return this.fileSize/ networkSpeed;
		}
	/**
	 * 
	 * @param maximumSize
	 * @return smallerThan
	 */
	public boolean smallerThan(int maximumSize){
		return this.fileSize < maximumSize;
		}
	/**
	 * 
	 * @param givenName
	 * @return sameName
	 */
	public boolean sameName(String givenName){
		return this.fileName.equals(givenName);
		}

}
