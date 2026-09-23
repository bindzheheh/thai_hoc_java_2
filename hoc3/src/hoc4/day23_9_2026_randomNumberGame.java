package hoc4;
import java.util.Scanner;
import java.util.Random;
public class day23_9_2026_randomNumberGame {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int maxx;
		int minn;
		int guess;
		int attempts=2;
		int randomnumber;
		System.out.println("Start the random number guessing game");
		System.out.print("You want to select the smallest random number from :");
		minn = scanner.nextInt();
		System.out.print("You want to select the largest random number from :");
		maxx = scanner.nextInt();
		randomnumber=random.nextInt(minn,maxx+1);
		System.out.print("Enter a guess :");
		guess = scanner.nextInt();
		
		do{
			if(randomnumber>guess) {
				System.out.println("TOO LOW :");
				System.out.print("Enter a guess :");
				guess = scanner.nextInt();
				System.out.println("Attempts :" + attempts);
				attempts++;
			}
			else if (randomnumber<guess) {
				System.out.println("TOO HIGT :");
				System.out.println("Enter a guess :");
				guess = scanner.nextInt();
				System.out.print("Attempts :" + attempts);
				attempts++;
			}
			
			
		}while(guess != randomnumber) ;
		
		
		System.out.println("correct number :" + guess);
		System.out.println("Attempts :" + attempts);
		
		
		scanner.close();
		
	}

}
