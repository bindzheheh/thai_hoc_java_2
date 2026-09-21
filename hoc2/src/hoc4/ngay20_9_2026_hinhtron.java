package hoc4;
import java.util.Scanner;
public class ngay20_9_2026_hinhtron {
	public static void main(String[]args) {
		Scanner scanner  = new Scanner(System.in);
		double bankinh;
		double chuvi;
		double dientich;
		double thetichhinhcau;
		System.out.print("nhap ban kinh :");
		bankinh=scanner.nextDouble();
		chuvi = 2* Math.PI *bankinh;
		dientich = Math.PI * Math.pow(bankinh, 2);
		thetichhinhcau = (4/3) * Math.PI * Math.pow(bankinh, 3);
		System.out.println("chu vi hinh tron la :" + chuvi + " cm");
		System.out.printf("chu vi hinh tron la : %.1fcm\n",  chuvi );
		System.out.println("dien tich hinh tron la :" + dientich + " cm2");
		System.out.printf("dien tich hinh tron la : %.1fcm2\n",  dientich );
		System.out.println("the tich hinh cau la :" + thetichhinhcau + " cm3");
		System.out.printf("the tich hinh cau la : %.1fcm3\n",  thetichhinhcau );
					//co chu f
		
		
		
		
		
		
		
		scanner.close();
	}

}
