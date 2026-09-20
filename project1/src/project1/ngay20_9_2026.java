package project1;
import java.util.Scanner;
public class ngay20_9_2026 {
	public static void main(String[]args) {
		Scanner ok = new Scanner(System.in); //nhap vao
		System.out.print("nhap ten : ");
		String name = ok.nextLine(); //cai de nhap
		System.out.print("nhap tuoi : ");
		int age = ok.nextInt(); //nếu cái string sau thì phải thêm
		ok.nextLine();
		System.out.print("nhap gioi tinh (nam/nu) : ");
		String gender = ok.nextLine();
		System.out.print("nhap tien (trieu dong) : ");
		double tien = ok.nextDouble();
		System.out.print("may co dep trai khong (true/false) : ");
		boolean isHandsome = ok.nextBoolean();
		
		System.out.println("ten ban la : " + name );
		System.out.println("tuoi cua ban : " + age );
		System.out.println("gioi tinh : " + gender );
		System.out.println("so tien cua ban la  : " + tien +" trieu dong" );
		System.out.println("may dep trai :" + isHandsome );
		
		ok.close();//dong
		if (isHandsome) {
			System.out.print("ten ban la : " + name + " " );
			System.out.print("tuoi cua ban : " + age + " ");
			System.out.print("so tien cua ban la  : " + tien +" trieu dong" + " " );
		}
		else {
			System.out.print("cút");
		}
	}

}
