package exception;

public class Lab4 {

	public static void main(String[] args) {
		int j = 1;
		try {
			int a = hello() / (j = 2);// 2 / (j=2) => 2/2
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(j);
		}
		System.out.println(j);

	}

	private static int hello() throws Exception {
		return 2;
		//throw new Exception();
	}

}
