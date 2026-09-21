package hoc1;
import java.util.Scanner;
public class ngay21_9_2026_string {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		String name ="    thaideptrai    ";
		String name2;
		
		int length = name.length();
		System.out.println(length);
		char letter = name.charAt(5);
		System.out.println(letter);
		int index =name.indexOf("t");
		System.out.println(index);
		int lastindex=name.lastIndexOf("t");
		System.out.println(lastindex);
		name=name.toUpperCase();
		System.out.println(name);
		name=name.toLowerCase();
		System.out.println(name);
		name=name.trim();
		System.out.println(name);
		name=name.replace("i", "o");
		System.out.println(name);
		System.out.println(name.isEmpty());
		System.out.print("------------------------------\n");
		System.out.print("nhap ten cua ban :");
		name2 =scanner.nextLine();
		if(name2.isEmpty()) {
			System.out.println("please enter your name ");
		}
		else {
			if(name2.contains(" ")) {
				System.out.println("your name contains spaces");
				name2=name2.replace(" ", "_");
				System.out.println("your name is :" +name2 );
			}
			else {
				System.out.println("your name is :" +name2 );
			}
			
		}
		
		
		
		
		scanner.close();
	}

}
