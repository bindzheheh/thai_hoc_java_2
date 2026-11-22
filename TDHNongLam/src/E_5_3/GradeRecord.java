package E_5_3;
/**
 * This is a class Information about the grade record of a course
 *@author NguyenVanThai
 *ID:2611130213
 */
public class GradeRecord {
	/**
	 * properties
	 */
	private Course course;
	private double grade;
	/**
	 * constructor
	 * @param course
	 * @param grade
	 */
	public GradeRecord(Course course, double grade) {
		this.course = course;
		this.grade = grade;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof GradeRecord))
			return false;
		else {
			GradeRecord that = (GradeRecord) obj;
			return this.course.equals(that.course) &&
					this.grade == that.grade;
		}
	}
}