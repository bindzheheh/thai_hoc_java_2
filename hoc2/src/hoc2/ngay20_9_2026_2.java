package hoc2;
import java.util.Scanner;
public class ngay20_9_2026_2 {
	public static void main(String[]args) {
		double width =0;
		double hight=0;
		double area =0;
		Scanner okok = new Scanner (System.in);
		System.out.print(" width : ");
		width = okok.nextDouble();
		System.out.print(" hight : ");
		hight = okok.nextDouble();
		area =width *hight;
		System.out.print(" area : "+ area );
		
		okok.close();
	}

}
