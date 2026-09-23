package hoc4;
import java.util.Scanner;
public class day23_9_2026_logicalsOperators {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		String username;
		System.out.print("Enter your name :");
		username =scanner.nextLine();
		if(username.length()<4 || username.length()>12) {
			System.out.printf("user name must be between 4 - 12 characters");
		}
		else if(username.contains(" ")) {
			username=username.replaceAll(" ", "_");
			System.out.printf("Since the username contains a space, it has been changed to %s",username);
		}
		else {
			System.out.printf("your name is : %s ",username);
		}
		
		
		
		
		
		scanner.close();
	}
}
