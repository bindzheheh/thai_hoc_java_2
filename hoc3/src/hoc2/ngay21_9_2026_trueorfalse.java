package hoc2;
import java.util.Scanner;
public class ngay21_9_2026_trueorfalse {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		int score;
		int test2=20;
		System.out.print("nhap so de biet chan le :");
		number = scanner.nextInt();
		System.out.print("nhap diem cua ban :");
		score = scanner.nextInt();
		
		String EvenOrOdd = (number%2==0) ? "Even(chan)":"ODD(le)";
		System.out.println(EvenOrOdd);
		System.out.println("-----------------------------");
		String PassOrFail =(score>=5) ? "Pass":"Fail";
		System.out.println(PassOrFail);
		System.out.println("-----------------------------");
		double test = (test2>10) ? 1000 : 2000;
		System.out.println(test);
		
		scanner.close();
	}

}
