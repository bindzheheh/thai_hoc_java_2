package E_5_9;
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
	/**
	 * Check whether the given object is a grade record with the same course and grade
	 * @param obj
	 * @return result--(boolean)
	 * Example:
	 * Course c1 = new Course(211, "Database Fundamentals", 3);
	 * GradeRecord g1 = new GradeRecord(c1, 7.5);
	 * g1.equals(new GradeRecord(new Course(211, "Database Fundamentals", 3), 7.5)) => true
	 * g1.equals(new GradeRecord(c1, 5.0)) => false
	 */
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
	/**
	 * Get the number of credits of the course in this record
	 * @return credits--(int)
	 * Example:
	 * GradeRecord g1 = new GradeRecord(new Course(211, "Database Fundamentals", 3), 7.5);
	 * GradeRecord g2 = new GradeRecord(new Course(220, "Basic Programming", 2), 5.0);
	 * g1.getCredit() => 3
	 * g2.getCredit() => 2
	 */
	public int getCredit() {
		return this.course.getCredit();
	}
	/**
	 * Compute the grade multiplied by the credits of this record
	 * @return point--(double)
	 * Example:
	 * GradeRecord g1 = new GradeRecord(new Course(211, "Database Fundamentals", 3), 7.5);
	 * GradeRecord g2 = new GradeRecord(new Course(220, "Basic Programming", 2), 5.0);
	 * g1.totalCourse() => 22.5
	 * g2.totalCourse() => 10.0
	 */
	public double totalCourse() {
		return this.getCredit() * this.grade;
	}
	/**
	 * Check whether the grade of this record is larger than the grade of the given record
	 * @param that
	 * @return result--(boolean)
	 * Example:
	 * GradeRecord g1 = new GradeRecord(new Course(211, "Database Fundamentals", 3), 7.5);
	 * GradeRecord g2 = new GradeRecord(new Course(220, "Basic Programming", 2), 5.0);
	 * g1.largerGrade(g2) => true
	 * g2.largerGrade(g1) => false
	 */
	public boolean largerGrade(GradeRecord that) {
		return this.grade > that.grade;
	}
	/**
	 * Check whether the grade of this record is greater than the given score
	 * @param score
	 * @return result--(boolean)
	 * Example:
	 * GradeRecord g1 = new GradeRecord(new Course(211, "Database Fundamentals", 3), 7.5);
	 * g1.higherScore(7.0) => true
	 * g1.higherScore(7.5) => false
	 */
	public boolean higherScore(double score) {
		return this.grade > score;
	}
}
