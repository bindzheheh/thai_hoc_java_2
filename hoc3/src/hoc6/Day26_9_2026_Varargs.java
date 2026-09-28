package hoc6;
import java.util.Scanner;
public class Day26_9_2026_Varargs {
	static Scanner scanner =new Scanner(System.in);
	public static void main(String[]args) {
		
		System.out.println(cong(324,545,646,6,65,656,66,56,56,5));	
		System.out.print(trungbinh(100,5,54,54,5,45,454,54,32));

		
		
		
		scanner.close();
	}
static double cong(double...cong2) {
	double sum=0;
	if(cong2.length==0) {
		return 0;
	}
	for (double cong3:cong2) {
		sum+=cong3;
	}
	return sum;
}
static double trungbinh(double...trungbinh2) {
	double sum1=0;
	if(trungbinh2.length==0) {
		return 0;
	}
	for (double trungbinh3:trungbinh2) {
		sum1+=trungbinh3;
	}
	return sum1/trungbinh2.length;
}
}
