
public class TestStringBuilder {

	public static void main(String[] args) throws InterruptedException {

//		String temp = "";
//		for (int i = 0; i < 1_000_000_000; i++) {
//			temp = temp + i;// 在heap區產生新的文字, new String("...")
//			Thread.sleep(10);
//			// i=0, temp = "" + 0 = "0"
//			// i=1, temp = "0" + 1 = "01"
//			// i=2, temp = "01" + 2 = "012"
//		}
//		System.out.println(temp);

		// StringBuilder
		StringBuilder sb = new StringBuilder();
		for(int i=0 ; i < 1_000_000 ; i++) {
			Thread.sleep(100);
			sb.append(i);//不會額外新生新的String物件
		}
		
		System.out.println(sb.toString());

	}

}
