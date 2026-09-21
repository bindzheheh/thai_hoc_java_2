package hoc3;
import java.util.Scanner;
public class ngay21_9_2026_switch {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		int score; 
		String day;
		System.out.print("Enter your score :");
		score=scanner.nextInt();
		scanner.nextLine();
		switch(score) {
		case 1,2,3 -> System.out.println("struggling students");
		case 4,5,6 -> System.out.println("average student");
		case 7,8 -> System.out.println("above-average student");
		case 9,10 -> System.out.println("outstanding student");
		default -> System.out.println("Please enter the correct score.");
		}
		System.out.print("Enter your day :");
		day=scanner.nextLine();
		switch(day) {
		case "Monday","Tuesday","Wednesday","Thursday","Friday" ->
		System.out.printf("%s la ngay trong tuan",day);
		case "Saturday","Sunday" ->
		System.out.printf("%s la ngay cuoi tuan",day);
		default ->System.out.printf("%s khong phai la ngay nam trong tuan",day);
		}
		
		scanner.close();
	}

}
