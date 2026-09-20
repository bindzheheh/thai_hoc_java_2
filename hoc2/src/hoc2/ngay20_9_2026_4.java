package hoc2;
import java.util.Scanner;
public class ngay20_9_2026_4 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		String mathang;
		int soluong;
		double gia;
		double tong;
		String kihieu =" $";
		System.out.print("nhập tên mặt hàng :");
		mathang=scanner.nextLine();
		System.out.print("nhập số lượng :");
		soluong=scanner.nextInt();
		System.out.print("nhập giá :");
		gia =scanner.nextDouble();
		tong=gia*soluong;
		System.out.println("tên " + mathang);
		System.out.println("số lượng "+soluong);
		System.out.println("giá " +gia);
		System.out.println("tổng tiền " + tong + kihieu);
				
		
		scanner.close();
	}

}
