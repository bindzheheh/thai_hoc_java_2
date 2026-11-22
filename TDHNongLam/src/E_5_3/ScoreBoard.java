package E_5_3;
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
}