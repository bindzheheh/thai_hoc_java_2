package E_5_9;

/**
* This is a class Information about the score board of a student
*@author NguyenVanThai
*ID:2611130213
*/
public class ScoreBoard {
	/**
	 * properties
	 */
	private String name;
	private String classRoom;
	private ILoGrade loGrade;
	/**
	 * constructor
	 * @param name
	 * @param classRoom
	 * @param loGrade
	 */
	public ScoreBoard(String name, String classRoom, ILoGrade loGrade) {
		this.name = name;
		this.classRoom = classRoom;
		this.loGrade = loGrade;
	}
	/**
	 * Check whether the given object is a score board with the same name, class and grade records
	 * @param obj
	 * @return result--(boolean)
	 * Example:
	 * GradeRecord g2 = new GradeRecord(new Course(220, "Basic Programming", 2), 5.0);
	 * ScoreBoard s1 = new ScoreBoard("Tran Van Hoa", "2009", new ConsLoGrade(g2, new MTLoGrade()));
	 * s1.equals(new ScoreBoard("Tran Van Hoa", "2009", new ConsLoGrade(g2, new MTLoGrade()))) => true
	 * s1.equals(new ScoreBoard("Nguyen Van A", "2009", new ConsLoGrade(g2, new MTLoGrade()))) => false
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof ScoreBoard))
			return false;
		else {
			ScoreBoard that = (ScoreBoard) obj;
			return this.name.equals(that.name)&&
					this.classRoom.equals(that.classRoom)&&
					this.loGrade.equals(that.loGrade);
		}
	}
	/**
	 * Compute the total number of credits in this score board
	 * @return totalCredit--(int)
	 * Example:
	 * GradeRecord g1 = new GradeRecord(new Course(211, "Database Fundamentals", 3), 7.5);
	 * GradeRecord g2 = new GradeRecord(new Course(220, "Basic Programming", 2), 5.0);
	 * ScoreBoard s1 = new ScoreBoard("Tran Van Hoa", "2009", new ConsLoGrade(g1, new ConsLoGrade(g2, new MTLoGrade())));
	 * ScoreBoard s2 = new ScoreBoard("Nguyen Van A", "2010", new MTLoGrade());
	 * s1.howManyCredits() => 5
	 * s2.howManyCredits() => 0
	 */
	public int howManyCredits() {
		return this.loGrade.totalCredit();
	}
	/**
	 * Compute the sum of (grade * credits) of all courses in this score board
	 * @return totalPoint--(double)
	 * Example:
	 * GradeRecord g1 = new GradeRecord(new Course(211, "Database Fundamentals", 3), 7.5);
	 * GradeRecord g2 = new GradeRecord(new Course(220, "Basic Programming", 2), 5.0);
	 * ScoreBoard s1 = new ScoreBoard("Tran Van Hoa", "2009", new ConsLoGrade(g1, new ConsLoGrade(g2, new MTLoGrade())));
	 * s1.cumulativeTotalScore() => 32.5
	 */
	public double cumulativeTotalScore() {
		return this.loGrade.totalPoint();
	}
	/**
	 * Compute the grade average of this score board: the sum of (grade * credits) divided by the total credits
	 * @return average--(double)
	 * Example:
	 * GradeRecord g1 = new GradeRecord(new Course(211, "Database Fundamentals", 3), 7.5);
	 * GradeRecord g2 = new GradeRecord(new Course(220, "Basic Programming", 2), 5.0);
	 * ScoreBoard s1 = new ScoreBoard("Tran Van Hoa", "2009", new ConsLoGrade(g1, new ConsLoGrade(g2, new MTLoGrade())));
	 * ScoreBoard s3 = new ScoreBoard("Tran Van Hoa", "2009", new ConsLoGrade(g2, new MTLoGrade()));
	 * s1.gradeAverage() => 6.5
	 * s3.gradeAverage() => 5.0
	 */
	public double gradeAverage() {
		return this.cumulativeTotalScore() / this.howManyCredits();   // score board rỗng có 0 tín chỉ nên kết quả là NaN
	}
	/**
	 * Produce a new score board whose grade records are sorted by grade, from the highest to the lowest
	 * @return sortedScoreBoard--(ScoreBoard)
	 * Example:
	 * GradeRecord g1 = new GradeRecord(new Course(211, "Database Fundamentals", 3), 7.5);
	 * GradeRecord g2 = new GradeRecord(new Course(220, "Basic Programming", 2), 5.0);
	 * ScoreBoard s4 = new ScoreBoard("Tran Van Hoa", "2009", new ConsLoGrade(g2, new ConsLoGrade(g1, new MTLoGrade())));
	 * s4.sortByGradeDec() => new ScoreBoard("Tran Van Hoa", "2009", new ConsLoGrade(g1, new ConsLoGrade(g2, new MTLoGrade())))
	 */
	public ScoreBoard sortByGradeDec() {
		return new ScoreBoard(this.name, this.classRoom, this.loGrade.sortByGradeDec());
	}
	/**
	 * Produce a new score board that keeps only the grade records whose grade is greater than the given score
	 * @param score
	 * @return filteredScoreBoard--(ScoreBoard)
	 * Example:
	 * GradeRecord g1 = new GradeRecord(new Course(211, "Database Fundamentals", 3), 7.5);
	 * GradeRecord g2 = new GradeRecord(new Course(220, "Basic Programming", 2), 5.0);
	 * ScoreBoard s1 = new ScoreBoard("Tran Van Hoa", "2009", new ConsLoGrade(g1, new ConsLoGrade(g2, new MTLoGrade())));
	 * s1.greaterThanList(6.0) => new ScoreBoard("Tran Van Hoa", "2009", new ConsLoGrade(g1, new MTLoGrade()))
	 * s1.greaterThanList(7.5) => new ScoreBoard("Tran Van Hoa", "2009", new MTLoGrade())
	 */
	public ScoreBoard greaterThanList(double score) {
		return new ScoreBoard(this.name, this.classRoom, this.loGrade.higherScore(score));
	}
}