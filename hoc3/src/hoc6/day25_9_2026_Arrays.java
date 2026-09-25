package hoc6;
import java.util.Arrays;
public class day25_9_2026_Arrays {
	public static void main(String[]args) {
		String[] list = {"a","2","d","b","e","5","1"};
		System.out.println(list[5]);
		for(int i=0;i<list.length;i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
		for(String lits1 :list) {
			System.out.print(lits1 + " ");
		}
		Arrays.sort(list);
		System.out.println();
		for(String lits1 :list) {
			System.out.print(lits1 + " ");
		}
		list[2]="3";
		list[6]="c";
		Arrays.sort(list);
		System.out.println();
		for(String lits1 :list) {
			System.out.print(lits1 + " ");
		}
		System.out.println();
		Arrays.fill(list, "bin");
		for(int i=0;i<list.length;i++) {
			System.out.print(list[i] + " ");
		}
		
	}

}
