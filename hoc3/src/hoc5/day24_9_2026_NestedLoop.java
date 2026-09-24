package hoc5;
import java.util.Scanner;
public class day24_9_2026_NestedLoop {
	public static void main(String[]args) throws InterruptedException{
		Scanner scanner = new Scanner(System.in);
		int columns;
		int rows;
		String symbol;
		System.out.print("Enter the rows you want :");
		rows =scanner.nextInt();
		System.out.print("Enter the columns you want :");
		columns =scanner.nextInt();
		scanner.nextLine();
		
		
		System.out.print("Enter the characters you want :");
		symbol =scanner.nextLine();
		
			
		if(symbol.length()>=2) {
			System.out.print("only one character ");
		}
		else if(symbol.isEmpty()) {
			System.out.print("pls enter character ");
		}
		else if(columns==0 || rows==0) {
			System.out.print("pls enter number >0");
		}
		else if(symbol.length()==1) {
			for(int i=0;i<rows;i++) {
				for(int j=0;j<columns;j++) {
					System.out.print(symbol);
					Thread.sleep(50);
				}
				System.out.println();
		}										
		}								
		scanner.close();
	}

}
