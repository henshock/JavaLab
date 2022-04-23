package func;

public class TestFunc {
	
	
	
	public static void main(String[] args) {
		
		add(1,2);
		//System.out.println("Sum="+sum);
		
		//0 1 1 2 3 5 8 13 18 23 41 .....
		

	}
	
	//二個整數相加   回傳型態  方法名稱  參數,輸入值      :方法的定義
	public static  void    add    (int a, int b) {
		//方法實作
		int s = a + b;
		System.out.println(s);
		//return s; //void不需要有return
	}
	
	
	
	

}
