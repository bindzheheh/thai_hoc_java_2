package hoc5;
import java.util.Scanner;
public class day24_9_2026_BankingProgram {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[]args) {
		double money=0;
		boolean right=true;
		int choice;
		while(right) {
		System.out.println("Banking program");
		System.out.println("-------------------------------");
		System.out.println("1:to check money ");
		System.out.println("2:to add money ");
		System.out.println("3:to spend money ");
		System.out.println("4:to exit ");
		System.out.println("-------------------------------");
		System.out.print("you choice : ");
		choice=scanner.nextInt();
		System.out.println("-------------------------------");
		switch(choice) {
		case 1 -> show(money);
		case 2 -> money= add(money);
		case 3 ->money= spend(money);
		
		case 4 -> right=false;
		default ->System.out.println("pls choice 1-4");
		}
		}
		System.out.println("-------------------------------");
		System.out.print("thank you for playing game ");
		
		scanner.close();
	}
	
	static void show (double showmoney) {
		System.out.printf("your money %.2f :\n",showmoney);
		System.out.println("-------------------------------");
	}
	
	static double add (double add2) {
		double amount;
		System.out.print("add money :");
		amount=scanner.nextDouble();
		System.out.println("-------------------------------");
		if (amount<0) {
			System.out.println("pls add corract money");
			return add2;
		}
		else {
			return amount + add2;
		}
	}
	static double spend (double spend2) {
		double amount;
		System.out.print("spend money :");
		amount=scanner.nextDouble();
		System.out.println("-------------------------------");
		if (amount<0) {
			System.out.println("pls spend corract money");
			return spend2;
		
		}
		else if (amount>spend2) {
			System.out.println("you dont have money ");
			return spend2;
		}
		else {
			return spend2-=amount;
	}
}
}