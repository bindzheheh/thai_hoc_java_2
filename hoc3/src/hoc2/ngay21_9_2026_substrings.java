package hoc2;
import java.util.Scanner;
public class ngay21_9_2026_substrings {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		String email;
		System.out.print("Enter your email :");
		email=scanner.nextLine();
		if(email.contains(" ")) {
			System.out.print("The email address must not contain spaces");
		}
		else {
			if(email.contains("@")) {
				String username = email.substring(0,email.indexOf("@"));
				System.out.printf("your name is %s\n", username);
				String domain = email.substring(email.indexOf("@")+1);
				System.out.printf("your domain is %s\n", domain);
			}
			else {
				System.out.print("Your email address must contain the @ character.");
			}
		}
		
		
		
		
		
		scanner.close();
	}

}
