package hoc5;
import java.util.Scanner;
public class day24_9_2026_Methods {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		String name;
		double testnumber=10;
		double testnumber2=14;
		System.out.print("Enter your name :");
		name=scanner.nextLine();
		
		xinchao(name);
		xinchao(name);
		System.out.println(khen(name));
		System.out.println("------------------------------");
		System.out.print(multiply(testnumber,testnumber2));
		int age;
		System.out.println("------------------------------");
		System.out.print("enter your age :");
		age=scanner.nextInt();
		if(agecheck(age)) {
			System.out.println("đã đủ tuổi");
		}
		else {
			System.out.println("chưa đủ tuổi");
		}
		scanner.close();
	}
	static void xinchao(String name) {
		System.out.printf("your name is:%s\n",name);
	}
	static double multiply(double test,double test2) {
		return test*test2;
	}
	static String khen(String name) {
		return "hello " + name+ " i guess you so handsome";
	}
	static boolean agecheck(int age) {
		if(age>=18) {
			return true;
		}
		else {
			return false;
		}
	
	}
}
