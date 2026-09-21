package hoc3;
import java.util.Random;
public class ngay20_9_2026_random {
	public static void main(String[]args) {
		
		Random random =new Random();
		int number1;
		int number2;
		int number3;
		int number4;
		boolean dongxu;
		number1 = random.nextInt(1,7);
		number2 = random.nextInt(1,7);
		number3 = random.nextInt(1,7);
		dongxu = random.nextBoolean();
		number4=number1 + number2 +number3;
		System.out.print(number1 + "  ");
		System.out.print(number2 + "  ");
		System.out.print(number3 + "  ");
		if(number4%2==0) {
			System.out.println("chan");
			
		}
		else {
			System.out.println("le");
		}
		if(dongxu) {
			System.out.print("mat ngua");
		}
		else {
			System.out.print("mat sap");
		}
	}

}
