package E_4_5;

/**
 * This is an abstract class representing a file with a name and a size.
 * @author NguyenVanThai
 * ID:2611130213
 */
public abstract class AFile implements IFileCollection {
	protected String name; 
	protected double size;
	/**
	 * Constructor: creates a file from the name and the size.
	 */
	public AFile(String name, double size) {
		this.name = name; 
		this.size = size; 
	}

	/**
	 * Computes the time needed to download this file (size divided by speed).
	 * @return time--(double)
	 * @param bytePerSc
	 * Example: 
	 * Text text = new Text("readme.txt", 2000.0, 50);
	 * text.timeToDownload(500.0) => 4.0
	 * 
	 */
	public double timeToDownload(double bytePerSc) {
		return this.size / bytePerSc; 
	}
 
	/**
	 * Checks whether the size of this file is smaller than the given bytes.
	 * @return smallerThan--(boolean)
	 * @param bytes
	 * Example:
	 * Text text = new Text("readme.txt", 2000.0, 50);
	 * text.smallerThan(3000.0) => true
	 * 
	 */
	public boolean smallerThan(double bytes) {
		return this.size < bytes; 
	}
 
	/**
	 * Checks whether the name of this file is the same as the given name.
	 * @return sameName--(boolean)
	 * Example:
	 * Text text = new Text("readme.txt", 2000.0, 50);
	 * text.sameName("readme.txt") => true
	 * 
	 */
	public boolean sameName(String nameOther) {
		return this.name.equals(nameOther); 
	}
 
}
 