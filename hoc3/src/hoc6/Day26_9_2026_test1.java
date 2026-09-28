package hoc6;
import java.util.Scanner;
public class Day26_9_2026_test1 {
	static Scanner scanner =new Scanner(System.in);
	public static void main(String[]args) {
		int choice;
		double sum=0;
		int size;		
		double[] so;
		int a=1;
		System.out.print("nhap 1:de tinh tong\nnhap 2:de tinh trung binh\nso ban nhap :");
		choice=scanner.nextInt();
		System.out.print("so luong ban muon tinh :");
		size=scanner.nextInt();
		so = new double[size];
		if (choice==1) {
			for(int i=0;i<so.length;i++) {
				System.out.printf("nhap so thu %d :",a);
				so[i]=scanner.nextDouble();
				a++;
				sum+=so[i];
			}
			System.out.printf("ket qua la %.1f :",sum);
		}
		else if(choice==2) {
			for(int i=0;i<so.length;i++) {
				System.out.printf("nhap so thu %d :",a);
				so[i]=scanner.nextDouble();
				a++;
				sum+=so[i];
			}
			System.out.printf("ket qua la %.1f :",sum/so.length);
		}
		scanner.close();
	}	
}
