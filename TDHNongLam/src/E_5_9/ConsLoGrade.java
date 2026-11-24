package E_5_9;
/**
 * This is a class Information about the list of grade records that has at least one record
 *@author NguyenVanThai
 *ID:2611130213
 */
public class ConsLoGrade implements ILoGrade {
	/**
	 * properties
	 */
	private GradeRecord first;
	private ILoGrade rest;
	/**
	 * constructor
	 * @param first
	 * @param rest
	 */
	public ConsLoGrade(GradeRecord first, ILoGrade rest) {
		this.first = first;
		this.rest = rest;
	}
	/**
	 * Check whether the given object is a list with the same records in the same order
	 * @param obj
	 * @return result--(boolean)
	 * Example:
	 * GradeRecord g2 = new GradeRecord(new Course(220, "Basic Programming", 2), 5.0);
	 * ILoGrade l1 = new ConsLoGrade(g2, new MTLoGrade());
	 * l1.equals(new ConsLoGrade(g2, new MTLoGrade())) => true
	 * l1.equals(new MTLoGrade()) => false
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof ConsLoGrade))
			return false;
		else {
			ConsLoGrade that = (ConsLoGrade) obj;
			return this.first.equals(that.first) &&
					this.rest.equals(that.rest);
		}
	}
	/**
	 * Compute the total number of credits of all records in this list
	 * @return totalCredit--(int)
	 * Example:
	 * GradeRecord g1 = new GradeRecord(new Course(211, "Database Fundamentals", 3), 7.5);
	 * GradeRecord g2 = new GradeRecord(new Course(220, "Basic Programming", 2), 5.0);
	 * ILoGrade l1 = new ConsLoGrade(g2, new MTLoGrade());
	 * ILoGrade l2 = new ConsLoGrade(g1, l1);
	 * l1.totalCredit() => 2
	 * l2.totalCredit() => 5
	 */
	@Override
	public int totalCredit() {
		return this.first.getCredit() + this.rest.totalCredit();
	}
	/**
	 * Compute the sum of (grade * credits) of all records in this list
	 * @return totalPoint--(double)
	 * Example:
	 * GradeRecord g1 = new GradeRecord(new Course(211, "Database Fundamentals", 3), 7.5);
	 * GradeRecord g2 = new GradeRecord(new Course(220, "Basic Programming", 2), 5.0);
	 * ILoGrade l1 = new ConsLoGrade(g2, new MTLoGrade());
	 * ILoGrade l2 = new ConsLoGrade(g1, l1);
	 * l1.totalPoint() => 10.0
	 * l2.totalPoint() => 32.5
	 */
	@Override
	public double totalPoint() {
		return this.first.totalCourse() + this.rest.totalPoint();
	}
	/**
	 * Produce a new list of the records of this list sorted by grade, from the highest to the lowest
	 * @return sortedList--(ILoGrade)
	 * Example:
	 * GradeRecord g1 = new GradeRecord(new Course(211, "Database Fundamentals", 3), 7.5);
	 * GradeRecord g2 = new GradeRecord(new Course(220, "Basic Programming", 2), 5.0);
	 * ILoGrade l2 = new ConsLoGrade(g2, new ConsLoGrade(g1, new MTLoGrade()));
	 * l2.sortByGradeDec() => new ConsLoGrade(g1, new ConsLoGrade(g2, new MTLoGrade()))
	 */
	@Override
	public ILoGrade sortByGradeDec() {
		return this.rest.sortByGradeDec().insertInSortByGradeDec(this.first);   // sắp xếp phần còn lại rồi chèn first vào đúng chỗ
	}
	/**
	 * Insert the given record into this list (already sorted by grade decreasing) keeping the order
	 * @param e
	 * @return sortedList--(ILoGrade)
	 * Example:
	 * GradeRecord g1 = new GradeRecord(new Course(211, "Database Fundamentals", 3), 7.5);
	 * GradeRecord g2 = new GradeRecord(new Course(220, "Basic Programming", 2), 5.0);
	 * ILoGrade l1 = new ConsLoGrade(g2, new MTLoGrade());
	 * l1.insertInSortByGradeDec(g1) => new ConsLoGrade(g1, new ConsLoGrade(g2, new MTLoGrade()))
	 */
	@Override
	public ILoGrade insertInSortByGradeDec(GradeRecord e) {
		if (e.largerGrade(this.first)) {
			return new ConsLoGrade(e, this);
		}
		else {
			return new ConsLoGrade(this.first, this.rest.insertInSortByGradeDec(e));
		}
	}
	/**
	 * Produce a new list of the records of this list whose grade is greater than the given score
	 * @param score
	 * @return higherList--(ILoGrade)
	 * Example:
	 * GradeRecord g1 = new GradeRecord(new Course(211, "Database Fundamentals", 3), 7.5);
	 * GradeRecord g2 = new GradeRecord(new Course(220, "Basic Programming", 2), 5.0);
	 * ILoGrade l2 = new ConsLoGrade(g1, new ConsLoGrade(g2, new MTLoGrade()));
	 * l2.higherScore(6.0) => new ConsLoGrade(g1, new MTLoGrade())
	 * l2.higherScore(7.5) => new MTLoGrade()
	 */
	@Override
	public ILoGrade higherScore(double score) {
		if (this.first.higherScore(score)) {
			return new ConsLoGrade(this.first, this.rest.higherScore(score));
		}
		else {
			return this.rest.higherScore(score);
		}
	}
}
