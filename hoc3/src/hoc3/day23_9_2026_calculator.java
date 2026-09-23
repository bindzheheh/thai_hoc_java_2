package hoc3;
import java.util.Scanner;
public class day23_9_2026_calculator {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		double number1;
		double number2;
		double result=0;
		String operator;
		boolean idk=true;
		System.out.print("Enter your first number 1 :");
		number1=scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Enter operation (+,-,^,/) :");
		operator=scanner.nextLine();
		System.out.print("Enter your second number 2 :");
		number2=scanner.nextDouble();
		switch(operator) {
		case "+" -> result=number1+number2;
		case "-" -> result=number1-number2;
		case "^" -> result=Math.pow(number1,number2);
		case "/" -> {
			if (number2==0) {
				System.out.printf("Errol0Divine because number 2 = %.0f", number2);
				idk=false;
			}
			else {
				result=number1/number2;
			}
		
		
		}
		default->{
			System.out.print("errolOperation");
			idk=false;
		}
		}
		if(idk)
		{
			
			System.out.print("result = "+result);
		}
	
		
		
		
		
		
		
		scanner.close();
	}

}
