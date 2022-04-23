
public class Test9x9 {

	public static void main(String[] args) {
		//ixj
		//1x1=1 1x2=2 ...  1x9=9
		//2x1=2 2x2=4 ...  2x9=18
		//9x1=9 9x2=18 ... 9x9=81
		
		for (int i = 1; i<= 9 ; i++ ) {
			//F6
			for( int j=1; j <=9 ; j++) {
				//sout
				System.out.print(i + "x" + j + "=" + i*j + "\t");//ln:line
			}
			System.out.println();
		}
		
		
		for(int i = 1 ; i<= 1_000_000 ; i++) {
			
		}
		
	}

}
