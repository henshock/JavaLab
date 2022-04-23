package exception;

public class TestException {

	public static void main(String[] args) {
		//try {
			int a = 1;
			int c = 1;
			System.out.println("c=" + c);
			int b = a / c;
			System.out.println("b="+b);
			int[] x = {};
			System.out.println(x[0]);//ArrayIndexOutOfBoundException
		//}catch(ArithmeticException | ArrayIndexOutOfBoundsException  ex) {
		//	ex.printStackTrace();
		//}catch(Exception ex) {//攔下其它有可能的錯誤
		//	ex.printStackTrace();
		//}finally {
		//	System.out.println("一定會被執行的!");
		//}
		//System.err.println("this is error");
		System.out.println("done");
	}

}
