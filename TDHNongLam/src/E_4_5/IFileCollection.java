package E_4_5;
/**
 * This is an interface for a collection of files (text, image, sound).
 * @author NguyenVanThai
 * ID:2611130213
 */
public interface IFileCollection {
 
	/**
	 * Computes the time needed to download the file (size divided by speed).
	 * @return time--(double)
	 */
	public double timeToDownload(double bytePerSc);
 
	/**
	 * Checks whether the size of the file is smaller than the given bytes.
	 * @return result--(boolean)
	 */
	public boolean smallerThan(double bytes);
 
	/**
	 * Checks whether the name of the file is the same as the given name.
	 * @return result--(boolean)
	 */
	public boolean sameName(String nameOther);
 
}
 
