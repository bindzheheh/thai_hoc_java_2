package E_2_3;
/**
 * This is a class represent information about an image
 *@author NguyenVanThai
 *ID:2611130213
 */
public class Image {
	/**
	 * properties
	 */
	private int width; // in pixels
	private int height; // in pixels
	private String source; // file name
	private String quality; // informal
	/**
	 * constructer
	 * @param width
	 * @param height
	 * @param source
	 * @param quality
	 */
	public Image(int width, int height,String source, String quality) {
			this.width = width;
			this.height = height;
			this.source = source;
			this.quality = quality;
			}
	/**
	 * method
	 */
	/**
	 * method:which determines whether the image’s height is larger than its width
	 * @return isPortrait---(boolean)
	 * Example:
	 * Image i1 = new Image(10000,5000,"idk.jpg","low");
	 * Image i2 = new Image(7500,15000,"yes.jpg","high");
	 * i1.isPortrait =>false
	 * i2.isPortrait=>true
	 */
	boolean isPortrait () {
		return this.height>this.width;
	}
	/**
	 * method:which computes how many pixels the image contains
	 * @return size--(double)
	 * Example:
	 * Image i1 = new Image(10000,5000,"idk.jpg","low");
	 * Image i2 = new Image(7500,15000,"yes.jpg","high");
	 * i1.size =>50000000
	 * i2.size =>112500000
	 */
	double size() {
		return this.width*this.height;
	}
	/**
	 * method:which determines whether one image contains more pixels than some other image
	 * @param other
	 * @return isLarger--(boolean)
	 * Example:
	 * Image i1 = new Image(10000,5000,"idk.jpg","low");
	 * Image i2 = new Image(7500,15000,"yes.jpg","high");
	 * Image i3 = new Image(6000,9000,"idk2.jpg","low");
	 * i1.isLarger(i2) =>false
	 * i1.isLarger(i3) =>false
	 * i2.isLarger(i3) =>true
	 */
	boolean isLarger(Image other) {
		return this.size()>other.size();
	}
	/**
	 * method:which determines whether this image is the same as a given one.
	 * @param other
	 * @return same --(boolean)
	 * Example:
	 * Image i1 = new Image(10000,5000,"idk.jpg","low");
	 * Image i2 = new Image(7500,15000,"yes.jpg","high");
	 * Image i3 = new Image(10000,5000,"idk.jpg","low"); 
	 * i2.same(i3) =>false
	 * i1.same(i3) => true
	 * i1.same(i2) =>false
	 */
	boolean same(Image other) {
		return (this.width==other.width
				&&this.height==other.height
				&&this.source.equals(other.source)
				&&this.quality.equals(other.quality));
	}
	/**
	 * override
	 * Example:
	 * Image i1 = new Image(10000,5000,"idk.jpg","low");
	 * Image i2 = new Image(7500,15000,"yes.jpg","high");
	 * Image i3 = new Image(10000,5000,"idk.jpg","low"); 
	 * assertEquals(i1,i3) =>true
	 * assertEquals(i1,i2) =>false
	 */
	public boolean equals(Object obj) {
		if ((null == obj) || !(obj instanceof Image)) {
			return false;
		}
		else {Image other  = (Image) obj;
		return (this.width==other.width
				&&this.height==other.height
				&&this.source.equals(other.source)
				&&this.quality.equals(other.quality));
		}
	}
	/**
	 * This is the method for determining the dimensions of an image.
	 * @return sizeString --String
	 * Example:
	 * Image i1 = new Image(10000,5000,"idk.jpg","low");
	 * Image i2 = new Image(10,500,"idk.jpg","low");
	 * Image i3 = new Image(100,5000,"idk.jpg","low"); 
	 * i1.sizeString() => "large"	
	 * i2.sizeString() => "small"
	 * i3.sizeString() => "medium"
	 */
	String sizeString() {
		if(this.size()<=10000) {
			return "small";
		}
		else {
			if(this.size()<=1000000) {
				return "medium";
			}
			else {
				return "large";
			}
		}
	}

}
