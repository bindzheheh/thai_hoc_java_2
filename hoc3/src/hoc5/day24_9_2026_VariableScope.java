package hoc5;
//local>class ****************
public class day24_9_2026_VariableScope {
	static int test =5;//dùng cho toàn bộ nhưng vẫn bị thay thế (class)
	static int test2=4;
	public static void main(String[]args) {
		int test=11;//(local))
		System.out.println(test);//có thể thay thế 
		testshow();//có thể thay thế 
		System.out.println(test2);
	}
	static void testshow() {
		int test=10;//(local)
		System.out.println(test);
	}

}
