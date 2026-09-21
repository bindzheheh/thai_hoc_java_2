package hoc2;
import java.util.Scanner;
public class ngay21_9_2026_temperature {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		double temperature;
		double newtemperature;
		int choice;
		System.out.println("* temperature conversion program *");
		System.out.println("1:convert temperature c to f");
		System.out.println("2:convert temperature f to c");
		System.out.print("Enter your choice :");
		choice = scanner.nextInt();
		if(choice==1) {
			System.out.println("your choice 1");
			System.out.print("Enter your temperature c :");
			temperature=scanner.nextDouble();
			newtemperature = temperature*1.8 +32;
			System.out.printf("temperature f is :%.2f",newtemperature);
		}
		else if(choice==2) {
			System.out.println("your choice 2");
			System.out.print("Enter your temperature f :");
			temperature=scanner.nextDouble();
			newtemperature = 0.5555556 * (temperature-32);
			System.out.printf("temperature c is :%.2f",newtemperature);
		}
		else {
			System.out.println("Please enter the correct number.");
		}
		scanner.close();
	}

}
