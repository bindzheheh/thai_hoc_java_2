package E_5_9;
/**
 * This is an interface Information about the list of grade records
 *@author NguyenVanThai
 *ID:2611130213
 */
public interface ILoGrade {
	/**
	 * Compute the total number of credits of all records in this list
	 * @return totalCredit--(int)
	 */
	public int totalCredit();
	/**
	 * Compute the sum of (grade * credits) of all records in this list
	 * @return totalPoint--(double)
	 */
	public double totalPoint();
	/**
	 * Produce a new list of the records of this list sorted by grade, from the highest to the lowest
	 * @return sortedList--(ILoGrade)
	 */
	public ILoGrade sortByGradeDec();
	/**
	 * Insert the given record into this list (already sorted by grade decreasing) keeping the order
	 * @param e
	 * @return sortedList--(ILoGrade)
	 */
	public ILoGrade insertInSortByGradeDec(GradeRecord e);
	/**
	 * Produce a new list of the records of this list whose grade is greater than the given score
	 * @param score
	 * @return higherList--(ILoGrade)
	 */
	public ILoGrade higherScore(double score);
}