package hoc1;
import java.util.Scanner;
public class ngay21_9_2026if_in_if {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		boolean studen;
		boolean difficult;
		double price=15000000;
		System.out.print("you are studen ? (true/false):");
		studen=scanner.nextBoolean();
		System.out.print("you are poor ? (true/false) :" );
		difficult=scanner.nextBoolean();
		if(studen) {
			if(difficult) {
				System.out.println("You get a discount: 20%");
				System.out.println("You get a discount: 10%");
				price*=0.7;
			}
			else {
				System.out.println("You get a discount: 10%");
				price*=0.9;
			}
		}
		else {
			if(difficult) {
				System.out.println("You get a discount: 20%");
				price*=0.8;
			}
			else{
				System.out.println("You get a discount: 0%");
				price*=1;
			}
		}
		
		System.out.printf("the amount to be paid is :%.2f",price);
		
		scanner.close();
	}

}
