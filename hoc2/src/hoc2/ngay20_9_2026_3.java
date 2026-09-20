package hoc2;
import java.util.Scanner;
public class ngay20_9_2026_3 {
	public static void main(String[]args) {
		Scanner check = new Scanner(System.in);
		String chungu1;
		String chungu2;
		String chungu3;
		String dongtu1;
		String dongtu2;
		String tinhtu1;
		String tinhtu2;
		String trangtu1;
		System.out.print("nhập cá thể 1 :");
		chungu1 = check.nextLine();
		System.out.print("nhập cá thể 2 :");
		chungu2 = check.nextLine();
		System.out.print("nhập cá thể 3 :");
		chungu3 = check.nextLine();
		System.out.print("nhập hành động 1");
		dongtu1 = check.nextLine();
		System.out.print("nhập hành động 2");
		dongtu2 = check.nextLine();
		System.out.print("nhập cảm giác 1");
		tinhtu1 = check.nextLine();
		System.out.print("nhập cảm giác 2");
		tinhtu2 = check.nextLine();
		System.out.print("nhập thời điểm ");
		trangtu1 = check.nextLine();
		
		
		
		System.out.println("vào buổi " + trangtu1 + " " + chungu2 + " rất " + tinhtu1 );
		System.out.println(chungu2 +" cùng " + chungu3 + " " +dongtu1 );
		System.out.println(chungu1 + " tới và nhìn thấy " + chungu2 +" cùng " + chungu3 + " đang " +dongtu1  );
		System.out.println(chungu1 +" cảm thấy mình "+tinhtu2);
		System.out.println("nên " + chungu1 + " quyết định " + dongtu2);
		check.close();
	}

}
