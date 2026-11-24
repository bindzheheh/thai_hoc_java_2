package E_5_9;
/**
 * This is a test program about the score board
 *@author NguyenVanThai
 *ID:2611130213
 */
import junit.framework.TestCase;

public class ScoreBoardTest extends TestCase {
	/**
	 * testing for constructor
	 */
	public void testConstructor() {
		/**
		 * test class Course: 211, Database Fundamentals, 3 credits
		 */
		Course c1 = new Course(211, "Database Fundamentals", 3);
		new Course(220, "Basic Programming", 2);
		/**
		 * test class GradeRecord: course 211, grade 7.5
		 */
		GradeRecord g1 = new GradeRecord(c1, 7.5);
		new GradeRecord(new Course(690, "Algorithms", 4), 7.0);
		/**
		 * test class MTLoGrade and ConsLoGrade
		 */
		ILoGrade mt = new MTLoGrade();
		ILoGrade l1 = new ConsLoGrade(g1, mt);
		new ConsLoGrade(new GradeRecord(new Course(721, "Data Structure", 4), 8.0), l1);
		/**
		 * test class ScoreBoard: Tran Van Hoa, class 2009, one grade record
		 */
		new ScoreBoard("Tran Van Hoa", "2009", l1);
		new ScoreBoard("Nguyen Van A", "2010", new MTLoGrade());
	}
	/**
	 * testing for methods of Course and GradeRecord class
	 */
	public void testCourseAndGradeRecordMethod() {
		Course c1 = new Course(211, "Database Fundamentals", 3);
		Course c2 = new Course(220, "Basic Programming", 2);
		GradeRecord g1 = new GradeRecord(c1, 7.5);
		GradeRecord g2 = new GradeRecord(c2, 5.0);
		/**
		 * Course: getCredit
		 */
		assertEquals(c1.getCredit(), 3);
		assertEquals(c2.getCredit(), 2);
		/**
		 * Course: equals
		 */
		assertEquals(c1, new Course(211, "Database Fundamentals", 3));
		assertFalse(c1.equals(c2));
		assertFalse(c1.equals(new Course(212, "Database Fundamentals", 3)));
		assertFalse(c1.equals(new Course(211, "Database", 3)));
		assertFalse(c1.equals(new Course(211, "Database Fundamentals", 2)));
		/**
		 * GradeRecord: getCredit
		 */
		assertEquals(g1.getCredit(), 3);
		assertEquals(g2.getCredit(), 2);
		/**
		 * GradeRecord: totalCourse
		 */
		assertEquals(g1.totalCourse(), 22.5, 0.01);
		assertEquals(g2.totalCourse(), 10.0, 0.01);
		/**
		 * GradeRecord: largerGrade
		 */
		assertTrue(g1.largerGrade(g2));
		assertFalse(g2.largerGrade(g1));
		assertFalse(g1.largerGrade(new GradeRecord(c2, 7.5)));     // bằng điểm thì không lớn hơn
		/**
		 * GradeRecord: higherScore
		 */
		assertTrue(g1.higherScore(7.0));
		assertFalse(g1.higherScore(7.5));     // bằng điểm thì không lớn hơn
		assertFalse(g1.higherScore(8.0));
		/**
		 * GradeRecord: equals
		 */
		assertEquals(g1, new GradeRecord(new Course(211, "Database Fundamentals", 3), 7.5));
		assertFalse(g1.equals(new GradeRecord(c1, 5.0)));
		assertFalse(g1.equals(g2));
	}
	/**
	 * testing for methods of the list of grade records
	 */
	public void testLoGradeMethod() {
		GradeRecord g1 = new GradeRecord(new Course(211, "Database Fundamentals", 3), 7.5);
		GradeRecord g2 = new GradeRecord(new Course(220, "Basic Programming", 2), 5.0);
		GradeRecord g3 = new GradeRecord(new Course(690, "Algorithms", 4), 7.0);
		ILoGrade mt = new MTLoGrade();
		ILoGrade l1 = new ConsLoGrade(g1, mt);
		ILoGrade l3 = new ConsLoGrade(g1, new ConsLoGrade(g2, new ConsLoGrade(g3, mt)));
		/**
		 * totalCredit
		 */
		assertEquals(mt.totalCredit(), 0);
		assertEquals(l1.totalCredit(), 3);
		assertEquals(l3.totalCredit(), 9);
		/**
		 * totalPoint
		 */
		assertEquals(mt.totalPoint(), 0.0, 0.01);
		assertEquals(l1.totalPoint(), 22.5, 0.01);
		assertEquals(l3.totalPoint(), 60.5, 0.01);     // 22.5 + 10 + 28
		/**
		 * insertInSortByGradeDec
		 */
		assertEquals(mt.insertInSortByGradeDec(g1), l1);
		assertEquals(l1.insertInSortByGradeDec(g2), new ConsLoGrade(g1, new ConsLoGrade(g2, mt)));     // chèn vào cuối
		assertEquals(l1.insertInSortByGradeDec(g3), new ConsLoGrade(g1, new ConsLoGrade(g3, mt)));
		assertEquals(new ConsLoGrade(g1, new ConsLoGrade(g2, mt)).insertInSortByGradeDec(g3),
				new ConsLoGrade(g1, new ConsLoGrade(g3, new ConsLoGrade(g2, mt))));     // chèn vào giữa
		assertEquals(new ConsLoGrade(g3, mt).insertInSortByGradeDec(g1), new ConsLoGrade(g1, new ConsLoGrade(g3, mt)));   // chèn vào đầu
		/**
		 * sortByGradeDec
		 */
		assertEquals(mt.sortByGradeDec(), new MTLoGrade());
		assertEquals(l1.sortByGradeDec(), l1);
		assertEquals(l3.sortByGradeDec(), new ConsLoGrade(g1, new ConsLoGrade(g3, new ConsLoGrade(g2, mt))));
		/**
		 * higherScore
		 */
		assertEquals(mt.higherScore(5.0), new MTLoGrade());
		assertEquals(l3.higherScore(7.0), new ConsLoGrade(g1, mt));     // 7.0 không lớn hơn 7.0
		assertEquals(l3.higherScore(4.0), l3);
		assertEquals(l3.higherScore(9.0), new MTLoGrade());
		/**
		 * equals
		 */
		assertEquals(mt, new MTLoGrade());
		assertEquals(l1, new ConsLoGrade(g1, new MTLoGrade()));
		assertFalse(mt.equals(l1));
		assertFalse(l1.equals(mt));
		assertFalse(new ConsLoGrade(g1, new ConsLoGrade(g2, mt)).equals(new ConsLoGrade(g2, new ConsLoGrade(g1, mt))));     // đảo thứ tự
	}
	/**
	 * testing for howManyCredits method
	 */
	public void testHowManyCredits() {
		GradeRecord g1 = new GradeRecord(new Course(211, "Database Fundamentals", 3), 7.5);
		GradeRecord g2 = new GradeRecord(new Course(220, "Basic Programming", 2), 5.0);
		GradeRecord g3 = new GradeRecord(new Course(690, "Algorithms", 4), 7.0);
		GradeRecord g4 = new GradeRecord(new Course(721, "Data Structure", 4), 8.0);
		ScoreBoard empty = new ScoreBoard("Nguyen Van A", "2010", new MTLoGrade());
		ScoreBoard s1 = new ScoreBoard("Tran Van Hoa", "2009", new ConsLoGrade(g1, new MTLoGrade()));
		ScoreBoard all = new ScoreBoard("Tran Van Hoa", "2009", new ConsLoGrade(g1, new ConsLoGrade(g2,
				new ConsLoGrade(g3, new ConsLoGrade(g4, new MTLoGrade())))));
		assertEquals(empty.howManyCredits(), 0);
		assertEquals(s1.howManyCredits(), 3);
		assertEquals(all.howManyCredits(), 13);
	}
	/**
	 * testing for cumulativeTotalScore method
	 */
	public void testCumulativeTotalScore() {
		GradeRecord g1 = new GradeRecord(new Course(211, "Database Fundamentals", 3), 7.5);
		GradeRecord g2 = new GradeRecord(new Course(220, "Basic Programming", 2), 5.0);
		GradeRecord g3 = new GradeRecord(new Course(690, "Algorithms", 4), 7.0);
		GradeRecord g4 = new GradeRecord(new Course(721, "Data Structure", 4), 8.0);
		ScoreBoard empty = new ScoreBoard("Nguyen Van A", "2010", new MTLoGrade());
		ScoreBoard s1 = new ScoreBoard("Tran Van Hoa", "2009", new ConsLoGrade(g1, new MTLoGrade()));
		ScoreBoard all = new ScoreBoard("Tran Van Hoa", "2009", new ConsLoGrade(g1, new ConsLoGrade(g2,
				new ConsLoGrade(g3, new ConsLoGrade(g4, new MTLoGrade())))));
		assertEquals(empty.cumulativeTotalScore(), 0.0, 0.01);
		assertEquals(s1.cumulativeTotalScore(), 22.5, 0.01);
		assertEquals(all.cumulativeTotalScore(), 92.5, 0.01);     // 22.5 + 10 + 28 + 32
	}
	/**
	 * testing for gradeAverage method
	 */
	public void testGradeAverage() {
		GradeRecord g1 = new GradeRecord(new Course(211, "Database Fundamentals", 3), 7.5);
		GradeRecord g2 = new GradeRecord(new Course(220, "Basic Programming", 2), 5.0);
		GradeRecord g3 = new GradeRecord(new Course(690, "Algorithms", 4), 7.0);
		GradeRecord g4 = new GradeRecord(new Course(721, "Data Structure", 4), 8.0);
		ScoreBoard s1 = new ScoreBoard("Tran Van Hoa", "2009", new ConsLoGrade(g2, new MTLoGrade()));
		ScoreBoard s2 = new ScoreBoard("Tran Van Hoa", "2009", new ConsLoGrade(g1, new ConsLoGrade(g2, new MTLoGrade())));
		ScoreBoard all = new ScoreBoard("Tran Van Hoa", "2009", new ConsLoGrade(g1, new ConsLoGrade(g2,
				new ConsLoGrade(g3, new ConsLoGrade(g4, new MTLoGrade())))));
		assertEquals(s1.gradeAverage(), 5.0, 0.01);     // một môn thì điểm trung bình là điểm môn đó
		assertEquals(s2.gradeAverage(), 6.5, 0.01);     // 32.5 / 5
		assertEquals(all.gradeAverage(), 7.12, 0.01);     // 92.5 / 13
	}
	/**
	 * testing for sortByGradeDec method
	 */
	public void testSortByGradeDec() {
		GradeRecord g1 = new GradeRecord(new Course(211, "Database Fundamentals", 3), 7.5);
		GradeRecord g2 = new GradeRecord(new Course(220, "Basic Programming", 2), 5.0);
		GradeRecord g3 = new GradeRecord(new Course(690, "Algorithms", 4), 7.0);
		GradeRecord g4 = new GradeRecord(new Course(721, "Data Structure", 4), 8.0);
		ScoreBoard empty = new ScoreBoard("Nguyen Van A", "2010", new MTLoGrade());
		ScoreBoard s1 = new ScoreBoard("Tran Van Hoa", "2009", new ConsLoGrade(g1, new MTLoGrade()));
		ScoreBoard all = new ScoreBoard("Tran Van Hoa", "2009", new ConsLoGrade(g1, new ConsLoGrade(g2,
				new ConsLoGrade(g3, new ConsLoGrade(g4, new MTLoGrade())))));
		ScoreBoard sorted = new ScoreBoard("Tran Van Hoa", "2009", new ConsLoGrade(g4, new ConsLoGrade(g1,
				new ConsLoGrade(g3, new ConsLoGrade(g2, new MTLoGrade())))));
		assertEquals(empty.sortByGradeDec(), empty);     // score board rỗng
		assertEquals(s1.sortByGradeDec(), s1);     // một môn
		assertEquals(all.sortByGradeDec(), sorted);
		assertEquals(sorted.sortByGradeDec(), sorted);     // đã sắp xếp rồi thì giữ nguyên
	}
	/**
	 * testing for greaterThanList method
	 */
	public void testGreaterThanList() {
		GradeRecord g1 = new GradeRecord(new Course(211, "Database Fundamentals", 3), 7.5);
		GradeRecord g2 = new GradeRecord(new Course(220, "Basic Programming", 2), 5.0);
		GradeRecord g3 = new GradeRecord(new Course(690, "Algorithms", 4), 7.0);
		GradeRecord g4 = new GradeRecord(new Course(721, "Data Structure", 4), 8.0);
		ScoreBoard empty = new ScoreBoard("Nguyen Van A", "2010", new MTLoGrade());
		ScoreBoard all = new ScoreBoard("Tran Van Hoa", "2009", new ConsLoGrade(g1, new ConsLoGrade(g2,
				new ConsLoGrade(g3, new ConsLoGrade(g4, new MTLoGrade())))));
		assertEquals(empty.greaterThanList(5.0), empty);     // score board rỗng
		assertEquals(all.greaterThanList(7.0), new ScoreBoard("Tran Van Hoa", "2009",
				new ConsLoGrade(g1, new ConsLoGrade(g4, new MTLoGrade()))));     // 7.0 không lớn hơn 7.0
		assertEquals(all.greaterThanList(7.5), new ScoreBoard("Tran Van Hoa", "2009",
				new ConsLoGrade(g4, new MTLoGrade())));
		assertEquals(all.greaterThanList(8.0), new ScoreBoard("Tran Van Hoa", "2009", new MTLoGrade()));     // không có môn nào
		assertEquals(all.greaterThanList(4.0), all);     // giữ lại tất cả
	}
	/**
	 * testing for equals method
	 */
	public void testEquals() {
		GradeRecord g1 = new GradeRecord(new Course(211, "Database Fundamentals", 3), 7.5);
		ILoGrade l1 = new ConsLoGrade(g1, new MTLoGrade());
		ScoreBoard s1 = new ScoreBoard("Tran Van Hoa", "2009", l1);
		assertEquals(s1, new ScoreBoard("Tran Van Hoa", "2009", new ConsLoGrade(g1, new MTLoGrade())));
		assertFalse(s1.equals(new ScoreBoard("Nguyen Van A", "2009", l1)));     // khác tên
		assertFalse(s1.equals(new ScoreBoard("Tran Van Hoa", "2010", l1)));     // khác khóa
		assertFalse(s1.equals(new ScoreBoard("Tran Van Hoa", "2009", new MTLoGrade())));     // khác danh sách điểm
	}
}
