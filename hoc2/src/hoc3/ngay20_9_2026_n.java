package hoc3;
import java.util.Scanner;
public class ngay20_9_2026_n {
	public static void main(String[]args) {
		int age;
		String name;
		boolean deptrai;
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhap ten :");
		name = scanner.nextLine();
		System.out.print("nhap tuoi :");
		age = scanner.nextInt();
		System.out.print("dep trai khong (true/false) :");
		deptrai = scanner.nextBoolean();
		
		if(name.isEmpty()) {
			System.out.println("biet nhap ten khong ?");
		}
		else {
			System.out.println("ten may la " + name + " va " + age + " tuoi");
		}
		
		
		
		
		//menh de lon hon dung truoc
		if (age>=70) {
			System.out.println("nghi huu di ");
		}
		else if(age>=18) {
			System.out.println("truong thanh");
		}
		else if(age<0) {
			System.out.println("chua sinh");
		}
		else {
			System.out.println("tre trau");
		}
		
		if(deptrai) {
			System.out.println("may dep trai");
		}
		else {
			System.out.println("may khong dep trai");
		}
		scanner.close();
	}
}
