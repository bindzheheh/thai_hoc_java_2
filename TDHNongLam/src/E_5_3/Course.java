package E_5_3;
/**
 * This is a class Information about the course
 *@author NguyenVanThai
 *ID:2611130213
 */
public class Course {
	/**
	 * properties
	 */
	private int number;
	private String title;
	private int credits;
	/**
	 * constructor
	 * @param number
	 * @param title
	 * @param credits
	 */
	public Course(int number, String title, int credits) {
		this.number = number;
		this.title = title;
		this.credits = credits;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Course))
			return false;
		else {
			Course that = (Course) obj;
			return this.number == that.number &&
					this.title.equals(that.title) &&
					this.credits == that.credits;
		}
	}
}
