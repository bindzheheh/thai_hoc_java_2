package E_5_9;

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
	/**
	 * Check whether the given object is a course with the same number, title and credits
	 * @param obj
	 * @return result--(boolean)
	 * Example:
	 * Course c1 = new Course(211, "Database Fundamentals", 3);
	 * c1.equals(new Course(211, "Database Fundamentals", 3)) => true
	 * c1.equals(new Course(220, "Basic Programming", 2)) => false
	 */
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
	/**
	 * Get the number of credits of this course
	 * @return credits--(int)
	 * Example:
	 * Course c1 = new Course(211, "Database Fundamentals", 3);
	 * Course c2 = new Course(220, "Basic Programming", 2);
	 * c1.getCredit() => 3
	 * c2.getCredit() => 2
	 */
	public int getCredit() {
		return this.credits;
	}
}
