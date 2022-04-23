package array;

public class TestArray {

	public static void main(String[] args) {
		int  a = 1;
		System.out.println(a);
		
		//int[] ages = new int[10];//陣列是物件,new, index:0..9
		int[] ages = {1,2,3,4};//copy: ctrl+alt+down
		ages[0] = 1;
		ages[1] = 2;
		ages[2] = 3;//設定陣列中的值[index],index是0起算
		System.out.println(ages[2]);//取值
		System.out.println(String.format("陣列長度=%d", ages.length));
		System.out.printf("陣列長度=%d%n", ages.length);
		//printf = System.format,不會自動換行,所以會自己加%n
		System.out.println(ages[3]);//陣列在產生的時候會有預設值
		//System.out.println(ages[10]);//ArrayIndexOutOfBoundsException
		ages = null;
		
//		int[][] x = new int[5][4];
		int[][] x = { {1,2,3}  ,  {4,5,6}  ,  {7,8,9}  };//二維陣列,每一排都一個陣列
		x[0][0] = 1;
		x[1][0] = 2;
		x[2][0] = 3;
		System.out.println(x[1][0]);
		System.out.println("總共有"+x.length+"排");
		System.out.println("第0排有"+x[0].length+"個");//x[0]表示第一排
		//i表示第幾排
		
		for(int i = 0; i <  x.length ; i++) {
			//move:alt+up or down
			//小於那一排個數,< x[i].length 
			for(int j=0 ; j  < x[i].length ;j++ ){
				System.out.printf("x[%d][%d]=%d ",i,j,x[i][j]);
			}			
			System.out.println();
		}
		//numbers是int[],每一個元素都是int
		int[] numbers = {1,2,3,4,5,6,7,8,9};
		// numbers[0] 都會是int
		for( int item    : numbers  ) {
			System.out.println(item);
		}
		System.out.println("======================");
		//x[0] ->
		for( int[] row  :   x ) {
			//System.out.println(row);
			//row[0]
			for( int item  : row  ) {
				System.out.println(item);
			}
		}
		
	}

}























