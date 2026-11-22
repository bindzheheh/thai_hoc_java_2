package E_5_3;
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
	public void testALL() {
		/**
		 * test class Course: 211 Database Fundamentals 3 credits, 220 Basic Programming 2 credits
		 */
		Course c1 = new Course(211, "Database Fundamentals", 3);
		Course c2 = new Course(220, "Basic Programming", 2);
		Course c3 = new Course(690, "Algorithms", 4);
		Course c4 = new Course(721, "Data Structure", 4);
		/**
		 * test class GradeRecord: 211 has grade 7.5, 220 has grade 5.0
		 */
		GradeRecord g1 = new GradeRecord(c1, 7.5);
		GradeRecord g2 = new GradeRecord(c2, 5.0);
		GradeRecord g3 = new GradeRecord(c3, 7.0);
		GradeRecord g4 = new GradeRecord(c4, 8.0);
		/**
		 * test class MTLoGrade and ConsLoGrade
		 */
		ILoGrade mt = new MTLoGrade();
		ILoGrade l1 = new ConsLoGrade(g4, mt);
		ILoGrade l2 = new ConsLoGrade(g3, l1);
		ILoGrade l3 = new ConsLoGrade(g2, l2);
		ILoGrade l4 = new ConsLoGrade(g1, l3);
		ILoGrade all = new ConsLoGrade(g1, new ConsLoGrade(g2,
				new ConsLoGrade(g3, new ConsLoGrade(g4, new MTLoGrade()))));
		/**
		 * test class ScoreBoard: Tran Van Hoa, class 2009, 4 grade records
		 */
		ScoreBoard s1 = new ScoreBoard("Tran Van Hoa", "2009", l4);
		new ScoreBoard("Tran Van Hoa", "2009", all);
		new ScoreBoard("Nguyen Van A", "2010", new MTLoGrade());   
		assertEquals(c1, new Course(211, "Database Fundamentals", 3));
		assertEquals(mt, new MTLoGrade());
		assertEquals(l1, new ConsLoGrade(g4, new MTLoGrade()));
	}
}