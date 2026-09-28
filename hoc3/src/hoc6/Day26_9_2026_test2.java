package hoc6;
import java.util.Scanner;
public class Day26_9_2026_test2 {
	static Scanner scanner =new Scanner(System.in);
	public static void main(String[]args) {
		int choice;
		System.out.print("nhap 1:de tinh tong\nnhap 2:de tinh trung binh\nso ban nhap :");
		choice=scanner.nextInt();
		if(choice==1) {
			System.out.print("ket qua la :"+tong());
		}
		else if (choice==2) {
			System.out.print("ket qua la :"+trungbinh());
		}
		else {
			System.out.print("vui long chon dung so ");
		}
		scanner.close();
	}
static double tong () {
	double sum=0;
	int size;
	int a=1;
	double[] list;
	System.out.print("nhap so luong muon tinh :");
	size =scanner.nextInt();
	list=new double[size];
	for(int i=0;i<list.length;i++) {
		System.out.printf("nhap so thu %d :",a);
		list[i]=scanner.nextDouble();
		a++;
		sum+=list[i];
	}
	return  sum;
}
static double trungbinh() {
	double sum=0;
	int size;
	int a=1;
	double[] list1;
	double tinh;
	System.out.print("nhap so luong muon tinh :");
	size =scanner.nextInt();
	list1=new double[size];
	for(int i=0;i<list1.length;i++) {
		System.out.printf("nhap so thu %d :",a);
		list1[i]=scanner.nextDouble();
		a++;
		sum+=list1[i];
	}
	tinh =sum/list1.length;
	return tinh;
}
}
