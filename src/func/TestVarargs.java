package func;

public class TestVarargs {

	public static void main(String... args) {
		
		
		add(1);
		add(1,2);
		add(1,2,3);
		System.out.println("done");

	}
	
	public static int add(int... a) {
		int sum = 0 ;
		for (int i : a) {
			sum += i;
		}
		return sum;
	}
	/*
	public static int add(int a,int b) {
		return 0;
	}
	public static int add(int a,int b ,int c) {
		return 0;
	}
	*/

}
