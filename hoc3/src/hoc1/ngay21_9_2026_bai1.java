package hoc1;
import java.util.Scanner;
public class ngay21_9_2026_bai1 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		double money;
		double phantram;
		int chuki;
		int sonam;
		double tong;
		System.out.println("so tien ban dau :");
		money=scanner.nextDouble();
		System.out.println("phan tram :");
		phantram=scanner.nextDouble() / 100;
		System.out.println("so chu ki nhan moi nam  :");
		chuki=scanner.nextInt();
		System.out.println("so nam gui :");
		sonam=scanner.nextInt();
		
		tong = money * Math.pow(1+phantram/chuki,sonam*chuki);
		System.out.printf("so tien nhan duoc sau %d nam la :%.1f",sonam,tong);
		scanner.close();
	}

}
