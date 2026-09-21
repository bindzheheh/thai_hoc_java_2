package hoc3;
import java.util.Scanner;
public class ngay21_9_2026_length {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		double newlength;
		String unit;
		double length;
		System.out.println("length conversion program from cm to inch or vice versa. ");
		System.out.print("Enter your length :");
		length = scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Enter the unit you want to convert to (cm/inch) :");
		unit = scanner.nextLine();
		
		
		newlength = (unit.equals("cm")) ? length/2.54:length*2.54;
		System.out.printf("độ dài là %.2f %s",newlength,unit);
		
		
		
		scanner.close();
	}

}
