package hoc6;

public class Day27_9_2026_2DArrays {
	public static void main(String[]args) {
		String[][] list = {{"1","2","3"},{
							"4","5","6"},{
							"7","8","9"},{
							"*","0","#"}
		};
		
	for (String[]list2 :list) {
		for(String list3:list2) {
			System.out.print("|"+list3+"|");
		}
		System.out.println();
	}
	}
				
}



