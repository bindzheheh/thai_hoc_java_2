package hoc6;
import java.util.Scanner;
public class Day26_9_2026_Arrays3 {
	static Scanner scanner =new Scanner(System.in);
	public static void main(String[]args) {
		String[] list3;
		int[] list;
		int size;
		int a=1;
		int b=1;
		int tim;
		String tim2;
		boolean thoa=false;
		System.out.print("nhap so luong :");
		size=scanner.nextInt();
		
		list=new int[size];
		for(int i=0;i<list.length;i++) {
			System.out.printf("nhap 1 con so lan thu %d :",b);
			list[i]=scanner.nextInt();
			b++;
		}
		
		
		scanner.nextLine();
		list3=new String[size];
		for(int i=0;i<list3.length;i++) {
			System.out.printf("nhap nhap gi cung duoc lan thu %d :",a);
			list3[i]=scanner.nextLine();
			a++;
			
			}
		for(int list2 :list) {
			System.out.print(list2+" ");
		}
		System.out.println();
		for(String list4 :list3) {
			System.out.print(list4+" ");
		}
		
		System.out.println();
		
		System.out.print("nhap gi do muon tim vi tri :");
		tim2 =scanner.nextLine();
		for(int j=0;j<list3.length;j++) {
			if(list3[j].equals(tim2)) {
				System.out.print("vi tri no o :"+j);
				thoa=true;
				break;
			}
		}
		if(!thoa) {
			System.out.print("khong co trong danh sach");
		}
		System.out.println();
		System.out.print("nhap so muon tim vi tri :");
		tim =scanner.nextInt();
		for(int j=0;j<list.length;j++) {
			if(tim==list[j]) {
				System.out.print("vi tri no o :"+j);
				thoa=true;
				break;
			}
		}
		
		
		
		
		if(!thoa) {
			System.out.print("khong co trong danh sach");
		}
		
		
		scanner.close();
	}

}
