package hoc7;
import java.util.Scanner;
import java.util.Random;
public class Day27_9_2026_keobuabao {
	static Scanner scanner =new Scanner(System.in);
	public static void main(String[]args) {
		Random random =new Random();
		String[] chon= {"keo","bua","bao"};
		String may;
		String nguoi;
		String tiep2;
		boolean tiep=true;
		int thua=0;
		int thang=0;
		int hoa=0;
		while(tiep) {
		System.out.print("chon di (keo,bua,bao):");
		nguoi=scanner.nextLine().toLowerCase();
		if(!nguoi.equals("keo")&&!nguoi.equals("bua")&&!nguoi.equals("bao")) {
			System.out.println("chon lai");
		}
		may=chon[random.nextInt(3)];
		System.out.printf("đối thủ chọn :%s\n",may);
		if(nguoi.equals(may)) {
			System.out.println("hòa");
			hoa++;
		}
		else if((nguoi.equals("keo")&&may.equals("bao"))||
				(nguoi.equals("bao")&&may.equals("bua"))||
				(nguoi.equals("bua")&&may.equals("keo"))) {
			System.out.println("thắng");
			thang++;
		}
		else {
			System.out.println("thua");
			thua++;
		}
		System.out.print("choi tiep khong(co/khong):\nnhấn (enter) để chơi tiếp hoặc nhấn (khong) để hủy!!!");
		tiep2=scanner.nextLine();
		if(tiep2.equals("khong")) {
			tiep=false;
		}
		
		}
		System.out.printf("kết quả thắng:%d,hòa:%d,thua:%d",thang,hoa,thua);
		scanner.close();
	}

}
