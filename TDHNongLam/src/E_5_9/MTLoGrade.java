package E_5_9;
/**
 * This is a class Information about the empty list of grade records
 *@author NguyenVanThai
 *ID:2611130213
 */
public class MTLoGrade implements ILoGrade {
	/**
	 * Check whether the given object is an empty list of grade records
	 * @param obj
	 * @return result--(boolean)
	 * Example:
	 * ILoGrade mt = new MTLoGrade();
	 * mt.equals(new MTLoGrade()) => true
	 * mt.equals(new ConsLoGrade(new GradeRecord(new Course(220, "Basic Programming", 2), 5.0), mt)) => false
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof MTLoGrade))
			return false;
		else {
			return true;
		}
	}
	/**
	 * Compute the total credits of this empty list (there is no record, so 0)
	 * @return totalCredit--(int)
	 * Example:
	 * ILoGrade mt = new MTLoGrade();
	 * mt.totalCredit() => 0
	 */
	@Override
	public int totalCredit() {
		return 0;
	}
	/**
	 * Compute the sum of (grade * credits) of this empty list (there is no record, so 0)
	 * @return totalPoint--(double)
	 * Example:
	 * ILoGrade mt = new MTLoGrade();
	 * mt.totalPoint() => 0.0
	 */
	@Override
	public double totalPoint() {
		return 0;
	}
	/**
	 * Produce a new empty list (there is nothing to sort)
	 * @return sortedList--(ILoGrade)
	 * Example:
	 * ILoGrade mt = new MTLoGrade();
	 * mt.sortByGradeDec() => new MTLoGrade()
	 */
	@Override
	public ILoGrade sortByGradeDec() {
		return new MTLoGrade();
	}
	/**
	 * Insert the given record into this empty list, the result has only that record
	 * @param e
	 * @return sortedList--(ILoGrade)
	 * Example:
	 * GradeRecord g2 = new GradeRecord(new Course(220, "Basic Programming", 2), 5.0);
	 * ILoGrade mt = new MTLoGrade();
	 * mt.insertInSortByGradeDec(g2) => new ConsLoGrade(g2, new MTLoGrade())
	 */
	@Override
	public ILoGrade insertInSortByGradeDec(GradeRecord e) {
		return new ConsLoGrade(e, new MTLoGrade());
	}
	/**
	 * Produce a new empty list (there is no record to keep)
	 * @param score
	 * @return higherList--(ILoGrade)
	 * Example:
	 * ILoGrade mt = new MTLoGrade();
	 * mt.higherScore(5.0) => new MTLoGrade()
	 */
	@Override
	public ILoGrade higherScore(double score) {
		return new MTLoGrade();
	}
}
