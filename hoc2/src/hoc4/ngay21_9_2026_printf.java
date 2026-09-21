package hoc4;

public class ngay21_9_2026_printf {
	public static void main(String[]args) {
		String name ="okokhihi";
		int age =18;
		int age1 =234;
		int age2 =2609;
		double gia = 19.5;
		boolean chuan = true;
		double so1 = 10.5;
		double so2 = 1000.5;
		double so3 = -9.5;
		System.out.printf("toi ten la: %s\n",name);   //cach dung
		System.out.printf("toi %d tuoi\n",age);
		System.out.printf("co gia la %f nghin dong\n",gia);
		System.out.printf("toi dep trai khong %b\n",chuan);
		System.out.printf("toi ten %s va toi %d tuoi ,toi mua do co gia %f ,toi dep trai %b\n",name,age,gia,chuan);
		System.out.print("------------------------------\n");
		System.out.printf("%.1f\n",so1);//chinh sau so thap phan
		System.out.printf("%.2f\n",so2);
		System.out.printf("%.1f\n",so3);
		System.out.printf("%.3f\n",so1);
		System.out.print("------------------------------\n");
		System.out.printf("%+.1f\n",so1);//hien dau
		System.out.printf("%+.2f\n",so2);
		System.out.printf("%+.1f\n",so3);
		System.out.print("------------------------------\n");
		System.out.printf("%,.1f\n",so1);//hien so chia don vi
		System.out.printf("%,.2f\n",so2);
		System.out.printf("%,.1f\n",so3);
		System.out.print("------------------------------\n");
		System.out.printf("%(.1f\n",so1);//so nao am dong ngoac
		System.out.printf("%(.2f\n",so2);
		System.out.printf("%(.1f\n",so3);
		System.out.print("------------------------------\n");
		System.out.printf("% .1f\n",so1);//cho bang nhau
		System.out.printf("% .2f\n",so2);
		System.out.printf("% .1f\n",so3);
		System.out.print("------------------------------\n");
		System.out.printf("%5.1f\n",so1);
		System.out.printf("%4d \n",age);
		System.out.printf("%3d\n",age2);
		System.out.print("------------------------------\n");
		System.out.printf("%08d\n",age);
		System.out.printf("%05d\n",age1);
		System.out.printf("%8d\n",age2);
		System.out.print("------------------------------\n");
		System.out.printf("%-4d hihi\n",age1);
		System.out.printf("%-4d hihi\n",age);
		System.out.printf("%-4d hihi\n",age2);
			}

}
