package hoc6;
import java.util.Scanner;
import java.util.Arrays;
public class day25_9_2026_Arrays2 {
	static Scanner scanner =new Scanner(System.in);
	public static void main(String[]args) {
		String[] list;
		int size;
		int a=1;
		System.out.print("nhap so luong :");
		size=scanner.nextInt();
		scanner.nextLine();
		list=new String[size];
		for(int i=0;i<list.length;i++) {
			System.out.printf("nhap gi cung duoc lan thu %d :",a);
			list[i]=scanner.nextLine();
			a++;
		}
		Arrays.sort(list);
		System.out.print("[");
		for(String list2 :list) {
			
			System.out.print(list2 + " ");
			
		}
		System.out.print("]");
		
		
		scanner.close();
	}

}
