
public class TestFor {

	public static void main(String[] args) {
		
		//i:計數器,無窮迴圈
		int sum = 0;//記錄總和
		for( int i = 101 ;  i <=100   ; i++  ) {
			if ( i%2 == 0) {
				continue;
			}
			
			if ( i >= 50 ) {
				break;//迴圈立即停止
			}
			System.out.println(i);
			sum = sum + i;
		}
		System.out.println("Sum = "+ sum);
		//System.out.println("finally i = "+i);
		
		int i = 0;
		sum = 0 ;
		//int sumOfWhile = 0 ;
		while ( i <= 100 ) {
			sum += i;
			//sumOfWhile += i;
			i++;
		}
//		System.out.println("SumOfWhile = "+ sumOfWhile);
		System.out.println("SumOfWhile = "+ sum);
		
		i = 101;
		int sumOfDoWhile = 0 ;
		do {
			sumOfDoWhile += i;
			i++;
		}while( i<= 100);
		System.out.println("SumOfDoWhile = "+sumOfDoWhile);
		

	}

}













