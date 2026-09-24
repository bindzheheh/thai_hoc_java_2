package hoc5;
import java.util.Scanner;
public class day24_9_2026_OverloadedMethods {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		String item1;
		String item2;
		String item3;
		System.out.println("bạn mua được 3 món trong đây :\n1:thịt,cá,rau,quả\n2:trứng,sữa,gà,vịt,ghế\n3:cơm,heo,tôm,lợn");
		System.out.print("món thứ nhất bạn mua là :");
		item1=scanner.nextLine();
		System.out.print("món thứ hai bạn mua là :");
		item2=scanner.nextLine();
		System.out.print("món thứ ba bạn mua là :");
		item3=scanner.nextLine();
		if(item1.isEmpty()) {
			if(item2.isEmpty()) {
				System.out.print(add(item3));
			}
			else if (item3.isEmpty()){
				System.out.print(add(item2));
			}
			else {
				System.out.print(add(item2,item3));
			}
		}
		else if (item2.isEmpty()) {
			if(item1.isEmpty()) {
				System.out.print(add(item3));
			}
			else if (item3.isEmpty()){
				System.out.print(add(item1));
			}
			else {
				System.out.print(add(item1,item3));
			}
		}
		else if (item1.isEmpty() && item2.isEmpty() && item3.isEmpty()) {
			System.out.print("khong mua gi a");
		}
		else if (item3.isEmpty()) {
			if(item1.isEmpty()) {
				System.out.print(add(item2));
			}
			else if (item2.isEmpty()){
				System.out.print(add(item1));
			}
			else {
				System.out.print(add(item1,item2));
			}
		}
		else {
			System.out.print(add(item1,item2,item3));
		}
		
		scanner.close();
	}
	static String add (String item1) {
		return "bạn đã mua " + item1;
	}
	static String add (String item1,String item2) {
			return "bạn đã mua " + item1+ "," +item2;
	}
	static String add (String item1,String item2,String item3) {
		return "bạn đã mua " + item1+ "," +item2 +" và "+item3;
}
}
