package hoc4;
import java.util.Scanner;
public class ngay20_9_2026_pytago {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		double a;
		double b;
		double c;
		System.out.println("tinh canh huyen trong tam giac vuong :");
		System.out.print("canh a :");
		a = scanner.nextDouble();
		System.out.print("canh b :");
		b = scanner.nextDouble();
		c = Math.sqrt(Math.pow(a,2)+ Math.pow(b, 2));
		System.out.print("canh c :" + c);
		scanner.close();
	}

}
