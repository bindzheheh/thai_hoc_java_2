package hoc5;
import java.util.Scanner;
import java.util.Random;
public class day24_9_2026_RandomDice {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[]args) {
		Random random = new Random();
		int total=0;
		int solan=1;
		int numOfDice;
		System.out.print("nhap so lan tung xuc xac :");
		numOfDice=scanner.nextInt();
		if(numOfDice>0) {
			System.out.printf("so lan ban tung la :%d\n",numOfDice);
			for(int i=0;i<numOfDice;i++) {
				int roll=random.nextInt(1,7);
				System.out.printf("lan thu %d :%d\n",solan,roll);
				print(roll);
				total +=roll;
				solan++;
			}
			
		}
		else {
			System.out.printf("nhap so lon hon 0 pls");
		}
		
		
		System.out.print("tong :"+total);
		scanner.close();
	}
static void print(int roll) {
	String dice1="""
			________
			|       |
			|       |
			|   😂  |
			|       |
			|_______|
			""";
	String dice2="""
			________
			|       |
			|   😂  |
			|       |
			|   😂  |
			|_______|
			"""	;
	String dice3="""
			________
			|       |
			|   😂  |
			|   😂	|
			|   😂  |
			|_______|
			"""	;
	String dice4="""
			________
			|       |
			|😂 😂  |
			|       |
			|😂 😂  |
			|_______|
			"""	;
	String dice5="""
			________
			|       |
			| 😂 😂 |
			|  😂   |
			| 😂 😂 |
			|_______|
			"""	;
	String dice6="""
			________
			|       |
			|😂 😂  |
			|😂 😂  |
			|😂 😂  |
			|_______|
			"""	;
	switch(roll) {
	case 1->System.out.println(dice1);
	case 2->System.out.println(dice2);
	case 3->System.out.println(dice3);
	case 4->System.out.println(dice4);
	case 5->System.out.println(dice5);
	case 6->System.out.println(dice6);
	}
}
}
