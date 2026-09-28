package hoc7;
import java.util.Scanner;
public class Day27_9_2026_quizgame {
	static Scanner scanner =new Scanner(System.in);
	public static void main(String[]args) {
		int dem=0;
		String[] cauhoi= {
				"I.người viết code có đẹp trai không:"
				,"II.Người viết code là :"
				,"III.Bạn có phải gay không ?😏:"
				,"IV.Bạn cảm thấy như thế nào về người viết code:"
				,"V.Tạm biệt và ?:"
		};
		String[][] dapan= {{"1.có","2.Kó","3.Không","4.bình thường"},
						   {"1.gái","2.trai","3.gay","4.miễn sướng là được"},
						   {"1.Kó","2.có","3.không","4.tạm tạm"},
						   {"1.ngưỡng mộ","2.bình thường","3.khinh thường","4.senpai"},
						   {"1.không hẹn gặp lại","2.hẹn gặp lại","3.bỏ trống","4.chơi tiếp"}
						   
		
		};
		int chon;
		System.out.println("chơi trò chơi nhé ");
		System.out.println("không chơi cũng phải chơi");
		int[]dapandung= {1,2,1,4,4};
		for(int i=0;i<cauhoi.length;i++) {
			System.out.println(cauhoi[i]);
			for(String dapan1:dapan[i]) {
				System.out.println(dapan1);
			}
			System.out.print("chọn đáp án đi :");
			chon=scanner.nextInt();
			if(chon==dapandung[i]) {
				System.out.println("chuẩn rồi");
				dem++;
			}
			else {
				System.out.println("sai rồi ");
			}
		}
		System.out.printf("số đáp án đúng %d trên 5",dem);
		scanner.close();
	}

}
